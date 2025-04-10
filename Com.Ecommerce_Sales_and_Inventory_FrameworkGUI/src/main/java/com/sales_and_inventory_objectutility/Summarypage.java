package com.sales_and_inventory_objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summarypage {
WebDriver driver;
	
	public Summarypage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(id="txtNumber")
	private WebElement summarybtn;
	@FindBy(xpath="//button[text()='PROCEED TO PAYMENT']")
	private WebElement paymentbtn;

	public WebElement getSummarybtn() {
		return summarybtn;
	}
	public WebElement getPaymentbtn() {
		return paymentbtn;
	}
	


}
