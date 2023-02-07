package com.app.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.pageexe.CheapAirSelectFlightPageExe;

public class CheapAirPurchasePageLocators extends CheapAirSelectFlightPageExe {
	
	public CheapAirPurchasePageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//button[@class='DismissibleFixedFooter__RoundButton-sc-10r1mjz-1 bhukiM']")
	private WebElement dismissfixedfooter;
	
	public WebElement getDismissFixedFooter() {
		return dismissfixedfooter;
		}
	
	@FindBy (id = "firstName1")
	private WebElement firstName1;
	
	public WebElement getFirstName1() {
		return firstName1;
	}
	
	@FindBy (id = "lastName1")
	private WebElement lastName1;
	
	public WebElement getLastName1() {
		return lastName1;
		}
	
	@FindBy (xpath = "//select[@name='suffix1']")
	private WebElement suffix1;
	
	public WebElement getSuffix1() {
		return suffix1;
		}
	
	@FindBy (xpath = "//select[@name='gender1']")
	private WebElement gender1;
	
	public WebElement getGender1() {
		return gender1;
		}
	
	@FindBy (xpath = "//select[@name='dobMonth1']")
	private WebElement dobMonth1;
	
	public WebElement getDobMonth1() {
		return dobMonth1;
		}
	
	@FindBy (id = "dobDay1")
	private WebElement dobDay1;
	
	public WebElement getDobDay1() {
		return dobDay1;
		}
	
	@FindBy (id = "dobYear1")
	private WebElement dobYear1;
	
	public WebElement getDobYear1() {
		return dobYear1;
		}
	
	@FindBy (id = "firstName2")
	private WebElement firstName2;
	
	public WebElement getFirstName2() {
		return firstName2;
	}
	
	@FindBy (id = "lastName2")
	private WebElement lastName2;
	
	public WebElement getLastName2() {
		return lastName2;
		}
	
	@FindBy (xpath = "//select[@name='suffix2']")
	private WebElement suffix2;
	
	public WebElement getSuffix2() {
		return suffix2;
		}
	
	@FindBy (xpath = "//select[@name='gender2']")
	private WebElement gender2;
	
	public WebElement getGender2() {
		return gender2;
		}
	
	@FindBy (xpath = "//select[@name='dobMonth2']")
	private WebElement dobMonth2;
	
	public WebElement getDobMonth2() {
		return dobMonth2;
		}
	
	@FindBy (id = "dobDay2")
	private WebElement dobDay2;
	
	public WebElement getDobDay2() {
		return dobDay2;
		}
	
	@FindBy (id = "dobYear2")
	private WebElement dobYear2;
	
	public WebElement getDobYear2() {
		return dobYear2;
		}
	
	@FindBy (id = "firstName3")
	private WebElement firstName3;
	
	public WebElement getFirstName3() {
		return firstName3;
	}
	
	@FindBy (id = "lastName3")
	private WebElement lastName3;
	
	public WebElement getLastName3() {
		return lastName3;
		}
	
	@FindBy (xpath = "//select[@name='suffix3']")
	private WebElement suffix3;
	
	public WebElement getSuffix3() {
		return suffix3;
		}
	
	@FindBy (xpath = "//select[@name='gender3']")
	private WebElement gender3;
	
	public WebElement getGender3() {
		return gender3;
		}
	
	@FindBy (xpath = "//select[@name='dobMonth3']")
	private WebElement dobMonth3;
	
	public WebElement getDobMonth3() {
		return dobMonth3;
		}
	
	@FindBy (id = "dobDay3")
	private WebElement dobDay3;
	
	public WebElement getDobDay3() {
		return dobDay3;
		}
	
	@FindBy (id = "dobYear3")
	private WebElement dobYear3;
	
	public WebElement getDobYear3() {
		return dobYear3;
		}
	
	@FindBy (id = "firstName4")
	private WebElement firstName4;
	
	public WebElement getFirstName4() {
		return firstName4;
	}
	
	@FindBy (id = "lastName4")
	private WebElement lastName4;
	
	public WebElement getLastName4() {
		return lastName4;
		}
	
