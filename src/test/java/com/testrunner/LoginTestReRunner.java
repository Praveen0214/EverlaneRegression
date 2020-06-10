package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"@src\\test\\resources\\failedSceanrio.txt"}, glue= {"com.stepdefinition"}, monochrome=true, plugin= {"html:Reports", "json:Reports//output.json"})
public class LoginTestReRunner {
	
	
}
