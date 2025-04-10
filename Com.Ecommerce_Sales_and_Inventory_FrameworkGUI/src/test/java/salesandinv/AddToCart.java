package salesandinv;
  import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sales_and_inventory_Genericutility.BaseClass;
import com.sales_and_inventory_objectutility.Homepage;
import com.sales_and_inventory_objectutility.LoginPage;


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
public class AddToCart extends BaseClass{
	 @Test
	    public void AddToCartTest() throws Throwable {
		 
	       
		 LoginPage lp=new  LoginPage(driver);
		 lp.loginAsUser();
		 System.out.println("executed");
		 Homepage hp=new Homepage(driver);
		 try {
		 hp.getKeyboardlink().click();
		 hp.getAddkeyboard().click();
		 }
		 catch(Exception e)
		 {
		 }
	 }        
	 }

