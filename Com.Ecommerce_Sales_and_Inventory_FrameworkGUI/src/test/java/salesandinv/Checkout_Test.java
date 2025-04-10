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
import com.sales_and_inventory_Genericutility.ThreadLocalUtility;
import com.sales_and_inventory_objectutility.Homepage;
import com.sales_and_inventory_objectutility.LoginPage;
import com.sales_and_inventory_objectutility.Summarypage;
@Listeners(com.sales_and_inventory_Genericutility.ListenerUtility.class)
public class Checkout_Test extends BaseClass{
	 @Test
	    public void checkout_Test() throws Throwable {
		 ThreadLocalUtility.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	 
	 lp.loginAsUser();
	 System.out.println("executed");
	 
	 try {
	 hp.getKeyboardlink().click();
	 hp.getAddkeyboard().click();
	 WebElement dd=ThreadLocalUtility.getDriver().findElement(By.xpath("//select[@class='form-control']"));
	 Select obj = new Select(dd);
	 obj.selectByVisibleText("A Walk in Customer dfdghf");
	
	JavascriptExecutor js=(JavascriptExecutor)ThreadLocalUtility.getDriver();
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	 
	 
	 hp.getSubmitbtn().click();
   sp.getSummarybtn().sendKeys("80");
   sp.getPaymentbtn().click();
	 }
	 catch(Exception e)
	 {
	 }
	
	 
	 }


}

