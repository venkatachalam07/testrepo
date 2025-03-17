package Selenium_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Launch  {
	
	static WebDriver driver;
	
	@Test
	public static void lunch() {
		
		WebDriverManager.chromedriver().setup();
		
        driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
	}
	
@Test
public void testtt() {
	
	System.out.println("Yes Run the Test Cases");
	
}

}
