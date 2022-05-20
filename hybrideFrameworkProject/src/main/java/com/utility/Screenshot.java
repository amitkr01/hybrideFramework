package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Screenshot {
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\mindsdet153\\git\\hybrideFramework\\hybrideFrameworkProject\\screenshot\\data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		
		Row row2 = sheet.getRow(1);
		Cell cell2 = row.getCell(1);
		
		System.out.println(cell);
		System.out.println(cell2);
		
		System.out.println(sheet.getRow(1).getCell(1));
	}

}
