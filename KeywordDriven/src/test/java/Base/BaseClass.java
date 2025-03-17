package Base;

import java.io.IOException;
import java.net.URL;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Java_Pack.Java_Methods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;
	
	public   WebDriver browser_lunch() throws IOException {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	Java_Methods.Properties();
	driver.get(Java_Methods.prop.getProperty("URL"));
	return driver;
		
	}
	
	

}
