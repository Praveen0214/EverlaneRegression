package com.loginpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.EverBaseClass;

public class LoginPojoClass extends EverBaseClass {
	
	public LoginPojoClass() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[contains(text(), 'Log In')]")
	private WebElement loginBtn;
	@FindBy(xpath="//*[@name= 'emailaddress']")
	private WebElement email;
	@FindBy(xpath="//*[contains(text(), 'Continue')]")
	private WebElement clickcon;
	@FindBy (xpath="//*[@name= 'password']")
	private WebElement pass;
	@FindBy(xpath="(//*[@type= 'submit'])[1]")
	private WebElement clicklogin;
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getClickcon() {
		return clickcon;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getClicklogin() {
		return clicklogin;
	}
	

}
