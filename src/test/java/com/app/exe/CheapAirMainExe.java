package com.app.exe;

import com.app.pageexe.CheapAirPurchasePageExe;

public class CheapAirMainExe extends CheapAirPurchasePageExe {
	
	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		getUrl("http://cheapair.com/");
		Thread.sleep(5000);
		FromCity();
		Thread.sleep(2000);
		ToCity();
		Thread.sleep(2000);
		DepartuureDate();
		Thread.sleep(2000);
		ReturnDate();
		Thread.sleep(2000);
		Options();
		Thread.sleep(4000);
		SearchFlights();
		Thread.sleep(10000);
		switchwin();
		Thread.sleep(8000);
		closepopup();
		Thread.sleep(2000);
		sortprices();
		Thread.sleep(8000);
		selectlowestprice();
		Thread.sleep(5000);
		continuebutton();
		Thread.sleep(5000);
		CloseFixedFooter();
		Thread.sleep(3000);
		FirstNameAdult1();
		LastNameAdult1();
		SuffixAdult1();
		GenderAdult1();
		DobMonthAdult1();
		DobDayAdult1();
		DobYearAdult1();
		FirstNameAdult2();
		LastNameAdult2();
		SuffixAdult2();
		GenderAdult2();
		DobMonthAdult2();
		DobDayAdult2();
		DobYearAdult2();
		FirstNameSenior1();
		LastNameSenior1();
		SuffixSenior1();
		GenderSenior1();
		DobMonthSenior1();
		DobDaySenior1();
		DobYearSenior1();
		FirstNameChild1();
		LastNameChild1();
		SuffixChild1();
		GenderChild1();
		DobMonthChild1();
		DobDayChild1();
		DobYearChild1();
		FirstNameInfant1();
		LastNameInfant1();
		SuffixInfant1();
		GenderInfant1();
		DobMonthInfant1();
		DobDayInfant1();
		DobYearInfant1();
		CCNumber();
		CCExpMonth();
		CCExpYear();
		Cvv();
		PaymentName();
		PaymentCountry();
		PaymentAddress();
		PaymentCity();
		PaymentPhoneNum();
		Email();
		Password();
		ConfirmPassword();
		//purchase();
		

	}

}
