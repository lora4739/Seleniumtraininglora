package com.maven.project.LoraMavenJune;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC_001 {
  @Test(priority = 1)
  public void f() 
  {
	System.out.println("in f");  
  }
  
  @Test(priority = 2)
  public void a() 
  {
	System.out.println("in a");  
  }
  
  @Test(priority = 3, enabled = false)
  public void z() 
  {
	System.out.println("in z");  
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	System.out.println("before method");  
  }

  @AfterMethod
  public void afterMethod() 
  {
	System.out.println("after method");  
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() 
  {
	System.out.println("after test ");  
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	 System.out.println("before suite"); 
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("after suite");
	  
  }

}
