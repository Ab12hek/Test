package com.app.pageexe;

import com.app.base.BaseClass;
import com.app.locator.FlipkartSecPageLocators;

public class FlipkartSecPageExe extends FlipkartSecPageLocators {
	
	/*public static void selectMI() {
		BaseClass.actionsclass(new FlipkartSecPageLocators().getMIphmodel());
	}*/
	
	public static void selectElectronics() throws InterruptedException {
		BaseClass.actionsclass(new FlipkartSecPageLocators().getElectronics(), new FlipkartSecPageLocators().getMIphmodel());
	}

}
