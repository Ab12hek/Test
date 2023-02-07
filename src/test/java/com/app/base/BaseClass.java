package com.app.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
public static WebDriver driver = null;
	
	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	public static void clickelement(WebElement element) {
		element.click();
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void typedata(WebElement element, String data) {
		element.sendKeys(data);	
	}
	
	public static void actionsclass(WebElement element1, WebElement element2) throws InterruptedException {
		Actions actions = new Actions(driver);
		//actions.moveByOffset(i, j).contextClick();
		actions.moveToElement(element1).build().perform();
		Thread.sleep(5000);
        driver.switchTo().frame(1);
        element2.click();
	}


}
