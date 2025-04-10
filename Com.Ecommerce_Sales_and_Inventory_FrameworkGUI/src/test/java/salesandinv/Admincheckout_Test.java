package salesandinv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sales_and_inventory_Genericutility.BaseClass;
import com.sales_and_inventory_Genericutility.ThreadLocalUtility;
import com.sales_and_inventory_objectutility.Createcustomer;
import com.sales_and_inventory_objectutility.Homepage;
import com.sales_and_inventory_objectutility.LoginPage;
import com.sales_and_inventory_objectutility.pospage;
@Listeners(com.sales_and_inventory_Genericutility.ListenerUtility.class)
public class Admincheckout_Test extends BaseClass {
	@Test(groups="smoke")
	public void adminCheckout_Test() throws Throwable {
	
		 lp.loginAsAdmin();
		 try {
		 cct.getCustomerbtn().click();
		 pp.getPosbtn().click();
		 hp.getKeyboardlink().click();
		 hp.getAddkeyboard().click();
		 WebElement dd=ThreadLocalUtility.getDriver().findElement(By.xpath("//select[@class='form-control']"));
		 Select obj = new Select(dd);
		 obj.selectByVisibleText("Mithun Mishra");
		 Thread.sleep(2000);
		 }
		 catch(Exception e) {
		 
		 }
		
		 }
		 

}
		 
	
