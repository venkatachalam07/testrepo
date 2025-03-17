package BasePack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	
	static WebDriver driver;
		
	
	
	
	public WebDriver LaunchBrowserBase() throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.get(" https://demo.guru99.com/payment-gateway/index.php");	
	driver.manage().window().maximize();	
	
//		if(browser.equalsIgnoreCase("chrome")) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		}
//		else if (browser.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
//		
//		Properties prop= new Properties();
//		FileInputStream fis= new FileInputStream("E:\\Eclipse\\SLA_Projecct\\src\\test\\java\\TestData.properties");
//		prop.load(fis);
//		driver.manage().window().maximize();
//		driver.get(prop.getProperty("URL"));
		return driver;		
	}








}
