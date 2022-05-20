package com.runner;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.pageObject.AboutPage;
import com.resource.Base;

public class AboutPageTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test
	
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));

		AboutPage a = new AboutPage(driver);
		
		a.about().click();
		log.info("open the about page");
		AssertJUnit.assertEquals(a.aboutpage().getText(), "About Us");
		log.info("compare the page title");
		System.out.println(a.aboutpage().getText());
		log.info("print the page title in console");

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}

}
