package TestCasess;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Base_pack.Base_Class;
import Method_Defenition.Method_defenition_Class;

public class Test_Case {
	
	static WebDriver driver; 
	static  int  Number=0 ;
	static WebElement customerid;	
	Method_defenition_Class run;
	
	@BeforeMethod
	@Parameters("browser")
	public void Beforemethod(String browser) throws IOException {
		Base_Class b= new Base_Class();
		driver=b.launch(browser);
		run= new Method_defenition_Class(driver);
		
	}
	
	@Test   (priority=1)
	public void add_Customer() {		
		Method_defenition_Class.addccustomer();
		Method_defenition_Class.radiobtn();
		Method_defenition_Class.fname();
		Method_defenition_Class.lname();
		Method_defenition_Class.email();
		Method_defenition_Class.address();
		Method_defenition_Class.mobilenumber();
    
    WebElement Cmid = driver.findElement(By.tagName("h3"));
    String cusid =Cmid.getText();
    
    Number = Integer.parseInt(cusid);
	System.out.println(cusid);		
	}
	
	@Test (priority=2)	
	public void tariffPlanCustomer() {
		
        WebElement tpl=	 driver.findElement(By.xpath("(//*[text()='Add Tariff Plan to Customer'])[1]"));
	    tpl.click();
        String curenturl = driver.getCurrentUrl();
		System.out.println(curenturl);
		customerid= driver.findElement(By.id("customer_id"));
		customerid.click();
		
		customer_Id_Enter();
		
    	WebElement submitbtn= driver.findElement(By.xpath("//input[@type='submit']"));
		submitbtn.click();
		
		WebElement scrol = driver.findElement(By.xpath("//*[text()='Select Tariff Plans']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scrol);
		
	}
	
	
	 @Test (priority=3)
        public void payBilling() {
		System.out.println("Pay Billing");
	
		WebElement payBilling = driver.findElement(By.xpath("(//*[text()='Pay Billing'])[1]"));
		payBilling.click();
        System.out.println("Done");
		
		
		
	}
	
	
	
	
	public static void customer_Id_Enter() {
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+Number+"')",customerid);
	}
	
	
	
	@Test
	
	public void Billing() {
		System.out.println("Biiling Sucessfully");
	}
	
	
	@AfterMethod
	public void LastAction() {
		
		System.out.println("quit");
		
		
		 driver.quit();
	}
}
