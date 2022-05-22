package com.runner;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pageObject.AboutPage;
import com.resource.Base;

public class AboutPageTest extends Base {
	

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static Logger log = LogManager.getLogger(AboutPageTest.class);
	@BeforeSuite
	public void setup() {
		htmlReporter = new ExtentHtmlReporter("extentreport.html");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void aboutpage() throws IOException {
		ExtentTest test = extent.createTest("About page test", "check the about page functionality");
		test.info("driver initialized");
		driver = initializeDriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));

		AboutPage a = new AboutPage(driver);
		
		a.about().click();
		log.info("open the about page");
		test.info(" open about page");
		AssertJUnit.assertEquals(a.aboutpage().getText(), "About Us");
		log.info("compare the page title");
		test.pass("compare page title");
		System.out.println(a.aboutpage().getText());
		log.info("print the page title in console");

	}

	@AfterTest
	public void teardowntest() {
		driver.close();
		driver = null;
		
	}
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
	

}
