package Methods_Def_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Locatoers_Pack.Locaters_Demo;
import Wrap_Pack.Selenium_Methods;

public class Methods_Def {
	
	static WebDriver driver;
	
	public static void Methdsdriver(WebDriver methoddriver) {
		
		driver=methoddriver;
		
	}
	
	public static WebElement Thik() {
		Selenium_Methods.seleniumdriver(driver);
		WebElement Thik=Selenium_Methods.FindElementXpath(Locaters_Demo.Thik);
		Thik.click();
		return Thik;
		}
	
	public static WebElement addbasket() {
	WebElement Addbasket=Selenium_Methods.FindElementXpath(Locaters_Demo.addbasket);
	Addbasket.click();
	return Addbasket;}
	
	
	public static WebElement Viewbaskket() {
	WebElement Viewbasket=Selenium_Methods.FindElementXpath(Locaters_Demo.Viewbasket);
	Viewbasket.click();
	return  Viewbasket;
	}
	

}
