package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.EverBaseClass;
import com.loginpojo.LoginPojoClass;
import com.loginpojo.SearchPojoClass;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends EverBaseClass{
	
	@Given("User enter the everlane home page")
	public void user_enter_the_everlane_home_page() {

		System.out.println("Successfully launch browser");

	}

	@When("User enter the valid username and password")
	public void user_enter_the_valid_username_and_password() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		LoginPojoClass l=new LoginPojoClass();
		
	  
	   clickBtn(l.getLoginBtn());
	   fill(l.getEmail(), "Praveenpbce214@gmail.com");
	   clickBtn(l.getClickcon());
	   fill(l.getPass(), "Praveen@214");	   		

	}

	@When("User click continue button")
	public void user_click_continue_button() {	
LoginPojoClass l=new LoginPojoClass();
		   clickBtn(l.getClicklogin());
	}

	@Then("User successfully signin to place the order")
	public void user_successfully_signin_to_place_the_order() {
		System.out.println("User Successfully signin the everlane");
	}

	@Then("User click the search button in home page")
	public void user_click_the_search_button_in_home_page() {
		Actions a=new Actions(driver);
WebElement search = driver.findElement(By.xpath("//*[contains(text(), 'Search')]"));
a.moveToElement(search).click().perform();		
SearchPojoClass s=new SearchPojoClass();
clickBtn(s.getSearch());

	}

	@When("User enter the product name in search box")
	public void user_enter_the_product_name_in_search_box() {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		Boolean until = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("(//*[@type='search'])[1]"), "Jeans"));
		System.out.println(until);
		SearchPojoClass s=new SearchPojoClass();
		   fill(s.getProductName(), "Jeans");
	}

	@When("User click the product")
	public void user_click_the_product() {
		 SearchPojoClass s=new SearchPojoClass();
		 clickBtn(s.getProductClick());
	}

	@Then("User click the add to bag options")
	public void user_click_the_add_to_bag_options() {
		SearchPojoClass s=new SearchPojoClass();
		 clickBtn(s.getAddBag());
	}	
}
