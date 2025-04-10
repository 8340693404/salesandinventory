package com.sales_and_inventory_objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deleteproductpage {
WebDriver driver;
	
	public Deleteproductpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//i[@class='fas fa-fw fa-trash']")
	private WebElement deletebtn;

	public WebElement getDeletebtn() {
		return deletebtn;
	}


}
