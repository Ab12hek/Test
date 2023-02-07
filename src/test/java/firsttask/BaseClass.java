package firsttask;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class BaseClass {
	
	static{
		System.out.println("a");
	}
	
	static{
		System.out.println("b");
		
	}
	public static void main(String[] args) {
		System.out.println("c");
		
		Object x[]= new String [3];
		x[0]=new Integer[0];
		System.out.println(x);
	}
	
		/*public static WebDriver driver;
		
		public static void browserLaunch() {
			driver = new ChromeDriver();
			}
		
		public static void getUrl(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		public static void inputTextbox(By by,String data)
		{
			driver.findElement(by).sendKeys(data);
		}
		
		public static String getValue(By by) {
			WebElement fe = driver.findElement(by);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
			String compareHolder1 = (String) jsExecutor.executeScript("return arguments[0].value", fe);
			//String s = fe.getAttribute("value");
			System.out.println(compareHolder1);
			return compareHolder1;
		}
		
		public static void findListElements(By by)
		{
			List<WebElement> listElements = driver.findElements(by);
			System.out.println(listElements.size());
			for(int i=0; i<listElements.size(); i++) {
				String searchoption = listElements.get(i).getText();
				System.out.println(searchoption);
				if(searchoption.contains("Realme c35")) {
					listElements.get(i).click();
					break;
				}
			}
		}
		
		public static String findElement(By by)
		{
			WebElement product1 = driver.findElement(by);
			System.out.println(product1.getText());
			return product1.getText();
		}
		
		public static void click(By by)
		{
			driver.findElement(by).click();
		}
		
		public static void clear(By by)
		{
			driver.findElement(by).clear();
		}
		
		public static void FileBufferedWriter(Map<String, String> mappedcontent, String fileName) throws IOException {
			File ff = new File (fileName);
			boolean newfile = ff.createNewFile();
			System.out.println(newfile);
			FileWriter fw = new FileWriter(ff);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(mappedcontent+"\n");
			bw.close();	
			}
		
		public static void FileAppend (String name, String fileName1) throws IOException {
			   
		    try (FileWriter fw = new FileWriter(new File(fileName1), true)) {
		 
		      fw.append(name+"\n");
		      fw.close();
		      
		    }
		}
		
		public static Map<String, String> mappedoutput(String product1name,String product2name, String product1price,String product2price ) {
			Map<String, String> mappedcontent = new HashMap<String, String>();
			mappedcontent.put("name1", product1name);
			mappedcontent.put("price1", product1price);
			mappedcontent.put("name2", product2name);
			mappedcontent.put("price2", product2price);
			for (Map.Entry<String, String> me:mappedcontent.entrySet()) {
	            System.out.print(me.getValue());
	        }
			return mappedcontent;
		}
		public static void SelectClass (By by, String value) {
			WebElement findElement = driver.findElement(by);
			Select s = new Select(findElement);
			//s.selectByIndex(1);
			s.selectByValue(value);
		}*/
	
	
	
			
}
