package Gen_Wrap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ObjectRepository.ElementLocation;

public class Wrap {
	static WebDriver driver;
	
	public static void get_driver(WebDriver dd)
	{
		driver = dd;
	}

public static WebElement locateElement(String xpath_val)
{
	WebElement element = driver.findElement(By.xpath(xpath_val));
	return element;
}


}