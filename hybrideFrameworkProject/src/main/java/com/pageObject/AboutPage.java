package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage  {
	public WebDriver driver;
	
	By about = By.xpath("//*[@href='/about-urban-ladder?src=g_footer']");
	By aboutpage = By.xpath("//*[@class='subheader question']");
	
	
	public AboutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement about()
	{
		return driver.findElement(about);
	}
	public WebElement aboutpage()
	{
		return driver.findElement(aboutpage);
	}
}


