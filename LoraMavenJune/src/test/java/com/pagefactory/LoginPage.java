package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(linkText = "Sign in") public WebElement signIn;
	@FindBy(id = "email") public WebElement customeremail;
	@FindBy(id="passwd")public WebElement customerpassword;
	@FindBy(id= "SubmitLogin") public WebElement login;
	@FindBy(xpath ="//li[contains(text(),'Authentication failed.')]") public WebElement Loggederror;
	
	
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
     		
	}
	
	public void customerLogin() throws InterruptedException
	{
		
		signIn.click();
		Thread.sleep(3000);
		customeremail.sendKeys("abc@gmail.com");
		customerpassword.sendKeys("password");
		login.click();
		Loggederror.getText();
		
	}
	
	public String  getCustomerverification()
	{
		
		return Loggederror.getText();
		
	}
	
	
	
	
}
