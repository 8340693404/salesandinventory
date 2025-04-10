package com.sales_and_inventory_objectutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sales_and_inventory_Genericutility.FileUtility;
import com.sales_and_inventory_Genericutility.WebDriverUtility;
import com.sales_and_inventory_objectutility.*;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(name="user")
	private WebElement usernamebtn;
	@FindBy(name="password")
	private WebElement passwordbtn;
	@FindBy(name="btnlogin")
	private WebElement loginbtn;

	public WebElement getUsername() {
		return usernamebtn;
	}
	public WebElement getPassword() {
		return passwordbtn;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	

	// business method
	public void loginAsUser()throws Throwable
	{
		
       FileUtility Flib = new FileUtility();
		
		String USERNAME=Flib.getDataFromPropertiesFile ("user_username");
		String PASSWORD= Flib.getDataFromPropertiesFile("user_password");
		try {
			usernamebtn.sendKeys(USERNAME);
			passwordbtn.sendKeys(PASSWORD);
			loginbtn.click();
			driver.switchTo().alert().accept();

		} catch (Exception e) {
			

		}		
		 
	}
	public void loginAsAdmin() throws Throwable{
		
	
		FileUtility Flib = new FileUtility();
		
		String USERNAME=Flib.getDataFromPropertiesFile ("admin_username");
		String PASSWORD= Flib.getDataFromPropertiesFile("admin_password");
		usernamebtn.sendKeys(USERNAME);
		
		try {
			passwordbtn.sendKeys(PASSWORD);
			loginbtn.click();
			driver.switchTo().alert().accept();
		} catch (Exception e) {
		
		}
	}



	



}
