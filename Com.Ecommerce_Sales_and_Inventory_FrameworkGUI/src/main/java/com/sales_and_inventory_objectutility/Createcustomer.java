package com.sales_and_inventory_objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createcustomer {
WebDriver driver;
	
	public Createcustomer(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//span[text()='Customer']")
	private WebElement customerbtn;
	@FindBy(xpath="(//a[@data-toggle='modal'])[2]")
	private WebElement createcustomerbtn;
	
	@FindBy(name="firstname")
	private WebElement firstnamebtn;
	@FindBy(xpath="(//td)[1]")
	private WebElement namebtn;
	
	
	public WebElement getNamebtn() {
		return namebtn;
	}
	@FindBy(name="phonenumber")
	private WebElement phonebtn;
	public WebElement getPhonebtn() {
		return phonebtn;
		
	}

@FindBy(xpath="//input[@type='search']")
private WebElement searchboxbtn;

public WebElement getSearchboxbtn() {
	return searchboxbtn;
}
	@FindBy(name="lastname")
	private WebElement lastnamebtn;
	@FindBy(xpath="(//button[@class='btn btn-success'])[1]")
	private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getFirstnamebtn() {
		return firstnamebtn;
	}
	public WebElement getLastnamebtn() {
		return lastnamebtn;
	}
	public WebElement getCustomerbtn() {
		return customerbtn;
	}
	public WebElement getCreatecustomerbtn() {
		return createcustomerbtn;
	}
	

}
