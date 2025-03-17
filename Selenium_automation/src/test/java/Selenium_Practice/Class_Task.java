package Selenium_Practice;

import static org.testng.Assert.assertEquals;

import java.sql.Time;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.gson.annotations.Until;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_Task extends Base_Class {

	
	public static void main(String[] args) {
		
		looping();
	//	iframess();
	//	sandbox();
		
		
		
		}
		
	
	
	
	
	
	
	public static void iframess() {
		
		chromeBrowserLunch("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame("courses-iframe");
		
WebElement allcourse=driver.findElement(By.xpath("//h1[text()='All Courses']"));
		
		System.out.println(allcourse.getText());
		
		
		
		
	 WebElement Scarch	= driver.findElement(By.xpath("//input[@id='search']"));
	 Scarch.sendKeys("WebDriver");

	 WebElement Scarchbtn	= driver.findElement(By.xpath("//button[@class='find-course search-course']"));
	 Scarchbtn.click();
	 

	 List<WebElement> Contentt	= driver.findElements(By.xpath("//h4[@class='dynamic-heading']"));
	
	 
for(int i=0;i<Contentt.size();i++) {	
	String dd=Contentt.get(i).getText();
	 
	 System.out.println(dd);
	 
}
		
		
		
	}
	
	
	public static void looping () {
	
		
chromeBrowserLunch("https://sandbox.mabl.com/");
driver.findElement(By.xpath("//span[text()='looping']")).click();


// WebDriver   wait = new WebDriver(driver,10);

WebElement count =driver.findElement(By.xpath("//span[text()='+']"));

for(int i=0;i<10;i++) {
	count.click();
}
		
 WebElement  countnum =driver.findElement(By.xpath("(//div[contains(@class,'MuiBox-root ')])[1]"));
 System.out.println("CountText :  "+countnum.getText());

	}
	
	public static void sandbox() {
		
		

		
chromeBrowserLunch("https://sandbox.mabl.com/dropdowns");

driver.manage().window().maximize();

 //driver.manage().timeouts().implicitlyWait(, null)
   WebElement daydropdown= driver.findElement(By.xpath("//select[@id='day']"));
   daydropdown.click();
   Select sc=new Select(daydropdown);
   
 //  sc.selectByIndex(2);
   
//  
//   sc.selectByVisibleText("Wednesday");
//   
//   sc.selectByValue("Friday");
   
   daydropdown.click();
   List <WebElement>  allopt =sc.getOptions();
   for (int i=0;i<allopt.size();i++) {
	  String alltext= allopt.get(i).getText();
	  System.out.println(alltext);
	   
   }
   
   
   
	}
	
	public void letskodeit() {
		
		chromeBrowserLunch("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();	
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the Checkbox car name");
//		String checkboxcar=sc.next();
//		String checbtn=checkboxcar.toLowerCase();
//        WebElement checkbox = driver.findElement(By.xpath("//input[@value='"+checbtn+"' and @type='checkbox']"));
//        checkbox.click();
//         System.out.println("SucessfullyClicked"   );	
//		
		
//          Find Honda check box is available from Array List using Linear search algorithm

         
     	System.out.println("Enter the check box in the Cars");
     	String checkboxcar1=sc.next();
     	String checkbtn1=checkboxcar1.toLowerCase();

	List<WebElement> Check_box =driver.findElements(By.xpath("//input[@type='checkbox'and @value='"+checkbtn1+"']"));
	   String Venkat = ((WebElement) Check_box).getText();		
		for(int i=0;i<Check_box.size();i++) {
			
			
	
		
		if (Check_box.equals(Venkat)) {
			((WebElement) Check_box).click();
			
			
		}else {
			
			
			System.out.println("Give Check box is not there");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
