package com.loginpojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.EverBaseClass;

public class SearchPojoClass extends EverBaseClass {
public SearchPojoClass() {
PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//*[contains(text(), 'Search')]")
	private WebElement search;
	@FindBy(xpath="(//*[@type='search'])[1]")
	private WebElement productName;
	@FindBy(xpath="(//*[contains(text(), 'The Super-Soft Straight')])[1]")
	private WebElement productClick;
	@FindBy (xpath="//*[contains(text(), 'Add to Bag')]")
	private WebElement addBag;
	
	public WebElement getSearch() {
		return search;
	}
	public WebElement getProductName() {
		return productName;
	}
	public WebElement getProductClick() {
		return productClick;
	}
	public WebElement getAddBag() {
		return addBag;
	}	
	
}
