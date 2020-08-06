package com.pagefactory;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount 

{
    public static FileInputStream fis;
	public static Properties d;
	public static String projectpath=System.getProperty("user.dir");
	
	

	@FindBy(linkText = "Sign in") public WebElement signIn;
	@FindBy(id="email_create") public WebElement Emailaddress;
   	@FindBy(id="SubmitCreate") public WebElement createaccount;
   	
   	@FindBy(name="id_gender")  public WebElement Gender;
   	@FindBy(id="customer_firstname") public WebElement firstname;
   	@FindBy(id="customer_lastname")public WebElement lastname;
   	//@FindBy(id="email")public WebElement email;
   	@FindBy(id="passwd")public WebElement password;
   	@FindBy(id="days")public WebElement date;
   	@FindBy(id="months")public WebElement month;
   	@FindBy(id="years")public WebElement year;
   	@FindBy(id="firstname")public WebElement addressfirstname;
   	@FindBy(id="lastname")public WebElement addressLastname;
   	@FindBy(id="company")public WebElement company;
   	@FindBy(id="address1")public WebElement address1;
   	@FindBy(id="address2")public WebElement address2;
   	@FindBy(id="city")public WebElement city;
   	@FindBy(id="id_state")public WebElement state;
   	@FindBy(id="postcode")public WebElement postalcode;
   	@FindBy(id="id_country")public WebElement country;
   	@FindBy(name="other")public WebElement AdditionalInformation;
   	@FindBy(id="phone")public WebElement phone;
   	@FindBy(id="alias")public WebElement aliasaddress;
   	@FindBy(id="submitAccount")public WebElement submit;
   	@FindBy(xpath = "//p[@class='info-account']")public WebElement verification;
   	 	
   	
   	public CreateAccount(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
     		
	}	
   	
   	public void creatingAccount() throws Exception
   	{
   		signIn.click();
   		Thread.sleep(3000);
		//Emailaddress.sendKeys(d.getProperty("userfirstname")+ randNumber() +"@gmail.com"); 
   		randomemail();
   		
   		Emailaddress.sendKeys(randNumber()+d.getProperty("userfirstname")+ "@gmail.com");
		//Emailaddress.sendKeys(email);
   		//Emailaddress.sendKeys("yahahahah2345@gmail.com");
		createaccount.click();
		Thread.sleep(3000);
		Gender.click();
		firstname.sendKeys("lora");
		lastname.sendKeys("choudhury");
		//email.sendKeys("@gmail.com");
		password.sendKeys("password123");
		date.sendKeys("7");
		month.sendKeys("jan");
		year.sendKeys("2000");
		addressfirstname.sendKeys("lc");
		addressLastname.sendKeys("choud");
		company.sendKeys("samsung");
		address1.sendKeys("123 lane");
		address2.sendKeys("telengana");
		city.sendKeys("hyd");
		state.sendKeys("telengana");
		postalcode.sendKeys("30057");
		country.sendKeys("india");
		AdditionalInformation.sendKeys("lalalalalalala");
		phone.sendKeys("123456");
		aliasaddress.sendKeys("123 lndia");
		submit.click();
		verification.getText();
		
   	}
   	
	  public void randomemail() throws Exception
	  {
	  
	  fis=new FileInputStream(projectpath + "//Text.properties"); 
	  d=new Properties(); 
	  d.load(fis); 
	  String email = randNumber()+d.getProperty("userfirstname")+ "@gmail.com"; 
	  System.out.println(email);
	  
	  }
	  public static int randNumber() 
	  {
		  Random r = new Random();
		  int rNum =r.nextInt(99999);
		 return rNum; 
	  }
	  
   	
   	public String verifycreateAccount()
   	{  		
   		
   	return verification.getText();
   				
   	}


}
