package Selenium_Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	static WebDriver driver;
	
	

	public static String chromeBrowserLunch( String s) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(s);
		return s;
	
		}	
	
	
	
	
	public static String edgedriver(String e ) {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 driver.get(e);
		return e;
		
	}
		
	
	public static WebElement Javaclick(WebElement ff) {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", ff);
		return ff;
	
	}
}
