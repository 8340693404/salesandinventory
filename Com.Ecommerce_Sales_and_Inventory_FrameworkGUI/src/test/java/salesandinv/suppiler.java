package salesandinv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sales_and_inventory_Genericutility.BaseClass;
import com.sales_and_inventory_Genericutility.ExcelUtility;
import com.sales_and_inventory_objectutility.LoginPage;
import com.sales_and_inventory_objectutility.suppilerpage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sales_and_inventory_Genericutility.BaseClass;
import com.sales_and_inventory_objectutility.Homepage;
import com.sales_and_inventory_objectutility.LoginPage;
import com.sales_and_inventory_objectutility.Summarypage;
@Listeners(com.sales_and_inventory_Genericutility.ListenerUtility.class)
public class suppiler extends BaseClass{
	@Test
	public void suppilerTest() throws Throwable {
		 LoginPage lp=new  LoginPage(driver);
		 lp.loginAsAdmin();
		 suppilerpage sp=new suppilerpage(driver);
		 try {
		 sp.getSupplierbtn().click();
		 sp.getCreatesupplierbtn().click();
		 ExcelUtility eLib=new ExcelUtility();
		 String companyname=eLib.getDataFromExcel("suppiler",1,0);
		 sp.getCompanynamebtn().sendKeys(companyname);
		 WebElement dd=driver.findElement(By.name("province"));
		 Select obj = new Select(dd);
		 obj.selectByVisibleText("Abra");
		 Thread.sleep(1000);
		 WebElement dd1=driver.findElement(By.name("city"));
		 Select obj1 = new Select(dd1);
		 obj.selectByVisibleText("Bucay");
		 Thread.sleep(1000);
		 
		 
		// ExcelUtility eLib=new ExcelUtility();
		 String phonenumber=eLib.getDataFromExcel("suppiler",1,1);
		 sp.getCompanynamebtn().sendKeys(phonenumber);
		 }
		 
		 
		 catch(Exception e) {
		 }
		 
		 
		 
		 }
	

		

}

