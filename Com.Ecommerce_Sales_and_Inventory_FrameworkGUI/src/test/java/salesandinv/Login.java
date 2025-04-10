package salesandinv;
import org.testng.annotations.Test;

import com.sales_and_inventory_Genericutility.BaseClass;
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
public class Login  extends BaseClass{
	@Test
	public void LoginTest() throws Throwable {
		 LoginPage lp=new  LoginPage(driver);
		 lp.loginAsUser();
		
	
	

}
}
