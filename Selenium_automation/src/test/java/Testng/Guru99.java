package Testng;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Guru99 {

	
	static WebDriver driver; 
	@BeforeSuite
	public void Beforemethod() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
		
	}
	
	
	static String tescaseame;
	static String Status;
	static double mss;
	 static int i;
	 
	@AfterMethod
	public void resutmethod(ITestResult res) throws IOException {
	 tescaseame=res.getName();
	 System.out.println("TEST CASE NAME :: " +tescaseame);
		System.out.println("GET STATUS:: "+res.getStatus());
		if(res.getStatus()==1) {
			Status="PASS";
		}else {
			Status="Fail";
		}
		double ms=res.getEndMillis()-res.getStartMillis();
	      mss=ms/1000;
	    System.out.println("DURATION TIME ::"+mss);
   
	writeexcel();
		
	}
	
	
	@Test (priority =1)
	public void Verifypopcontent( ) throws IOException, InvalidFormatException {
		
		 i=1;

		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Actions ac= new Actions(driver);
	    Alert al=	driver.switchTo().alert();
	    String alcontent =al.getText();
		System.out.println(alcontent);
		Assert.assertEquals(alcontent, "please fill all fields");
		al.accept();
	
	   
	
	}
	
	
	public static void writeexcel() throws IOException {
	
		FileInputStream fs= new FileInputStream("E:\\Eclipse\\Selenium_automation\\Tesult.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		    XSSFSheet sheet =workbook.getSheet("Create");
		int  x=i;
		   XSSFRow row =sheet.createRow(x);
		   XSSFCell cell =row.createCell(0); 
		   cell.setCellValue(tescaseame);
		   XSSFCell cell1=row.createCell(1);
		   cell1.setCellValue(Status);
		   XSSFCell cell2=row.createCell(2);
		   System.out.println("MSSS"+mss);
		   cell2.setCellValue(mss);
		    File file=new File("E:\\Eclipse\\Selenium_automation\\Tesult.xlsx");
		    FileOutputStream fos= new FileOutputStream(file);
		    workbook.write(fos);
		    fos.close();
		    workbook.close();
		    i++;
		   }
	@Test (priority =2)
	public void TCS() {
		 i=2;
		Assert.assertTrue(false);
		}
	
	
	
	
	
	
	
	
}





//
//    WebElement radiobtn=driver.findElement(By.xpath("//*[text()='Done']"));
//
//    radiobtn.click();
//		
//WebElement fname=driver.findElement(By.id("fname"));
//fname.sendKeys("Venkat");
//
//WebElement lname=driver.findElement(By.id("lname"));
//lname.sendKeys("Babu");
//
//WebElement email=driver.findElement(By.id("email"));
//email.sendKeys("venkaktatt@gmai.com");		
//
//WebElement ad=driver.findElement(By.name("addr"));
//ad.sendKeys("No 30 Metustreet");
//
//WebElement telephoneno=driver.findElement(By.id("telephoneno"));
//telephoneno.sendKeys("9993376732");
//
//WebElement telephone=driver.findElement(By.xpath("//input[@type='submit']"));
//telephone.click();
//	
//    WebElement Cmid = driver.findElement(By.tagName("h3"));
//	String Number =Cmid.getText();
//	System.out.println(Number);
		
//	
//	 File fiel=new File("E:\\Eclipse\\Selenium_automation\\TestNG Result.xlsx");
//	 FileOutputStream fos= new FileOutputStream(fiel);
//	 XSSFWorkbook workbook = new XSSFWorkbook(fiel);
//	 XSSFSheet sheet= workbook.createSheet("Create");
//     XSSFRow row= sheet.createRow(1);
//     XSSFCell cell=row.createCell(1);
//     cell.setCellValue("Pass");
//   workbook.write(fos);
//   System.out.println("Sucessfuly writing in cell");
//
//
  
