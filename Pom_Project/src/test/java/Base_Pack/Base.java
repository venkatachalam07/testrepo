package Base_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Function_Defention.FunctionRun01;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	static WebDriver driver;
	// FunctionRun01 run;
public  void verify_launch_browser()
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.letskodeit.com/practice");
}




}