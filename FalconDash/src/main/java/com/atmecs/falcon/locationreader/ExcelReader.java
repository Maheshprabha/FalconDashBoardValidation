package com.atmecs.falcon.locationreader;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	public static String readData(String path,String sheetName,int row,int cell) throws Exception {
		String data=null;
		
			FileInputStream fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);//create a object for xssfworkbook class
			sheet = workbook.getSheet(sheetName);//Read the sheet by the name
			data = sheet.getRow(row).getCell(cell).toString();
		return data;
	}
}
