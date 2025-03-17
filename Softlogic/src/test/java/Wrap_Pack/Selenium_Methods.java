package Wrap_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium_Methods {
	
	static WebDriver driver;
	
	
	
	public static void seleniumdriver( WebDriver seldriver) {
		driver=seldriver;
		
	}
	
	
	public static WebElement FindElementXpath(String str) {	
     WebElement webele=driver.findElement(By.xpath(str));
		return webele;
		
		
	}


	
	
	

}
