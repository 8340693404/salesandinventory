package com.sales_and_inventory_objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pospage {
WebDriver driver;
	
	public pospage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(linkText="POS")
	private WebElement posbtn;

	public WebElement getPosbtn() {
		return posbtn;
	}
	

}
