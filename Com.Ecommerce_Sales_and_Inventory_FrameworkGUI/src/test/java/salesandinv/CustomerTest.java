package salesandinv;
import org.testng.annotations.Test;

import com.sales_and_inventory_Genericutility.BaseClass;
import com.sales_and_inventory_Genericutility.ExcelUtility;
import com.sales_and_inventory_objectutility.Createcustomer;
import com.sales_and_inventory_objectutility.Homepage;
import com.sales_and_inventory_objectutility.LoginPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sales_and_inventory_Genericutility.BaseClass;
import com.sales_and_inventory_objectutility.Homepage;
import com.sales_and_inventory_objectutility.LoginPage;
import com.sales_and_inventory_objectutility.Summarypage;

@Listeners(com.sales_and_inventory_Genericutility.ListenerUtility.class)
public class CustomerTest extends BaseClass {
	@Test(groups="smoke")
	public void Customerpage_Test() throws Throwable {
		 ExcelUtility eLib=new ExcelUtility();

		String Firstname=eLib.getDataFromExcel("Sheet1",1,0);
		String Lastname=eLib.getDataFromExcel("Sheet1",1,1)+jlib.getRandomNumber();

		 
		 lp.loginAsAdmin();
		 try {
		 cct.getCustomerbtn().click();
		 cct.getCreatecustomerbtn().click(); 
			
			cct.getFirstnamebtn().sendKeys(Firstname);
			cct.getLastnamebtn().sendKeys(Lastname);
			Thread.sleep(2000);
			String Phonenumber=eLib.getDataFromExcel("Sheet1",1,2);
			cct.getPhonebtn().sendKeys(Phonenumber);
			Thread.sleep(3000);
			cct.getSavebtn().click();
			Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
		 }
		

	}
		 
	}


