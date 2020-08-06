package com.maven.project.LoraMavenJune;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TC_002  extends BaseTest
 {
	
  @BeforeMethod
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  
  {
	  init();
	  test = report.startTest("TC_006");
	  test.log(LogStatus.INFO, "initilizing the property files ...........");
	  LaunchBrowser(bType);
	  test.log(LogStatus.PASS, "initiliaing the browsers"+ p.getProperty("chromebrowser"));
	  navigateurl("amazonurl");
	  test.log(LogStatus.PASS, "Navigating to url"+ p.getProperty("amazonurl"));
	  
	 
	  
  }

  @Test
  public void amazon() 
  {
	  selectOption("searchDropdownBox_id", "Books" );
	  test.log(LogStatus.PASS, "Entering the text into the text box using the locator :-"+orprop.getProperty("amazonsearchtext_name"));
		
	  typeText("amazonsearchtext_name", "Harry potter");
	  test.log(LogStatus.PASS,"enter the text in the search box :" +  orprop.getProperty("amazonsearchbutton_xpath"));
		
	  clickElement("amazonsearchbutton_xpath");
	  
	  test.log(LogStatus.PASS,"click on the seach button using the locator :" +  orprop.getProperty("searchDropdownBox_id"));
	  	
					
  }
 @AfterMethod
 public void endProcess()
 {
	 if(driver!=null)
		driver.quit();
	 if(report!=null)
		 
	   report.endTest(test);
	   report.flush();
	 
 }
 
 }

