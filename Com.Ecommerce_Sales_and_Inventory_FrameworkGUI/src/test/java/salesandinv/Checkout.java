package salesandinv;
import java.time.Duration;

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
public class Checkout extends BaseClass{
	 @Test
	    public void CheckoutTest() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	 LoginPage lp=new  LoginPage(driver);
	 lp.loginAsUser();
	 System.out.println("executed");
	 Homepage hp=new Homepage(driver);
	 try {
	 hp.getKeyboardlink().click();
	 hp.getAddkeyboard().click();
	 WebElement dd=driver.findElement(By.xpath("//select[@class='form-control']"));
	 Select obj = new Select(dd);
	 obj.selectByVisibleText("A Walk in Customer dfdghf");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	 
	 
	 hp.getSubmitbtn().click();
	Summarypage sp=new Summarypage(driver);
   sp.getSummarybtn().sendKeys("80");
   sp.getPaymentbtn().click();
	 }
	 catch(Exception e)
	 {
	 }
	
	 
	 }


}

