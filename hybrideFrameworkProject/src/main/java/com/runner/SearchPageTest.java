package com.runner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.pageObject.SearchPage;
import com.resource.Base;

public class SearchPageTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test
	public void searchpage() throws IOException
	{
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
		
		SearchPage s = new SearchPage(driver);
		
		s.Search().sendKeys("chair");
		log.info("search chair in search box");
		s.Searchbtn().click();
		 
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}

}
