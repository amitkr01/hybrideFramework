package com.runner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.pageObject.LoginPage;
import com.resource.Base;
import com.utility.Excelutil;


public class LoginPageTest extends Base {
	
	@BeforeTest
	public void loginpage() throws IOException
	{
		driver = initializeDriver();
		
		
	}
			
	@Test(dataProvider="test1data")
	public void test1(String username, String password) {
		System.out.println(username + " | "+ password);
		driver.get(prop.getProperty("url"));
		LoginPage l = new LoginPage(driver);
		
		l.LoginIcon().click();
		l.Loginbtn().click();
		l.Email().sendKeys(username);
		l.Password().sendKeys(password);
		l.Login().click();
				
	}
	
	
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		String excelPath="C:\\Users\\mindsdet153\\git\\hybrideFramework\\hybrideFrameworkProject\\Excel\\getdata.xlsx";
		Object data[][] = testdata(excelPath, "sheet1");
		return data;
	}
	
	
	
	public Object[][] testdata(String excelPath, String sheetName) {
		
		Excelutil excel = new Excelutil(excelPath, sheetName);
		
		int rowcount = excel.getRowCount();
		int colcount = excel.getColCount();
		
		Object data[][] = new Object[rowcount-1][colcount];
		
		for(int i=1; i<rowcount; i++) {
			for(int j=0; j<colcount; j++) {
				
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData + " | " );
				data[i-1][j]  = cellData;
										
			}
			//System.out.println();
			
		}
		return data;
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
