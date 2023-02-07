package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.base.BaseClassCA;

public class CheapAirSearchFlightsLocators extends BaseClassCA {
	
	public CheapAirSearchFlightsLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "from1")
	private WebElement fromcity;
	
	public WebElement getSourceCity() {
		return fromcity;
	}
	
	@FindBy (id = "to1")
	private WebElement tocity;
	
	public WebElement getDestCity() {
		return tocity;
	}
	
	@FindBy (id = "departs")
	private WebElement fromdate;
	
	public WebElement getDepartDate() {
		return fromdate;
	}
	
	@FindBy (id = "returns")
	private WebElement todate;
	
	public WebElement getReturnDate() {
		return todate;
	}
	
	@FindBy (id = "options")
	private WebElement options;
	
	public WebElement getOptions() {
		return options;
	}
	
	@FindBy (xpath = "(//button[@type='button'])[2]")
	private WebElement adultcount;
	
	public WebElement getAdultCount() {
		return adultcount;
	}
	
	@FindBy (xpath = "(//button[@type='button'])[4]")
	private WebElement seniorcount;
	
	public WebElement getSeniorCount() {
		return seniorcount;
	}
	
	@FindBy (xpath = "(//button[@type='button'])[6]")
	private WebElement childrencount;
	
	public WebElement getChildrenCount() {
		return childrencount;
	}
	
	@FindBy (xpath = "(//button[@type='button'])[8]")
	private WebElement infantcount;
	
	public WebElement getInfantCount() {
		return infantcount;
	}
	
	@FindBy (id = "cabin")
	private WebElement selectcabin;
	
	public WebElement getCabinType() {
		return selectcabin;
	}
	
	@FindBy (xpath = "//button[text()='Search Flights']")
	private WebElement searchflight;
	
	public WebElement getFlights() {
		return searchflight;
	}

}
