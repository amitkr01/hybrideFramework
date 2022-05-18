package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class indexPage  {
	public WebDriver driver;
	
	By validatetitle = By.xpath("//*[@class='with-stroke module-heading']");
	
	
	
	public indexPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement Title()
	{
		return driver.findElement(validatetitle);
	}
}


