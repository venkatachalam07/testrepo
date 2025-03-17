package Selenium_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_Write {
	
	
	static String filepath ="E:\\Eclipse\\Selenium_automation\\Automation.xlsx";
	
	public static void main(String[] args) throws IOException {
		
		
	   // single_Row_Excel_Read();
	//	 second_Row_Second_Cell();
	//	 excel_Read_Multiple();
		
		
	// writing
		
		
		creatting_Cell_Than_Write();
		
		//voting_Eligibility();
		
		
		
		
		
		
		
	}

	
	
	
	
	public static void creatting_Cell_Than_Write() throws IOException {
	

		 XSSFWorkbook workbook = new XSSFWorkbook();
		 XSSFSheet sheet= workbook.createSheet("Create");
	     XSSFRow row= sheet.createRow(1);
	     XSSFCell cell=row.createCell(1);
	   cell.setCellValue("Yes");
	   File fiel=new File("E:\\Eclipse\\Selenium_automation\\TestNG Result.xlsx");
	   FileOutputStream fos=new FileOutputStream(fiel);
	   workbook.write(fos);
		
	   System.out.println("Sucessfuly writing in cell");
	   
	}
	
	 public static void voting_Eligibility() throws IOException{
		     		
		 
		 FileInputStream fis=new FileInputStream(filepath);
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet= workbook.getSheet("Data");
	     XSSFRow row= sheet.getRow(1);
	     XSSFCell cell=row.getCell(1);
	     double values=cell.getNumericCellValue();
	     int age= (int)values;  
	     System.out.println(age);
	     if (age>=18) {
	    	 System.out.println("It is created");
	    	 XSSFCell c=row.createCell(2);
	    	   c.setCellValue("Yes");
	    	 
	     } 
	     fis.close();
	     File file=new File(filepath);
	     FileOutputStream fos = new FileOutputStream(file);
	     workbook.write(fos);
	     fos.close();
	     workbook.close();
	     
	     
	 
	   
	     
	}
	
	
	
	
	
	
	
	
	public static void single_Row_Excel_Read() throws IOException {
		
		XSSFWorkbook workbook=new XSSFWorkbook(filepath);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		for (int i=1;i<=5;i++) 	
     {
		XSSFRow Row= sheet.getRow(i);
		XSSFCell cell= Row.getCell(0);
		String name=cell.getStringCellValue();
		System.out.println(name);
		}}
	
	
	public static void second_Row_Second_Cell() throws IOException {
		
		
		XSSFWorkbook workbook=new XSSFWorkbook(filepath);
		XSSFSheet sheet=workbook.getSheet("Vicky");
		for(int i=1;i<=5;i++) {
			XSSFRow row= sheet.getRow(i);
			XSSFCell cell=row.getCell(1);
			String  values=cell.getStringCellValue();	
		System.out.println(values);
			
		}		
	}
	
	
	
	
	public static void excel_Read_Multiple() throws IOException {
	XSSFWorkbook workbook=new XSSFWorkbook(filepath);
	XSSFSheet sheet=workbook.getSheet("Sheet2");
	for (int i=0;i<=5;i++) {
	for(int j=0;j<=5;j++) {
		XSSFRow row =sheet.getRow(i);
	XSSFCell cell = row.getCell(j);	
String name =cell.getStringCellValue();
System.out.println(name);
}}}
	
	
	
	
	
	
	
	
	
	
	
	

}
