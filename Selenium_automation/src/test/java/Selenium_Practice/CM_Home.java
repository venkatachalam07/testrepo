package Selenium_Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CM_Home {
	
	
static WebDriver driver;
	
public static void main(String[] args) throws IOException {
	

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
driver.get("https://www.creditmantri.com/");
	driver.manage().window().maximize();
	// 
	
	List<WebElement>   cml = driver.findElements(By.tagName("a"));
	
	
	for (WebElement links:cml) {
	    String dd=	links.getAttribute("href");
	   // System.out.println(dd);
	    URL ur= new URL(dd);
	 HttpURLConnection contion=(HttpURLConnection) ur.openConnection();
	 contion.connect();
	 int statuscode = contion.getResponseCode();
	 System.out.println(dd+"="+statuscode);
	    
	    
	
	}
	
	
	

}}