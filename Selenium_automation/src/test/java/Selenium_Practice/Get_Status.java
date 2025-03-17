package Selenium_Practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Status {
	
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		
		
	List<WebElement> alllinks	=driver.findElements(By.tagName("a"));
	
	for(WebElement links:alllinks) {
		
	String Spcipicklink=	links.getAttribute("href");
	System.out.println("");
    System.out.println(Spcipicklink);		
    System.out.println(links.getText());
    
    
    try {
    	
    	URL urllink=new URL(Spcipicklink);
    	HttpURLConnection Contionopen= (HttpURLConnection) urllink.openConnection();
         Contionopen.connect();
    	
     int ResponseCode =Contionopen.getResponseCode();
  
     System.out.println(Spcipicklink +"=="+ResponseCode);
    
     
     if (ResponseCode>=200) {
    	 
    	 System.out.print("This URL is correct --->");
    	 
    	 System.out.println(Spcipicklink);
    	 
     }else {
    	
    	 
    	 System.out.println(Spcipicklink+" -->THIS Link Was Broken ");
    	 System.out.println("");
     }
      
    }
    catch(Exception e){	
    	System.out.println("==========Status Code URLS========== " + Spcipicklink );
    	
    	
    }
		
		
	}
		
		
	}

}
