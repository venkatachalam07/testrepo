package Test_Case;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseClass;
import Defanitions.Method_def;

public class TestCase {
	
	WebDriver driver;
	
	@Test (priority=1)
	public void Testcase1() throws IOException {
		BaseClass bs=new BaseClass();
		driver=bs.browser_lunch();
		driver.manage().window().maximize();	
	}
	
	
	@Test(priority=2)
	public  void Testcase2() throws IOException {
		Method_def.mdefdriver(driver);	
		FileInputStream fis=new FileInputStream("E:\\Eclipse\\KeywordDriven\\ExcelFile\\keywords.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(fis);	
	XSSFSheet sheet= workbook.getSheetAt(0);
for (int i=1;i<sheet.getLastRowNum()+1;i++) {
	XSSFRow row= sheet.getRow(i);
	XSSFCell cell =row.getCell(3);
    String keywords= cell.getStringCellValue();
	System.out.println("keywordss :::   "+keywords);
		
	if(keywords.equalsIgnoreCase("Browserlunch")) {
		Method_def.Verifyurl();
		}
	else if(keywords.equalsIgnoreCase("Gotopaymentpage")) {
	}
	else if(keywords.equalsIgnoreCase("EnterPayment")) {
		Method_def.Clickbuyredaritedtopaymentpage();
		
	}else if (keywords.equalsIgnoreCase("Pay"))
		Method_def.Enterthepaymentdetails();
		
	}	
}
}
