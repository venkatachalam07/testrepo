package TestCase;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BasePack.Base_class;
import Method_Def.Defanitions;
import Wrap_Pack.Selenium_Methods;

public class TestRunner {
	
	WebDriver driver;
	
	@Test 
	
	
	public void guruPaymentGwetway() throws IOException, InterruptedException {	
	Base_class b= new Base_class();
	driver=b.LaunchBrowserBase();
	
	Defanitions.derfdriver(driver);
	Defanitions.buyNow();
    Defanitions.getCardNum();
    Defanitions.getWindowHandles();
    Defanitions.cardimage();
    Defanitions.getCardDetails();
    Defanitions.getWindowHandles();
    WebElement cnnum= driver.findElement(By.id("card_nmuber"));
    Selenium_Methods.scroll(cnnum);
    cnnum.sendKeys(Defanitions.value.get(0));
    String cd=Defanitions.value.get(2);
    System.out.println(cd);
    
 String month = (String) cd.subSequence(0, 2);
  String year =(String) cd.subSequence(2, cd.length());
  
  System.out.println(month);
  System.out.println(year);
  
  
  WebElement monthh= driver.findElement(By.id("month"));
  Select sc= new Select(monthh);
  sc.selectByVisibleText(month);


  WebElement yearr= driver.findElement(By.id("year"));
  Select scs= new Select(yearr);
  scs.selectByValue(year);
    
    WebElement cvv_code= driver.findElement(By.id("cvv_code"));
    cvv_code.sendKeys(Defanitions.value.get(1));
   
   driver.findElement(By.name("submit")).click();
    
   
   WebElement orderid = driver.findElement(By.tagName("strong"));
   Thread.sleep(5000);
System.out.println(orderid.getText());
   
	}
	
	@Test
public void Testcase2() {
		
		System.out.println("Testcase2");
		
	}


}
