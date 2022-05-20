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
import com.pageObject.HelpPage;
import com.resource.Base;

public class HelpPageTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test
	
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		log.info("driver is initialized");
		driver.get(prop.getProperty("url"));

		HelpPage h = new HelpPage(driver);
		
		h.help().click();
		log.info("open the about page");
		h.clickonqus().click();
		log.info("click on question");
		System.out.println(h.Answer().getText());
		log.info("print the deliveriable location");

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}

}
