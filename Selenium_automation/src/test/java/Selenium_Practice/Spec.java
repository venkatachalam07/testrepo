package Selenium_Practice;



	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Spec {
		WebDriver driver;
		
		public WebDriver initialize()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		return driver;
				
		}
		
		
		
		
			
		
		
		@Test
		public void Verify_AddCustomer() throws InterruptedException
		{
			
			initialize();
		
		driver.manage().window().maximize();
			
			driver.get("https://demo.guru99.com/telecom/index.html");
			//click Add Customer link
			driver.findElement(By.xpath("//h3//a[text()='Add Customer']")).click();
		
			
			//Enter First Name
			driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("abc");
			
			//Enter Last Name
					driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("xyz");
					
			//Enter Email
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("xyz@GMAIL.COM");
			
			//Enter address
			driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("qwe");
			
			
			//Enter MOBILE
					driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("9887234509");
					
					
					//Enter MOBILE
					driver.findElement(By.xpath("//input[@name='submit']")).click();	
					
					
					//extract customer ID
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
					Thread.sleep(4000);
					List<WebElement> cusIDs = driver.findElements(By.xpath("//h4"));
					
					if(cusIDs.size()>0)
					{
								
						String cusID =cusIDs.get(0).getText();
						Assert.assertTrue(true);
						
								
								
					}
			
					else
					{
						
						Assert.assertTrue(false);
					}

					
					
					
		
		}
		
		@AfterMethod
		public void tearDown(ITestResult result)
		{
			
		double ms = result.getEndMillis()-result.getStartMillis();
			
		System.out.println(ms)
	;
		
		double seconds=ms/1000.0;
		
		System.out.println(seconds);
			
		  if(result.getStatus()==1)
		  {
			  System.out.println(result.getName() + " is passed");
		  }
		  else
		  {
			  System.out.println(result.getName() + " is failed");
		  }
		  
		  
		 // driver.quit();
		}




	}

