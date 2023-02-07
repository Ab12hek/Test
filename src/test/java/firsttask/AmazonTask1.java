package firsttask;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;

public class AmazonTask1 extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseClass.browserLaunch();
		BaseClass.getUrl("https://www.amazon.in/");
		Thread.sleep(2000);
		BaseClass.inputTextbox(By.id("twotabsearchtextbox"), "Realme");
		Thread.sleep(2000);
		BaseClass.click(By.xpath("//div[@id='nav-flyout-searchAjax']/div[2]/descendant::div[@role='button'][4]"));
		String Product1 = BaseClass.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
		String Product1price = BaseClass.findElement(By.xpath("(//span[@class='a-price-whole'])[6]"));
		String Product2 = BaseClass.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
		String Product2price = BaseClass.findElement(By.xpath("(//span[@class='a-price-whole'])[7]"));
		Map<String, String> mappedcontent = BaseClass.mappedoutput(Product1, Product2, Product1price, Product2price);
		System.out.println(mappedcontent);
		BaseClass.FileBufferedWriter(mappedcontent, "D:\\Java Course - aiite\\FileWriteTask1.txt");
		
	}

}
