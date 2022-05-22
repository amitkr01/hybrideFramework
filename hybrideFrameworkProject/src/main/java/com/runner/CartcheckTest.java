package com.runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pageObject.Cartcheck;
import com.resource.Base;

public class CartcheckTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	@BeforeSuite
	public void setup() {
		htmlReporter = new ExtentHtmlReporter("extentreport.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	@Test
	public void Cartpage() throws IOException {
		
		ExtentTest test = extent.createTest("cart page test", "check the cart item");
		driver = initializeDriver();

		driver.get(prop.getProperty("url"));

		Cartcheck c = new Cartcheck(driver);

		c.cart().click();
		test.info("open cart page");
		log.info("open the cart page");
		System.out.println(c.cartpage().getText());

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver =null;
		
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();
		
	}

}
