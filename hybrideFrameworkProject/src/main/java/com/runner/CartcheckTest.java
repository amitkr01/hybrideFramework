package com.runner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.pageObject.Cartcheck;
import com.resource.Base;

public class CartcheckTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();

		driver.get(prop.getProperty("url"));

		Cartcheck c = new Cartcheck(driver);

		c.cart().click();
		log.info("open the cart page");
		System.out.println(c.cartpage().getText());

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}

}
