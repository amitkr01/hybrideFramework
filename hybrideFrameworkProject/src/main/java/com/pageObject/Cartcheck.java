package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cartcheck  {
	public WebDriver driver;
	
		By cart = By.id("cart-badge");
		//By cartpage = By.id("empty_msg");
		By cartpage = By.xpath("//*[@class='empty_cart']");
		By checkout = By.id("checkout-link");
	
	
	public Cartcheck(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement cart()
	{
		return driver.findElement(cart);
	}
	public WebElement cartpage()
	{
		return driver.findElement(cartpage);
	}
	
	public WebElement checkout()
	{
		return driver.findElement(checkout);
	}
}


