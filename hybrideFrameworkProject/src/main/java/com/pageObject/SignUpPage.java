package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	
public WebDriver driver;
	

	
	By signupicon = By.xpath("//*[@class='header-icon-link user-profile-icon']");
	By signupbtn = By.xpath("//a[@class='signup-link authentication_popup']");
	By email = By.xpath("//*[@class='textfield email required input_authentication email-suggest']");
	By password =By.xpath("//*[@class='textfield required input_authentication']");
	By signup = By.xpath("//*[@class='button primary signup']");
	
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement signupicon()
	{
		return driver.findElement(signupicon);
	}
	public WebElement signupbtn()
	{
		return driver.findElement(signupbtn);
	}
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement signup()
	{
		return driver.findElement(signup);
	}
	

}
