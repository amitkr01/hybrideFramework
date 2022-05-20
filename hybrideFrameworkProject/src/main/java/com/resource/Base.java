package com.resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.log4testng.Logger;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class Base {
	
	public static WebDriver driver;
	public Properties prop;
	public static ExtentReports extent;
	public static ExtentTest test;
	@BeforeSuite
	public void beforsuite(){
		extent = new ExtentReports("D://MyExtentReport.html" , true);
		extent .loadConfig(new File("C:\\Users\\mindsdet153\\eclipse-workspace\\hybrideFrameworkProject\\src\\main\\java\\com\\resource\\Extent-config.xml"));
	}
	
	@BeforeClass
	public static void startTest()
	{
		extent = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResult.html");
		test = extent.startTest("ExtentReport");
	}
	
	static Logger log = Logger.getLogger(Base.class);
	
	public WebDriver  initializeDriver() throws IOException 
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\mindsdet153\\git\\hybrideFramework\\hybrideFrameworkProject\\src\\main\\java\\com\\resource\\data.properties");
		
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver" , "C:\\Users\\mindsdet153\\git\\hybrideFramework\\hybrideFrameworkProject\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		log.info("maximize the window");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	@AfterSuite
	public void afterSuite()
	{
		extent.flush();
		extent.close();
	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("" + result + "screenshot.png"));
				
	}
	

}
