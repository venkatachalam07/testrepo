package TestNg;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Selenium.Base_Class;



public class FlipKart {
	


		@BeforeClass
		
		public void browserlunch() {
			
			
			Base_Class bs=new Base_Class();
	     bs.  chromeBrowser();
		bs.	urlLaunch("http://www.flipkart.com/");
			bs.maximize();
		}
		
		@Test
		public void MobileSelection() throws AWTException {
			Base_Class bs=new Base_Class();
			
			System.out.println("Start");
			
			WebElement search= bs.driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
			search.click();
			search.sendKeys("Nothing 2a Mobile");
			
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			List <WebElement> Mobilename=  bs.driver.findElements(By.xpath("//div[@class='KzDlHZ']"));	
			
			List <WebElement> MobilePrice=  bs.driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));	

			System.out.println(	MobilePrice.get(2).getText());
			
			for(WebElement singlename:Mobilename) {
				
			
			
				String mbn =singlename.getText();
				
			String sp=	mbn.replaceAll("[^A-Z,a-z]", "");
			
			System.out.println(sp);
			
				
				
			}
				
		
			for(WebElement singlemobileprice:MobilePrice) {
			System.out.println(singlemobileprice.getText());
			String ss=singlemobileprice.getText();
			//if() {
				
				System.out.println("This is Valid Mobile Number");
				
				
				
		//	}
				
			}

}}





  




