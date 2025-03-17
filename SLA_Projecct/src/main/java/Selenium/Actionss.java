package Selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionss {

	static WebDriver driver;
	@Test
	public  void Actionsss() throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://sandbox.mabl.com/");
	    driver.manage().window().maximize();

	    
	    
	    
	    
	    
	    
	    
	    
}
}