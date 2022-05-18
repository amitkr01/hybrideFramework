package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wishlist  {
	public WebDriver driver;
	
	By wishlist = By.xpath("//*[@title='Wishlist']");
	By wishpage = By.id("new-customer");
	
	
	public Wishlist(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement wishlist()
	{
		return driver.findElement(wishlist);
	}
	public WebElement wishpage()
	{
		return driver.findElement(wishpage);
	}
}


