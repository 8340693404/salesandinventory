package com.sales_and_inventory_Genericutility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerUtility implements ISuiteListener,ITestListener{
	private static ExtentReports report;
	private static ExtentSparkReporter spark;
	
	@Override
	public void onStart(ISuite suite) {
		
		String time=new Date().toString().replace(" ", "_").replace(":", "_");
		String suitename=suite.getName();
		
		ExtentSparkReporter spark =new ExtentSparkReporter("./Advancereporting/salesAndinventory_"+suitename+"_"+time+"_report");
		spark.config().setDocumentTitle("salesAndinventory "+suitename+"_result");
		spark.config().setReportName("salesAndinventory "+suitename+"_report");
		spark.config().setTheme(Theme.DARK);
		
	
		
		report= new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("os","windows-10");
		report.setSystemInfo("browser", "chrome");
}
		
	

	@Override
	public void onFinish(ISuite suite) {
		report.flush();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		String testname=result.getName();
		ExtentTest test=report.createTest(testname);
		test.log(Status.INFO, testname+" execution started");
		ThreadLocalUtility.setTest(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ExtentTest test=ThreadLocalUtility.getTest();
		TakesScreenshot screenshot=(TakesScreenshot)ThreadLocalUtility.getDriver();
		String file=screenshot.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(file, "errorfile");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



}
