package com.app.dataproviderexcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeForm {
	
	public static WebDriver driver = null;

	public static void browserlaunch() {
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
	}
	
	public static void main(String[] args) {
		browserlaunch();
		driver.findElement(By.id("firstName")).sendKeys("Abishek");
		driver.findElement(By.id("lastName")).sendKeys("Naganathan");
		driver.findElement(By.id("userEmail")).sendKeys("Abisheknaganathan12@gmail.com");
	}

	

}
