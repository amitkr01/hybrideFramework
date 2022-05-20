package com.runner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import com.pageObject.LoginPage;
import com.resource.Base;

public class LoginPageTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test
	public void basePageNavigation() throws IOException
	{
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
		
		LoginPage l = new LoginPage(driver);
		
		l.LoginIcon().click();
		log.info("open login page");
		l.Loginbtn().click();
		l.Email().sendKeys("amit123@gmail.com");
		log.info("enter eamil address");
		l.Password().sendKeys("amit1234");
		log.info("Enter the password");
		l.Login().click();
		log.info("click submit button");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
