package FirstSampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru99 {
	

	static WebDriver driver; 
	
	static  int  Number=0 ;
	
	@BeforeMethod
	public void Beforemethod() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
		
	}

	@Test
	public void add_Customer() {	
		
		
  WebElement addccustomer=   driver.findElement(By.xpath("(//*[text()='Add Customer'])[1]"));		
   addccustomer.click();
		
    WebElement radiobtn=driver.findElement(By.xpath("//*[text()='Done']"));
    radiobtn.click();
    WebElement fname=driver.findElement(By.id("fname"));
    fname.sendKeys("Venkat");
    
    WebElement lname=driver.findElement(By.id("lname"));
    lname.sendKeys("Babu");

    WebElement email=driver.findElement(By.id("email"));
    email.sendKeys("venkaktatt@gmai.com");		

    WebElement ad=driver.findElement(By.name("addr"));
    ad.sendKeys("No 30 Metustreet");

    WebElement telephoneno=driver.findElement(By.id("telephoneno"));
    telephoneno.sendKeys("9993376732");
    
    WebElement telephone=driver.findElement(By.xpath("//input[@type='submit']"));
    telephone.click();
    
    WebElement Cmid = driver.findElement(By.tagName("h3"));
    String cusid =Cmid.getText();
    
    Number = Integer.parseInt(cusid);
	System.out.println(cusid);		
	}

	
// get the text 	//Congratulation Tariff Plan assigned
	
	
	
	@Test
	
	
	public void tariffPlanCustomer() {

		
        WebElement tpl=	 driver.findElement(By.xpath("(//*[text()='Add Tariff Plan to Customer'])[1]"));
	    tpl.click();
        String curenturl = driver.getCurrentUrl();
		System.out.println(curenturl);
		WebElement customerid= driver.findElement(By.id("customer_id"));
		customerid.click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+Number+"')",customerid);
			
    	WebElement submitbtn= driver.findElement(By.xpath("//input[@type='submit']"));
		submitbtn.click();
		
		
	}
	
	
	@Test
public void payBilling() {
		System.out.println("Pay Billing");
	
		WebElement payBilling = driver.findElement(By.xpath("(//*[text()='Pay Billing'])[1]"));
		payBilling.click();
		
		
		
		
	}
	
	@AfterSuite
	public void LastAction() {
		
		System.out.println("quit");
		
		
		// driver.quit();
	}

}
