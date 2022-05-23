package com.utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {
	public static String projectPath;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	public Excelutil(String excelPath, String sheetName) {
		try {
			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch(Exception e){
			e.fillInStackTrace();
		}

	}

	

	public static int getRowCount()
	{
		int rowCount = 0;

		try {
				rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println(rowCount);

		} catch (Exception e) {
						e.printStackTrace();
		}
		return rowCount;
	}
	public static int getColCount()
	{
		int colCount = 0;

		try {
			    colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println(colCount);

		} catch (Exception e) {
					e.printStackTrace();
		}
		return colCount ;
	}


	public static String getCellDataString(int rowNum, int colNum) {
		String cellData = null;
		try {
			cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		

		} catch (Exception e) {
					e.printStackTrace();
		}
		return cellData;
	}
	
	public static double getCellDataNumber(int rowNum, int colNum) {
		double cellData =0;
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {
					e.printStackTrace();
		}
		return cellData;
	}
}