	@FindBy (xpath = "//select[@name='suffix4']")
	private WebElement suffix4;
	
	public WebElement getSuffix4() {
		return suffix4;
		}
	
	@FindBy (xpath = "//select[@name='gender4']")
	private WebElement gender4;
	
	public WebElement getGender4() {
		return gender4;
		}
	
	@FindBy (xpath = "//select[@name='dobMonth4']")
	private WebElement dobMonth4;
	
	public WebElement getDobMonth4() {
		return dobMonth4;
		}
	
	@FindBy (id = "dobDay4")
	private WebElement dobDay4;
	
	public WebElement getDobDay4() {
		return dobDay4;
		}
	
	@FindBy (id = "dobYear4")
	private WebElement dobYear4;
	
	public WebElement getDobYear4() {
		return dobYear4;
		}
	
	@FindBy (id = "firstName5")
	private WebElement firstName5;
	
	public WebElement getFirstName5() {
		return firstName5;
	}
	
	@FindBy (id = "lastName5")
	private WebElement lastName5;
	
	public WebElement getLastName5() {
		return lastName5;
		}
	
	@FindBy (xpath = "//select[@name='suffix5']")
	private WebElement suffix5;
	
	public WebElement getSuffix5() {
		return suffix5;
		}
	
	@FindBy (xpath = "//select[@name='gender5']")
	private WebElement gender5;
	
	public WebElement getGender5() {
		return gender5;
		}
	
	@FindBy (xpath = "//select[@name='dobMonth5']")
	private WebElement dobMonth5;
	
	public WebElement getDobMonth5() {
		return dobMonth5;
		}
	
	@FindBy (id = "dobDay5")
	private WebElement dobDay5;
	
	public WebElement getDobDay5() {
		return dobDay5;
		}
	
	@FindBy (id = "dobYear5")
	private WebElement dobYear5;
	
	public WebElement getDobYear5() {
		return dobYear5;
		}
	
	@FindBy (id = "ccNum1")
	private WebElement ccNum1;
	
	public WebElement getCCNumber() {
		return ccNum1;
		}
	
	@FindBy (xpath = "//select[@name='expMonth1']")
	private WebElement expMonth1;
	
	public WebElement getCCExpMonth() {
		return expMonth1;
		}
	
	@FindBy (xpath = "//select[@name='expYear1']")
	private WebElement expYear1;
	
	public WebElement getCCExpYear() {
		return expYear1;
		}
	
	@FindBy (id = "cvv1")
	private WebElement cvv1;
	
	public WebElement getCvv() {
		return cvv1;
		}
	
	@FindBy (id = "paymentName1")
	private WebElement paymentName1;
	
	public WebElement getPaymentName1() {
		return paymentName1;
		}
	
	@FindBy (xpath = "//select[@name='paymentCountry1']")
	private WebElement paymentCountry1;
	
	public WebElement getPaymentCountry1() {
		return paymentCountry1;
		}
	
	@FindBy (id = "paymentAddress1")
	private WebElement paymentAddress1;
	
	public WebElement getPaymentAddress1() {
		return paymentAddress1;
		}
	
	@FindBy (id = "paymanetCity1")
	private WebElement paymanetCity1;
	
	public WebElement getPaymentCity1() {
		return paymanetCity1;
		}
	
	@FindBy (id = "paymentPhone1")
	private WebElement paymentPhone1;
	
	public WebElement getPaymentPhone1() {
		return paymentPhone1;
		}
	
	@FindBy (id = "email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
		}
	
	@FindBy (id = "password")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
		}
	
	@FindBy (id = "confirmPassword")
	private WebElement confirmPassword;
	
	public WebElement getConfirmPassword() {
		return confirmPassword;
		}
	
	@FindBy (id = "termsCheck")
	private WebElement termsCheck;
	
	public WebElement getTermsCheck() {
		return termsCheck;
		}
	
	@FindBy (xpath = "//button[text()='Purchase']")
	private WebElement Purchase;
	
	public WebElement getPurchaseButton() {
		return Purchase;
		}
}
