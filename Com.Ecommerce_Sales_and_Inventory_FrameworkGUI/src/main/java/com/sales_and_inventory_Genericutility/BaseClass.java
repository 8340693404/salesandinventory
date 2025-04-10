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

import com.sales_and_inventory_objectutility.Homepage;


public class BaseClass {
	
	public FileUtility flib = new  FileUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
	public JavaUtility jlib=new JavaUtility();
   
	public static  WebDriver sdriver ;
	public WebDriver driver ;
		
	
	@Parameters("BROWSER")
	@BeforeClass(groups = {"regressionTest","smokeTest"})
	public void configBC(@Optional("chrome") String browser) throws Throwable  {
		System.out.println("====Launch the BROWSER===");
		
		String BROWSER = flib.getDataFromPropertiesFile("browser");
				
	    if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
	    }
	
	       sdriver = driver;
	       
        }


	@BeforeMethod(groups = {"regressionTest","smokeTest"})
	public void configBM() throws Throwable  {
		System.out.println("=====login to appliction=====");
		wlib.MaximizePage(driver);
	
		wlib.WaitForPageToLoad(driver);
		String URL=flib.getDataFromPropertiesFile("url");
		driver.get(URL);
		

		
		
		
			
	}
	@AfterMethod(groups = {"regressionTest","smokeTest"})
	public void configAM() {
		System.out.println("======logout of the application====");
//		Homepage hp=new Homepage(driver);
//		hp.getLogout();
		
		
	}
	@AfterClass( groups = {"regressionTest","smokeTest"})
	public void configAC() {
		System.out.println("======close the BROWSER=====");
		driver.quit();

		
	
	

}
	
	

}
