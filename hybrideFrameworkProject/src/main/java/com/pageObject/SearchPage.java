package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage  {
	public WebDriver driver;
	
	By search = By.id("search");
	By searchbtn = By.id("search_button");
	
	
	
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement Search()
	{
		return driver.findElement(search);
	}
	public WebElement Searchbtn()
	{
		return driver.findElement(searchbtn);
	}
}


