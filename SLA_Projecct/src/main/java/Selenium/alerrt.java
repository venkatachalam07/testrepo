package Selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerrt {
	
	static WebDriver driver;
	
//	@Test
	public  void alertss() throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
	    driver.manage().window().maximize();
	 
	   WebElement  SwitchTo = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
	   SwitchTo.click();
	  
	   WebElement  alertt = driver.findElement(By.xpath("//a[text()='Alerts']"));
	   alertt.click();
	   
	   // simple Alert 
	  WebElement Simplealert =driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	  Simplealert.click();
	  Alert a= driver.switchTo().alert();
	  System.out.println(a.getText());
	  a.accept();
	  
	  //  Alert with OK & Cancel  prompt alert
	  
	  WebElement promatAlert =driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	  promatAlert.click();
	  
	  WebElement confirmbox =driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	  confirmbox.click();
	  a.dismiss();
	  
	  driver.navigate().refresh();
	  
	  WebElement altext =driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	  altext.click();
	  
	  WebElement promptbox =driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	  promptbox.click();
	  a.sendKeys("Automation Testing Venkat");
	  a.accept();
	
	  
	  
	  WebElement dd= driver.findElement(By.xpath("//p[@id='demo1']"));
	  System.out.println("Alert Box is ver importent"+dd.getText());
	  
	
	
	}
	
	
	
	
	@Test
	
	public void dynamicpopup() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.creditmantri.com/");
		
		WebElement loans =driver.findElement(By.xpath("//a[text()='Loans']"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(loans).build().perform();
		
		WebElement pl= driver.findElement(By.xpath("(//a[text()='Personal Loan'])[1]"));
		pl.click();
		
		WebElement down= driver.findElement(By.xpath("//h2[text()='Personal Loan Fees and Charges']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		
	
	}
	
	
	public static void Screenshots() throws IOException {
		
		
	TakesScreenshot tk= (TakesScreenshot)driver;
	
	File from = tk.getScreenshotAs(OutputType.FILE);
		
	File to= new File("E:\\Eclipse\\SLA_Projecct\\screenshots\\imagess.png");

	FileUtils.copyFile(from, to);
	
	
	}

}
