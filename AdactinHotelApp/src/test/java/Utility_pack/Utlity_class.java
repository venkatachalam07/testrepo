package Utility_pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utlity_class {
	
	static WebDriver driver;
	public static Properties prop;
	
	public static void  property_file() throws IOException {
		 prop= new Properties();
		
		FileInputStream fis= new FileInputStream("E:\\Eclipse\\AdactinHotelApp\\src\\test\\java\\TestData.properties");
		prop.load(fis);	
		
		
	}

}
