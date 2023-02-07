package com.app.exe;

import com.app.pageexe.FlipkartSecPageExe;

public class MainExe extends FlipkartSecPageExe {
	
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		getUrl("http://flipkart.com/");
		closelogin();
		searchbar();
		Thread.sleep(5000);
		search();
		Thread.sleep(5000);
		selectElectronics();		
	}
	
	
	
	

}
