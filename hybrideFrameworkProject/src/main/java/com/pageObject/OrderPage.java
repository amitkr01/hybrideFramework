package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage  {
	public WebDriver driver;
	
	By sofaicon = By.xpath("//*[@href='/sofa-set?src=explore_categories']");
	By sofa = By.xpath("//*[@href='/sofa?src=cat_2']");
	
	By selectsofa = By.xpath("//*[@title='Chelsea Adjustable Sectional Sofa (Grey)']");
	By addtocart  = By.id("add-to-cart-button");
	By checkout = By.id("checkout-link");
	
	public OrderPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement sofaicon()
	{
		return driver.findElement(sofaicon);
	}
	public WebElement sofa()
	{
		return driver.findElement(sofa);
	}
	public WebElement selectsofa()
	{
		return driver.findElement(selectsofa);
	}
	public WebElement addtocart()
	{
		return driver.findElement(addtocart);
	}
	public WebElement checkout()
	{
		return driver.findElement(checkout);
	}
}


