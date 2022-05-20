package com.runner;


import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.resource.Base;

public class HomePage extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
	@Test
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.getTitle();
	}
	/*
	@Test
	//public void basePageNavigation()
	{
		driver.get(prop.getProperty("url"));
	}
	*/
	@AfterTest
	public void teardown()
	{
		//driver.close();
		driver=null;
	}
}
