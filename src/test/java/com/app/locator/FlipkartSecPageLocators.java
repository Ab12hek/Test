package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexe.FlipkartHomePageExe;

public class FlipkartSecPageLocators extends FlipkartHomePageExe {
	
	public FlipkartSecPageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[2]")
	private WebElement selectmi;
	
	public WebElement getMIphmodel() {
		return selectmi;
	}
	
	@FindBy (xpath = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/span[1]")
	private WebElement electronics;
	
	public WebElement getElectronics() {
		return electronics;
	}
	
	

}
