package Base_pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	
	static WebDriver driver;
	
	
public static WebDriver launch(String browser ) throws IOException {
	
	if(browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();	
	}

else if (browser.equalsIgnoreCase("edge")) {
	
	WebDriverManager.edgedriver().setup();
	driver= new EdgeDriver();
}

	
	Properties prop= new Properties();
	FileInputStream fis=new  FileInputStream("E:\\Eclipse\\POM_Design\\src\\test\\java\\TestData.properties");
	prop.load(fis);

	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	return driver;
}
	

}
