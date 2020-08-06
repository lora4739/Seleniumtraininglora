package com.pagefactory;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CreateAccountTest {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\Desktop\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");


		}
	

	@Test
	public void Registration() throws Exception 
	{
		CreateAccount ca=new CreateAccount(driver);
		ca.creatingAccount();
		Assert.assertEquals(ca.verification.getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");
		
	}

}
