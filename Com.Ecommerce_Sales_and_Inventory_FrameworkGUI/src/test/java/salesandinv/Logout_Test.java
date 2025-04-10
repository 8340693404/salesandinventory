package salesandinv;
import org.testng.annotations.Test;

import com.sales_and_inventory_Genericutility.BaseClass;
import com.sales_and_inventory_Genericutility.ThreadLocalUtility;
import com.sales_and_inventory_objectutility.Homepage;
import com.sales_and_inventory_objectutility.LoginPage;


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
public class Logout_Test extends BaseClass{
	@Test
	public void logout_Test() throws Throwable {
		 
		 lp.loginAsUser();
		 System.out.println("executed");
		
		 Thread.sleep(5000);
		 try {
		 hp.getAdminimg().click();
		 ThreadLocalUtility.getDriver().switchTo().alert().accept();


		 
		 Thread.sleep(5000);


		hp.getLogout().click();	
		Thread.sleep(5000);
		hp.getReadylogoutbtn().click();
		 }
		 catch(Exception e) {
			 
		 }
		 boolean verify= ThreadLocalUtility.getDriver().getCurrentUrl().contains("pos");
			Assert.assertTrue(verify);

		 
		
	}
}
