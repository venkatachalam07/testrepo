package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Seleniumm extends Base_Class {
	
	public static void main(String[] args) throws InterruptedException {
		
	//	greentech();
		
		//fb();
		
		
		fbacCoutCreation();
		
		
	}
	
	
	public static void fbacCoutCreation() {
	chromeBrowserLunch("https://www.facebook.com/");
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
	 WebElement firstname=driver.findElement(By.name("firstname"));
	 JavascriptExecutor js= (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].setAttribute('value','Venkatachaalam')", firstname);
	 WebElement lastname= driver.findElement(By.name("lastname"));
	 js.executeScript("arguments[1].setAttribute('value','Babu')", firstname,lastname);
	 

	 WebElement element=  driver.findElement(By.name("reg_email__"));
	 js.executeScript("arguments[2].setAttribute('value','venkatahsghj@gmail.com')", firstname,lastname,element);
	 String value = (String) js.executeScript("return arguments[0].value;", element);
     System.out.println(value);
	
	}
	
	
	public static void fb() throws InterruptedException {
		
		chromeBrowserLunch("https://www.facebook.com/");
		WebElement username= driver.findElement(By.id("email"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].setAttribute('value','Venkatachalam@sfotlogic')",username);

		WebElement pass= driver.findElement(By.id("pass"));
	    
	    
	    js.executeScript("arguments[1].setAttribute('value','9994513831')",username,pass);
		System.out.println("It is done");

	}
	
	public  static void greentech() throws InterruptedException {	
    chromeBrowserLunch("http://www.greenstechnologys.com/");
    WebElement scrool=driver.findElement(By.xpath("//*[text()='Greens Technologies Porur']")); 
	
    JavascriptExecutor js=(JavascriptExecutor)driver;

    js.executeScript("window.scrollBy(0,1000");


    js.executeScript("window.scrollTo(0.document.body.scrolHeight)");


    js.executeScript("arguments[0].scrollIntoView()",scrool);
    WebElement scrolup=driver.findElement(By.xpath("(//p//a[@target='_blank'])[1]"));
    Thread.sleep(4000);
    js.executeScript("arguments[0].scrollIntoView(false)",scrolup);

	}
	
	
	
}
