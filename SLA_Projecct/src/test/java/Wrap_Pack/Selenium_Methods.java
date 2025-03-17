package Wrap_Pack;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Selenium_Methods {
	
	static WebDriver driver;
	
	public  static void selDriver(WebDriver seldriver) {
		driver = seldriver;
	}
	
	
	public static WebElement Elementlocaterxpath(String str) {
		 WebElement xpath= driver.findElement(By.xpath(str));
		return xpath;
}

	public static List<WebElement> ElementlocatorssXpath(String str) {
		List<WebElement> elements= driver.findElements(By.xpath(str));
		return elements;
	}
	
	public static  WebElement scroll(WebElement webelement) {
		JavascriptExecutor js= (JavascriptExecutor)  driver;
		js.executeScript("arguments[0].scrollIntoView(true)", webelement);
		     return webelement; 
	}
	
	
	
	public static WebElement javaclik( WebElement element) {
		JavascriptExecutor js= (JavascriptExecutor)  driver;
	 	js.executeScript("arguments[0].click()", element);
	 	 return element;
		
	}





	
	

}
