package com.maven.project.LoraMavenJune;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest 
{
  public static  WebDriver driver;
  
  public static FileInputStream fis;
  
  public static String projectpath=System.getProperty("user.dir");
  
  public static Properties p;
  
  public static Properties parentinstance ;
  
  public static Properties childinstance;
  
  public static Properties orprop;
  
  public static ExtentReports report;
  
  public static ExtentTest test;
  
  
  public static void  init() throws Exception 
    {
	 //fis= new FileInputStream(System.getProperty("user.dir")+"//data.properties");
	  fis=new FileInputStream(projectpath + "//Data.properties");
	  p=new Properties();
	  p.load(fis);
	  fis=new FileInputStream(projectpath + "//environment.properties");
	  
	  parentinstance=new Properties();
	  
	  parentinstance.load(fis);
	  
	 String e = parentinstance.getProperty("env");
	 System.out.println(e);
	 
	 fis=new FileInputStream(projectpath + "//" + e + ".properties");
	 childinstance=new Properties();
	 childinstance.load(fis);
	 String child = childinstance.getProperty("amazonurl");
	 System.out.println(child);
	 
	 fis=new FileInputStream(projectpath + "//or.properties");
	 orprop=new Properties();
	 orprop.load(fis);
	
	 fis=new FileInputStream(projectpath + "//Log4jconfig.properties");
	 PropertyConfigurator.configure(fis); 
	 
	 
	  report = ExtentManager.getInstance();
	 
	  
  }
   
	public static void LaunchBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Desktop\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions op=new ChromeOptions();
			op.addArguments("user-data-dir=C:\\Users\\srika\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		    op.addArguments("--disable-notifications");
			driver= new ChromeDriver(op);
			
		}
		else if(browser.equalsIgnoreCase("firefox"))	
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\srika\\Desktop\\Selenium drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile = p.getProfile("juneFFprofile");
			FirefoxOptions option =new FirefoxOptions();
			option.setProfile(profile);
			option.addPreference("dom.webnotifications.enabled", false);
			
		    driver= new FirefoxDriver(option);
		    
		}
		
	}


	
	

	public static void navigateurl(String url)

	{

		
		  String urlname = p.getProperty(url); 
		  System.out.println(urlname);
		  
		  driver.navigate().to(urlname);
		 
	 

	}
	public static WebElement getElement(String locatorkey) 
	{
		
		WebElement element=null;
		
		if(locatorkey.endsWith("_id"))
		{
	     element=  driver.findElement(By.id(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_name"))
		{
			element=  driver.findElement(By.name(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_classname"))
		{
			element=  driver.findElement(By.className(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_xpath"))
		{
			element=  driver.findElement(By.xpath(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_css"))
		{
			element=  driver.findElement(By.cssSelector(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_linktext"))
		{
		
			element=  driver.findElement(By.linkText(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_partiallinktext"))
		{
			element=  driver.findElement(By.partialLinkText(orprop.getProperty(locatorkey)));
		}
		else if(locatorkey.endsWith("_tagname"))
		{
			element=  driver.findElement(By.tagName(orprop.getProperty(locatorkey)));
		}
		return element;
	
	}
	
	
	
	public static void clickElement(String locatorkey) 
	{
		getElement(locatorkey).click();
		
		
		
		//driver.findElement(By.xpath(Locatorkey)).click();
		
	}

	

	public static void typeText(String locatorkey, String text) 
	{
		getElement(locatorkey).sendKeys(text);
		//driver.findElement(By.id(Locatorkey)).sendKeys(text);
		
	}

	public static void selectOption(String locatorkey, String item) 
	{
		
		getElement(locatorkey).sendKeys(item);
		//driver.findElement(By.id(locatorkey)).sendKeys(item);
		
		
	}

	
}
