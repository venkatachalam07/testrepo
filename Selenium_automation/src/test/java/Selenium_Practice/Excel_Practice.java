package Selenium_Practice;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Practice {
	
	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workBook= new XSSFWorkbook("D:\\VENKATT\\Excel_01.xlsx");
		XSSFSheet sheet= workBook.getSheetAt(0);
		XSSFRow row= sheet.getRow(0);
		XSSFCell cell= row.getCell(0);
		String name=cell.getStringCellValue();
		System.out.println(name);
		
		
	}
	

}
