package Selenium_Practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Learn {
	
	static WebDriver driver;
	
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
    driver.get("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	
	
	WebElement Textbox = driver.findElement(By.name("enter-name"));
	Textbox.sendKeys("Venkat");
	
	driver.findElement(By.id("confirmbtn")).click();
Alert al=	driver.switchTo().alert();
     String almsg= al.getText();
     
     System.out.println(almsg);
     
 
   String [] name=  almsg.split(",");
   
   
   String spcipickname = name[0];
   
   String [] content =spcipickname.split(" ");
   
   String alname=content[1];
    
  
   if(alname.equalsIgnoreCase("Venokat")) {
	   
	   al.accept();
   }else {
	
	   al.dismiss();
	   
	   System.out.println("Cancel");
	   
	   
	   
}
   
   
     
	
	

}}
