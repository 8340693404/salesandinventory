package salesandinv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.sales_and_inventory_Genericutility.BaseClass;
import com.sales_and_inventory_Genericutility.ExcelUtility;
import com.sales_and_inventory_Genericutility.ThreadLocalUtility;
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
public class Suppiler_Test extends BaseClass{
	@Test
	public void suppiler_Test() throws Throwable {
		 
		 lp.loginAsAdmin();
		
		 try {
		 spp.getSupplierbtn().click();
		 spp.getCreatesupplierbtn().click();
		 
		 String companyname=eLib.getDataFromExcel("suppiler",1,0);
		 spp.getCompanynamebtn().sendKeys(companyname);
		 WebElement dd=ThreadLocalUtility.getDriver().findElement(By.name("province"));
		 Select obj = new Select(dd);
		 obj.selectByVisibleText("Abra");
		// Thread.sleep(1000);
		 WebElement dd1=ThreadLocalUtility.getDriver().findElement(By.name("city"));
		 Select obj1 = new Select(dd1);
		 obj.selectByVisibleText("Bucay");
		 //Thread.sleep(1000);
		 
		 
		// ExcelUtility eLib=new ExcelUtility();
		 String phonenumber=eLib.getDataFromExcel("suppiler",1,1);
		 spp.getCompanynamebtn().sendKeys(phonenumber);
		 }
		 
		 
		 catch(Exception e) {
		 }
		 
		 
		 
		 }
	

		

}

