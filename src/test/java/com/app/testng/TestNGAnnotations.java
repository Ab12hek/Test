package com.app.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	public void main(String[] args) {
		A a = new A();
		a.run();
	}
	
	@BeforeSuite
	public void bs() {
		System.out.println("bs");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("as");	
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("bt");
	}
	
	@AfterTest
	public void at() {
		System.out.println("at");	
	}
	
	@BeforeClass
	public void bc() {
		System.out.println("bc");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("ac");	
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("bm");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("am");	
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	class A extends Thread{
		public void run() {
			
		}
	}

}
