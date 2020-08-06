package com.maven.project.LoraMavenJune;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseTest
{
 public static  ExtentReports extent;


	public static ExtentReports getInstance()
	
	{
		if(extent==null)
		{
			
		
	extent=new ExtentReports(projectpath + "//Reports//" + "report.html");
	extent.loadConfig(new File (projectpath+"extentreportconfig.xml"));
	extent.addSystemInfo("Selenium Language","3.141.59").addSystemInfo("Instance", parentinstance.getProperty("env"));
		}
		
	 return extent;
    }
}