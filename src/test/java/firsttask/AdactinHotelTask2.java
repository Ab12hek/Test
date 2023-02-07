package firsttask;

import java.io.IOException;

import org.openqa.selenium.By;

public class AdactinHotelTask2 extends AmazonTask1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseClass.browserLaunch();
		BaseClass.getUrl("http://adactinhotelapp.com/index.php");
		Thread.sleep(2000);
		BaseClass.inputTextbox(By.id("username"), "daisyrubycatharine");
		BaseClass.inputTextbox(By.id("password"), "RP65IQ");
		BaseClass.click(By.id("login"));
		Thread.sleep(2000);
		BaseClass.SelectClass(By.id("location"), "Paris");
		BaseClass.SelectClass(By.id("hotels"), "Hotel Sunshine");
		BaseClass.SelectClass(By.id("room_type"), "Super Deluxe");
		BaseClass.SelectClass(By.id("room_nos"), "1");
		BaseClass.clear(By.id("datepick_in"));
		BaseClass.inputTextbox(By.id("datepick_in"), "24/12/2022");
		BaseClass.clear(By.id("datepick_out"));
		BaseClass.inputTextbox(By.id("datepick_out"), "27/12/2022");
		BaseClass.SelectClass(By.id("adult_room"), "1");
		BaseClass.SelectClass(By.id("child_room"), "1");
		BaseClass.click(By.id("Submit"));
		Thread.sleep(2000);
		BaseClass.click(By.id("radiobutton_0"));
		BaseClass.click(By.id("continue"));
		BaseClass.inputTextbox(By.id("first_name"), "Daisy Ruby");
		BaseClass.inputTextbox(By.id("last_name"), "Catharine");
		BaseClass.inputTextbox(By.id("address"), "Chennai, Tamil Nadu, India");
		BaseClass.inputTextbox(By.id("cc_num"), "5465654789563284");
		BaseClass.SelectClass(By.id("cc_type"), "VISA");
		BaseClass.SelectClass(By.id("cc_exp_month"), "12");
		BaseClass.SelectClass(By.id("cc_exp_year"), "2022");
		BaseClass.inputTextbox(By.id("cc_cvv"), "892");
		BaseClass.click(By.id("book_now"));
		Thread.sleep(5000);
		String ordernum = BaseClass.getValue(By.id("order_no"));
		BaseClass.FileAppend(ordernum, "D:\\Java Course - aiite\\FileWriteTask2.txt");

	}
	
}
