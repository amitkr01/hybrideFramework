package com.utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {

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

	

	public static void getRowCount()
	{

		try {
		
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println(rowCount);

		} catch (Exception e) {
				e.printStackTrace();
		}
	}


	public static void getCellDataString(int rowNum, int colNum) {
		try {


			String cellCount= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellCount);



		} catch (Exception e) {
				e.printStackTrace();
		}

	}
	public static void getCellDataNumber(int rowNum, int colNum) {
		try {

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);

		} catch (Exception e) {
				e.printStackTrace();
		}

	}
}
