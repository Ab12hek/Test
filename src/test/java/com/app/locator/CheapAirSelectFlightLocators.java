package com.app.locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexe.CheapAirSearchFlightPageExe;

public class CheapAirSelectFlightLocators extends CheapAirSearchFlightPageExe{
	
	public CheapAirSelectFlightLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[@class='sc-fnGiBr kCVmbb']")
	private WebElement closepopup;
	
	public WebElement getClosePopup() {
		return closepopup;
	}
	
	@FindBy (xpath = "(//span[text()='$157'])[1]")
	private WebElement lowprice;
	
	public WebElement getLowestPrice() {
		return lowprice;
	}
	
	@FindBy (xpath = "//span[text()='roundtrip']/preceding::span[contains(text(), '$')]")
	private List<WebElement> allprices;
	
	public List<WebElement> getAllFlightPrices() {
		return allprices;
	}
	
	@FindBy (xpath = "//div[text()='Continue']")
	private WebElement continuebutton;
	
	public WebElement getContinue() {
		return continuebutton;
	}
	
	
	

}
