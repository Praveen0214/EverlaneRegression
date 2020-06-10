package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"}, glue= {"com.stepdefinition"}, monochrome=true, 
plugin= {"html:Reports", "json:Reports//output.json", "rerun:src\\test\\resources\\failedSceanrio.txt"})
public class LoginTestRunner {
	
	@AfterClass
	public static void jvmReportGeneration() {
	JvmReports.generateReports("json:Reports//output.json");
	
	
	}
	
	
		
	}
	


