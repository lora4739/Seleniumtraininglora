package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Login 
{
	WebDriver driver;
	
  @BeforeMethod
  public void startProcess()
  
  {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Desktop\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  
	  
  }
  
  @Test
  public void login() throws InterruptedException
  
  {
		/*
		 * driver.findElement(By.linkText("Sign in")).click(); Thread.sleep(3000);
		 * driver.findElement(By.id("email")).sendKeys("qatest87878766@gmail.com");
		 * driver.findElement(By.id("passwd")).sendKeys("password");
		 * driver.findElement(By.id("SubmitLogin")).click(); WebElement actual =
		 * driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]"
		 * )); String Actualerror = actual.getText(); String expected =
		 * "Authentication failed."; // Assert.assertEquals(expected, actual);
		 * Assert.assertEquals(Actualerror, "Authentication failed.");
		 */
	  
	  
	  
	  LoginPage lp =new LoginPage(driver);
	  lp.customerLogin();
	  Assert.assertEquals(lp.getCustomerverification(),"Authentication failed." );
	  
			             
			  
	
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
	  
  }
  

}
