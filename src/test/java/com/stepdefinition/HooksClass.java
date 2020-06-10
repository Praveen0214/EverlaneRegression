package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.EverBaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksClass extends EverBaseClass {
	
	@Before
	public void beforeEx() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		launchBrowser("https://www.everlane.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);	
	}
@After

public void afterEx(Scenario scenario) {
	
	if(scenario.isFailed()) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
	scenario.embed(screenshot, "image/png");	
	}
	
	
	driver.close();
}




}
