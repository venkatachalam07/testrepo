package Base_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Met {

	 static WebDriver driver;
	
	
	
	public static void Basedriver(WebDriver basedriver) {
		
		driver=basedriver;		
		
	}
	
	public static  WebDriver BaseLanch() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://practice.automationtesting.in/");
		return driver;
	}
	
	
	
	
}
