package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EverBaseClass {
	
	public static WebDriver driver;
	
	public void launchBrowser(String s) {
		
			driver.get(s);
		
	}
public void clickBtn(WebElement ele) {
	ele.click();
}
public void fill(WebElement ele, String s) {
	ele.sendKeys(s);
	

}	
	
	
	
}
