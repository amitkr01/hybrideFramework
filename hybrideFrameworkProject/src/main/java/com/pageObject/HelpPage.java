package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage  {
	public WebDriver driver;
	
	By help = By.xpath("//*[@href='/help?src=g_footer']");
	By qus = By.xpath("//*[@class='question row']");
	By diloc = By.xpath("//*[@class='answer']");
	
	
	public HelpPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement help()
	{
		return driver.findElement(help);
	}
	public WebElement clickonqus()
	{
		return driver.findElement(qus);
	}
	
	public WebElement Answer()
	{
		return driver.findElement(diloc);
	}
}


