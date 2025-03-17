package Selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Super_Calculator extends Base_Class {
	
	
	public static void main(String[] args) {
		
		Calculator();
		
		
	}
	
	
	
	public static void Calculator() {
		
		
		chromeBrowserLunch("https://juliemr.github.io/protractor-demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 WebElement	textbox = driver.findElement(By.xpath("//input[@ng-model='first']"));
	 textbox.click();
	 textbox.sendKeys("5");
	 
	 WebElement	dropdown = driver.findElement(By.xpath("//select[@ng-model='operator']"));
	 
	 Select sc= new Select(dropdown);
	 sc.selectByValue("MULTIPLICATION");
	  
	 WebElement	textbox2 = driver.findElement(By.xpath("//input[@ng-model='second']"));
	 textbox2.click();
	 textbox2.sendKeys("6");
	 
	 WebElement	gobutton = driver.findElement(By.id("gobutton"));
	 gobutton.click();
	
	 
	 
	WebElement gettexts = driver.findElement(By.xpath("//h2[@class='ng-binding']")); 
	String result=gettexts.getText();
	
	
	String values= "30";
	
	if(result.equalsIgnoreCase(values));
	
	
	System.out.println("It is equal");
	
	
		
	}
	

}
