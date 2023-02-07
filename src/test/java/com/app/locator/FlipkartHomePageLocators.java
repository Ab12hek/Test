package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClass;

public class FlipkartHomePageLocators extends BaseClass {
	
	public FlipkartHomePageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@name=\"q\"]")
	private WebElement searchbar;
	
	public WebElement getInputforSearch() {
		return searchbar;
	}
	
	@FindBy (xpath = "//button[@class=\"L0Z3Pu\"]")
	private WebElement searchbutton;
	
	public WebElement getSearchButton() {
		return searchbutton;
	}
	
	@FindBy (xpath = "//button[@class=\"_2KpZ6l _2doB4z\"]")
	private WebElement loginclose;
	
	public WebElement getCloseLogin() {
		return loginclose;
	}
	
	
	
	
	
	



}
