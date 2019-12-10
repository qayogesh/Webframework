package com.automation.mercuryTours.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream(
				new File("C:\\Projects\\webFramework\\src\\main\\java\\resources\\dataSheets\\testData_Login.xlsx"));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum() + 1;
		int colCount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		for (int i = 1; i < rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = cell.getStringCellValue();
			}
		}
		return data;
	}

}