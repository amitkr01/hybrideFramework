package com.runner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.pageObject.OrderPage;
import com.resource.Base;

public class OrderPageTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test
	public void basePageNavigation() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		OrderPage o = new OrderPage(driver);
		
		o.sofaicon().click();
		o.sofa().click();
		log.info("open the sofa page");
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		log.info("switch the windows");
		o.selectsofa().click();
		o.addtocart().click();
		o.checkout().click();
		 
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("close the tab");
		driver=null;
	}

}
