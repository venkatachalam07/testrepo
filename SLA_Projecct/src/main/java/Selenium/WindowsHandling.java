package Selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	
	WebDriver driver;
	
@Test

public void window() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
        WebElement BuyNow=driver.findElement(By.xpath("//input[@value='Buy Now']"));
		JavascriptExecutor js= (JavascriptExecutor)  driver;
		js.executeScript("arguments[0].scrollIntoView(true)", BuyNow);
       	js.executeScript("arguments[0].click()",BuyNow);
        driver.findElement(By.xpath("(//a[text()='Generate Card Number'])[1]")).click();
        
    String singlewindows=  driver.getWindowHandle();
    Set<String> multiplewindows = driver.getWindowHandles();
 
 for (String window:multiplewindows) {
if(!window.equals(singlewindows)) {
	driver.switchTo().window(window);
	break;
}}

        List <WebElement> carddetails= driver.findElements(By.xpath("//h4[@style='text-align:center;font-size:24px;font-weight:400;color:#555;line-height:36px;']"));
           
    	js.executeScript("arguments[0].scrollIntoView(true)", carddetails.get(1));
    
    	 for(WebElement eachele:carddetails) {
         System.out.println(eachele.getText());
         }
    	
		

}




	
}
