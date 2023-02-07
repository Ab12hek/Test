package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.FlipkartHomePageLocators;

public class FlipkartHomePageExe extends FlipkartHomePageLocators {
	
	public static void closelogin() {
		BaseClass.clickelement(new FlipkartHomePageLocators().getCloseLogin());
	}
	
	public static void searchbar() {
		BaseClass.typedata(new FlipkartHomePageLocators().getInputforSearch(), "Realme");
	}
	
	public static void search() {
		//BaseClass.actionsclass(0,1000);
		BaseClass.clickelement(new FlipkartHomePageLocators().getSearchButton());
	}

}
