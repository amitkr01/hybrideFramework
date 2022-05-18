package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
public WebDriver driver;
	

	
	By loginicon = By.xpath("//*[@class='header-icon-link user-profile-icon']");
	By loginbtn = By.xpath("//a[@class='login-link authentication_popup']");
	By email = By.xpath("//*[@class='email required input_authentication']");
	By password =By.xpath("//*[@class='required input_authentication']");
	By login = By.xpath("//*[@class='button primary']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement LoginIcon()
	{
		return driver.findElement(loginicon);
	}
	public WebElement Loginbtn()
	{
		return driver.findElement(loginbtn);
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement Login()
	{
		return driver.findElement(login);
	}
	

}
