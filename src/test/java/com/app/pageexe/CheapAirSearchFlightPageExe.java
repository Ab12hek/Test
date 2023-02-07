package com.app.pageexe;

import com.app.base.BaseClassCA;
import com.app.locator.CheapAirSearchFlightsLocators;

public class CheapAirSearchFlightPageExe extends CheapAirSearchFlightsLocators{
	
	public static void FromCity(){
		try {
		BaseClassCA.clear(new CheapAirSearchFlightsLocators().getSourceCity());
		Thread.sleep(2000);
		BaseClassCA.sendkeys(new CheapAirSearchFlightsLocators().getSourceCity(), BaseClassCA.excelreadreusable(0, 1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ToCity() {
		BaseClassCA.sendkeys(new CheapAirSearchFlightsLocators().getDestCity(), BaseClassCA.excelreadreusable(0, 2));
	}
	
	public static void DepartuureDate() {
		BaseClassCA.sendkeys(new CheapAirSearchFlightsLocators().getDepartDate(), BaseClassCA.excelreadreusable(0, 3));
	}
	
	public static void ReturnDate() {
		BaseClassCA.sendkeys(new CheapAirSearchFlightsLocators().getReturnDate(), BaseClassCA.excelreadreusable(0, 4));
	}
	
	public static void Options(){
		
		try {
			BaseClassCA.click(new CheapAirSearchFlightsLocators().getOptions());
			Thread.sleep(2000);
			BaseClassCA.click(new CheapAirSearchFlightsLocators().getAdultCount());
			Thread.sleep(2000);
			BaseClassCA.click(new CheapAirSearchFlightsLocators().getChildrenCount());
			Thread.sleep(2000);
			BaseClassCA.click(new CheapAirSearchFlightsLocators().getSeniorCount());
			Thread.sleep(2000);
			BaseClassCA.click(new CheapAirSearchFlightsLocators().getInfantCount());
			Thread.sleep(2000);
			BaseClassCA.selectbyvisibletext(new CheapAirSearchFlightsLocators().getCabinType(), BaseClassCA.excelreadreusable(0, 5));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void SearchFlights() {
		BaseClassCA.click(new CheapAirSearchFlightsLocators().getFlights());
	}

}
