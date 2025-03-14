package Base_pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Parameter;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utility_pack.Utlity_class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	static WebDriver driver;
	
	
		
public  WebDriver launch( ) throws IOException
{
	
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	Utlity_class.property_file();
	
	driver.get(Utlity_class.prop.getProperty("URL"));
	return driver;
}
	

}
