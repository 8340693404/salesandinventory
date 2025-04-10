package salesandinv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sales_and_inventory_Genericutility.BaseClass;
import com.sales_and_inventory_objectutility.Createcustomer;
import com.sales_and_inventory_objectutility.Homepage;
import com.sales_and_inventory_objectutility.LoginPage;
import com.sales_and_inventory_objectutility.pospage;
@Listeners(com.sales_and_inventory_Genericutility.ListenerUtility.class)
public class Admincheckout extends BaseClass {
	@Test(groups="smoke")
	public void AdmincheckoutTest() throws Throwable {
		 LoginPage lp=new  LoginPage(driver);
		 lp.loginAsAdmin();
		 Createcustomer cc=new Createcustomer(driver);
		 try {
		 cc.getCustomerbtn().click();
		 pospage pp= new pospage(driver);
		 pp.getPosbtn().click();
		 Homepage hp=new Homepage(driver);
		 hp.getKeyboardlink().click();
		 hp.getAddkeyboard().click();
		 WebElement dd=driver.findElement(By.xpath("//select[@class='form-control']"));
		 Select obj = new Select(dd);
		 obj.selectByVisibleText("Mithun Mishra");
		 Thread.sleep(2000);
		 }
		 catch(Exception e) {
		 
		 }
		
		 }
		 

}
		 
	
