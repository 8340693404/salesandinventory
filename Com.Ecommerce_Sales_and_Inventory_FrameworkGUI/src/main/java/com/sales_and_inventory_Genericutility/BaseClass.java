package com.sales_and_inventory_Genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.sales_and_inventory_objectutility.Createcustomer;
import com.sales_and_inventory_objectutility.Deleteproductpage;
import com.sales_and_inventory_objectutility.Homepage;
import com.sales_and_inventory_objectutility.LoginPage;
import com.sales_and_inventory_objectutility.Summarypage;
import com.sales_and_inventory_objectutility.pospage;
import com.sales_and_inventory_objectutility.suppilerpage;

public class BaseClass {

	public FileUtility flib = new FileUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
	public JavaUtility jlib = new JavaUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public Createcustomer cct;
	public Deleteproductpage dpp;
	public Homepage hp;
	public LoginPage lp;
	public pospage pp;
	public Summarypage sp;
	public suppilerpage spp;
	WebDriver driver;

	@Parameters("BROWSER")
	@BeforeMethod(alwaysRun = true)
	public void configBM(@Optional("chrome")String BROWSER) throws Throwable {
		 driver=wlib.getDriver(BROWSER);
		ThreadLocalUtility.setDriver(driver);
		cct =new Createcustomer(driver);
		dpp=new Deleteproductpage(driver);
		hp=new Homepage(driver);
		lp=new LoginPage(driver);
		pp=new pospage(driver);
		sp=new Summarypage(driver);
		spp=new suppilerpage(driver);
		
		System.out.println("=====login to appliction=====");
		wlib.MaximizePage(driver);

		wlib.WaitForPageToLoad(driver);
		String URL = flib.getDataFromPropertiesFile("url");
		driver.get(URL);
	}

	@AfterMethod(alwaysRun = true)
	public void configAM() {
		System.out.println("======logout of the application====");
		WebDriver driver=ThreadLocalUtility.getDriver();
		if(driver!=null) {
			driver.quit();
		}
		ThreadLocalUtility.removeDriver();

	}

}
