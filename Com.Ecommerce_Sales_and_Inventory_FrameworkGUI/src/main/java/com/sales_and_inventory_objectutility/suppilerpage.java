package com.sales_and_inventory_objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class suppilerpage {
WebDriver driver;
	
	public suppilerpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//span[text()='Supplier']")
	private WebElement supplierbtn;
	@FindBy(xpath="(//a[@data-toggle='modal'])[2]")
	private WebElement createsupplierbtn;
	@FindBy(name="companyname")
	private WebElement companynamebtn;
	@FindBy(name="phonenumber")
	private WebElement phonenumberbtn;
	

	public WebElement getCompanynamebtn() {
		return companynamebtn;
	}
	public WebElement getPhonenumberbtn() {
		return phonenumberbtn;
	}
	public WebElement getSupplierbtn() {
		return supplierbtn;
	}
	public WebElement getCreatesupplierbtn() {
		return createsupplierbtn;
	}
	


}
