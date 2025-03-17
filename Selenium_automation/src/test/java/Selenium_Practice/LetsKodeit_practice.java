package Selenium_Practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LetsKodeit_practice  extends Base_Class {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.letskodeit.com/practice");
	  
	
		
	}
	
public static void wikipidiya() throws InterruptedException {
    
	 chromeBrowserLunch("https://www.wikipedia.org/");
	driver.manage().window().maximize();
	WebElement searchbox= driver.findElement(By.id("searchInput"));
	searchbox.click();
	searchbox.sendKeys("Software engineer");
	Thread.sleep(3000);
	WebElement Eng_click= driver.findElement(By.xpath("//h3[text()='Software engineering']"));
	Actions a=new Actions(driver);
	a.moveToElement(Eng_click);
	Eng_click.click();
	System.out.println(driver.getCurrentUrl());
	
	
}
	
	
}
