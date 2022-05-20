package com.runner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;

import com.pageObject.SignUpPage;
import com.resource.Base;

public class SignUpPageTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test
	public void basePageNavigation() throws IOException
	{
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
		
		SignUpPage sn = new SignUpPage(driver);
		
		sn.signupicon().click();
		log.info("open signup page");
		sn.signupbtn().click();
		sn.Email().sendKeys("amit123@gmail.com");
		log.info("enter eamil address");
		sn.Password().sendKeys("amit@1234");
		log.info("Enter the password");
		sn.signup().click();
		log.info("click submit button");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
		driver=null;
	}
}
