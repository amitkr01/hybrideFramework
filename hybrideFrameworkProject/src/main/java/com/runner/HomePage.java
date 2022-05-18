package com.runner;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import com.resource.Base;

public class HomePage extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	/*
	@BeforeTest
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		//driver.get(prop.getProperty("url"));
	}
	@Test
	//public void basePageNavigation()
	{
		driver.get(prop.getProperty("url"));
	}
	*/
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
