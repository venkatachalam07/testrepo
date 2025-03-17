package Selenium_Practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Testng.Guru99;
import io.github.bonigarcia.wdm.WebDriverManager;

// driver.get("https://demo.guru99.com/test/drag_drop.html");
public class Actionns {
	
	static WebDriver driver;

	
	
	public static String BrowserLunch(String str) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get(str);
		return str;
		
		
	}
	
	

	
	public static void main(String[] args) throws InterruptedException {
		
	//	letskodeit();
    
	 	guru99();
		
		
// 		amazon();
		

	//	flipkart();
    
  
	}
	
	public static  void flipkart() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
			
		driver.manage().window().maximize();
		
		WebElement homefun= driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
		
		Actions ac= new Actions(driver);
		
		ac.moveToElement(homefun).perform();
		
		WebElement Blankets= driver.findElement(By.xpath("//*[text()='Blankets']"));
		
		Blankets.click();
		
		
		

		
		
		
	}
	
	
	

	  public static void amazon() throws InterruptedException {
		
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	
	WebElement prime= driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[5]"));
	Thread.sleep(4000);
	
	Actions ac= new Actions(driver);
	ac.moveToElement(prime).perform();
	
	Thread.sleep(4000);
	
	
	WebElement baner= driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
	baner.click();
//	
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	public  static void guru99() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement scroll= driver.findElement(By.xpath("//*[text()='Note:']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",scroll);
		
		Actions ac= new Actions(driver);
	  
	WebElement drag= driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement drop= driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
	// Drag and Drop Function 
	ac.dragAndDrop(drag, drop).build().perform();
	WebElement drop2= driver.findElement(By.xpath("(//ol[@align='center'])[2]"));
	ac.dragAndDrop(drag, drop2).build().perform();
	WebElement bank= driver.findElement(By.xpath("//*[text()=' BANK ']"));
	// Click and hold function  
    ac.clickAndHold(bank).perform();
    WebElement accout1= driver.findElement(By.xpath("(//ol[@align='center'])[1]"));
    // Move to Element Function
    ac.moveToElement(accout1).release().perform();

    
  	WebElement sales= driver.findElement(By.xpath("//*[text()=' SALES ']"));
  	WebElement drop3= driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
  	ac.dragAndDrop(sales, drop3).build().perform();
  	WebElement drop4= driver.findElement(By.xpath("(//ol[@align='center'])[4]"));
  	ac.dragAndDrop(drag, drop4).build().perform();
  
    // if any button was clicked  you can use this methods
    ac.doubleClick();

  
	




	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void  letskodeit() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	     driver.get("https://www.letskodeit.com/practice");
	       WebElement textbox= driver.findElement(By.xpath("//input[@name='enter-name']"));
	    Actions ac=new Actions(driver);
	    ac.moveToElement(textbox).click().sendKeys(textbox, "VenkatBabu").perform();
	    WebElement Albtn= driver.findElement(By.id("alertbtn"));
	    Albtn.click();
	  Alert  alert = driver.switchTo().alert();
	  System.out.println(alert.getText());
	    alert.accept();
	    
	    
	    
	    
	    
	    driver.close();
		
	}
	
	
	
}
