package TestCase_Pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Pack.Base_Met;
import Methods_Def_Pack.Methods_Def;
import My_Report.MyReport;

public class TestCase_Demo {

	
	static WebDriver driver;
	
	
	@BeforeMethod
	public  static void TestAuto() {
		Base_Met.Basedriver(driver);
	    driver=Base_Met.BaseLanch();
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void demoSide() {
		Methods_Def.Methdsdriver(driver);
		Methods_Def.Thik();
		Methods_Def.addbasket();
		Methods_Def.Viewbaskket();
		
		
	
	
	}
	
	
	public static void choesanybook() {
		String [] value = {"Thinking in HTML","Selenium Ruby","Mastering JavaScript"};
	List<WebElement> content =driver.findElements(By.tagName("h3"));
	for(WebElement singleWebe:content ) {
		for(int i=0;i<value.length;i++) {
	if(singleWebe.getText().equalsIgnoreCase(value[0])) {
		singleWebe.click();
	}
	}
	}
			
	}
	
	@AfterMethod
	public void driverClose() {
		MyReport.myreportdriver(driver);
	}

}
