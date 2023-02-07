package com.app.pageexe;

import com.app.base.BaseClassCA;
import com.app.locator.CheapAirSelectFlightLocators;

public class CheapAirSelectFlightPageExe extends CheapAirSelectFlightLocators {
	
	public static void switchwin() {
		BaseClassCA.switchwindow();
	}
	
	public static void closepopup() {
		BaseClassCA.click(new CheapAirSelectFlightLocators().getClosePopup());
	}
	
	public static void sortprices() {
		BaseClassCA.actionsclass(new CheapAirSelectFlightLocators().getLowestPrice());
	}
	
	public static void selectlowestprice(){
		BaseClassCA.minimumvalue(new CheapAirSelectFlightLocators().getAllFlightPrices());;
	}
	
	public static void continuebutton() {
		BaseClassCA.click(new CheapAirSelectFlightLocators().getContinue());
	}

}
