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
import com.pageObject.indexPage;
import com.resource.Base;

public class indexPageTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test
	public void indexpage() throws IOException
	{
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
		
		indexPage i = new indexPage(driver);
		
		 AssertJUnit.assertEquals(i.Title().getText(), "Explore Our Furniture Range");
		log.info("compare the home page topic content");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
		
	}

}
