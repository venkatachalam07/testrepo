package Wrop_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Object_Repository.Element_Locations;

public class wrop {

	
	static WebDriver driver;
	
	
	public static void getdriver(WebDriver wripdriver) {
		
		driver=wripdriver;
		
	}
		
	public static WebElement locateElement(String Elment_location) {
	WebElement element= driver.findElement(By.xpath(Elment_location));
	return element;
	
	}
	  
}
