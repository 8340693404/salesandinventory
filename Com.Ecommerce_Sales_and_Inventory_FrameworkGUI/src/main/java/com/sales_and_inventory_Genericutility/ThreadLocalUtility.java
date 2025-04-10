package com.sales_and_inventory_Genericutility;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class ThreadLocalUtility {
	private static final ThreadLocal<WebDriver>driver=new ThreadLocal<>();
	private static final ThreadLocal<ExtentTest>test=new ThreadLocal<>();
	public static WebDriver getDriver() {
		return driver.get();
	}
	public  static void setDriver(WebDriver actDriver) {
		driver.set(actDriver);
	}
	public static ExtentTest getTest() {
		return test.get();
	}
	public static void setTest(ExtentTest actTest) {
		test.set(actTest);
	}
	public static void removeDriver()
	{
		driver.remove();
	}
	public static void removeTest() {
		test.remove();
	}
	public static void clearAll() {
		removeDriver();
		removeTest();
	}

	
	

}
