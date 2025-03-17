package Selenium_Practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write {
	

	
	public static void main(String[] args) throws IOException {
		

		XSSFWorkbook workBook= new XSSFWorkbook();
		
		XSSFSheet sheet=workBook.createSheet("NAME");
		
		XSSFRow row=sheet.createRow(0);
		
		XSSFCell cell=row.createCell(0);
		
		cell.setCellValue("VENKATBABU");
		
		File f=new File	("D:\\VENKATT\\Excel_01.xlsx");
		
		FileOutputStream fos=new FileOutputStream(f);
		workBook.write(fos);
		
		System.out.println("Excel Writeing is Done");
		
	}

}
