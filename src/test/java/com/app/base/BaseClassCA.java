package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassCA {
	
	public static WebDriver driver = null;
	public static void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void clear(WebElement element) {
		element.clear();
	}
	
	public static void sendkeys(WebElement element, String data) {
		element.sendKeys(data);	
	}
	
	public static void actionsclass(WebElement element) {
		try {
			Actions actions = new Actions(driver);
			//actions.moveByOffset(i, j).contextClick();
			//actions.moveToElement((By) by).build().perform();
			actions.doubleClick(element).perform();
			Thread.sleep(8000);
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void selectbyvisibletext(WebElement element, String data) {
		
		try {
			Select svt=new Select(element);
			svt.selectByVisibleText(data);
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void switchwindow() {
		Set<String> set = driver.getWindowHandles();
		List<String> settolist = new ArrayList<>();
		settolist.addAll(set);
		driver.switchTo().window(settolist.get(1));
	}
	
	public static void minimumvalue(List<WebElement> price){
		
		ArrayList<Integer> pricelist = new ArrayList<>();

		for (int i = 1; i < price.size(); i++) {
			Integer priceint = Integer.parseInt(price.get(i).getText().replaceAll("[^0-9]", ""));
			pricelist.add(priceint);
			System.out.println(priceint);
			// System.out.println(priceAl);
		}
			Integer min = Collections.min(pricelist);

			try{
				Thread.sleep(7000);
				for (int i = 1; i < price.size(); i++) {
				if (min == Integer.parseInt(price.get(i).getText().replaceAll("[^0-9]", ""))) {
				System.out.println("Least amount to be clicked:"+price.get(i).getText());
				price.get(i).click();
				break;

			}
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	public static String excelreadreusable(int i, int j) {
		String value = null;
		try {
			File f = new File("C:\\Users\\Abishek\\eclipse-workspace\\Task_17122022\\src\\test\\resources\\Data\\CheapAir Book Flight Data1.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);

			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("MMM/dd/yyyy");
					value = s.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static void TakeScreenshots() {
		
		try {
			Date d = new Date();
	        System.out.println(d.toString());

	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");   
	        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(scrFile, new File("D:\\RND\\"+sdf.format(d)+".png"));
	        		
	        		//FileUtils.copyFile(scrFile, new File("D:\\RND\\"+sdf.format(d)+".png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
