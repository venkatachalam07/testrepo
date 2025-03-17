package Defanitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Method_def {

	static WebDriver driver;
	
	
	public static void mdefdriver(WebDriver mdriver) {
		
		driver=mdriver;
		
	}
	
	
	
     public static void Verifyurl() {	
    	 WebElement Buynow = driver.findElement(By.xpath("//input[@type='submit']"));
    	 Buynow.click();
     }

	

	
	public  static void Clickbuyredaritedtopaymentpage () {
WebElement weaccpt=driver.findElement(By.xpath("//h4[text()='We accept']"));
JavascriptExecutor js= (JavascriptExecutor)	driver;
js.executeScript("arguments[0].scrollIntoView(true)", weaccpt);

	
	}


	public static void Enterthepaymentdetails () {
	 WebElement	cardnum =driver.findElement(By.id("card_nmuber"));
     cardnum.sendKeys("9878473287987654");
	 WebElement	month =driver.findElement(By.id("month"));
	 Select sc= new Select(month);
	 sc.selectByValue("9");
	 WebElement	year =driver.findElement(By.id("year"));
	 Select ss= new Select(year);
	 ss.selectByValue("2026");
	 WebElement	cvv_code =driver.findElement(By.id("cvv_code"));
	 cvv_code.sendKeys("765");
	}

	

	
	public void ClickandPay() {
		
		
	}


	
	
}
