package com.runner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.pageObject.Wishlist;
import com.resource.Base;

public class WishlistTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();

		driver.get(prop.getProperty("url"));

		Wishlist w = new Wishlist(driver);
		log.info("open the wishlist page");
		
		w.wishlist().click();
		
		System.out.println(w.wishpage().getText());

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}

}
