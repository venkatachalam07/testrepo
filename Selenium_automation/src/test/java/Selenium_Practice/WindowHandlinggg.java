package Selenium_Practice;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowHandlinggg extends Base_Class {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
	//	Windoww();
	//	selectRefExceeption();
    // 	noSearchElement();
	
		Noseachwindexception();
	}
	
	
	
	public static void Noseachwindexception() {
		
		edgedriver("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement openwindow = driver.findElement(By.id("openwindow"));
		openwindow.click();
		
	    String onewin=driver.getWindowHandle();
	    System.out.println(onewin);
		
	    Set <String> allwind =driver.getWindowHandles();
	    System.out.println(allwind);
		
	    ArrayList<String> winnn=new ArrayList<String>();
	    winnn.addAll(allwind);
	    driver.switchTo().window(onewin);
	    System.out.println("All Window"+winnn); 
	    System.out.println(driver.getTitle());
	    	
		
	}
	
	
	
	
	public static void noSearchElement() {
		edgedriver("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// This Right Xpath working find 
		driver.findElement(By.id("autosuggest")).sendKeys("Venkat");
		
		// This Wrong Xpath that time geting No Searchelemt 
		
		driver.findElement(By.id("autosugest")).sendKeys("Venkat");
		
	}
	
	public static void selectRefExceeption() throws InterruptedException {
		
		edgedriver("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement openwindow = driver.findElement(By.id("openwindow"));
		openwindow.click();
		
	    String onewin=driver.getWindowHandle();
	    System.out.println(onewin);
		
	    Set <String> allwind =driver.getWindowHandles();
	    System.out.println(allwind);
		
	    ArrayList<String> winnn=new ArrayList<String>();
	    winnn.addAll(allwind);
	    driver.switchTo().window(winnn.get(1));
	    System.out.println("All windddd"+winnn); 
	    System.out.println(driver.getTitle());
	    

	   List <WebElement> options=driver.findElements(By.xpath("//select[@class='form-control categories dynamic-text m-l']//option"));
	   for (int i=1;i<=options.size();i++) {
		   driver.findElement(By.name("categories")).click();
		  //  System.out.println(options.get(i).getText());
		    Thread.sleep(1000);
		    WebElement catagories = driver.findElement(By.xpath("(//select[@class='form-control categories dynamic-text m-l']//option)["+i+"]"));
            catagories.click();
            Thread.sleep(3000);
            WebElement catagoriess = driver.findElement(By.xpath("(//select[@class='form-control categories dynamic-text m-l']//option)["+i+"]"));
            String  text =catagoriess.getText();
         //  System.out.println(text);
            List <WebElement> titilecount = driver.findElements(By.xpath("//h4[@class='dynamic-heading']"));
         System.out.println(text +"= "+titilecount.size()); 
            
	   }
	    
	    
	    
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public static void Windoww() throws InterruptedException {
	
	edgedriver("https://www.letskodeit.com/practice");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement openwindow = driver.findElement(By.id("openwindow"));
	openwindow.click();
	
	
    String onewin=driver.getWindowHandle();
    System.out.println(onewin);
	
    Set <String> allwind =driver.getWindowHandles();
    System.out.println(allwind);
	
   
    
    ArrayList<String> winnn=new ArrayList<String>();
    winnn.addAll(allwind);
    driver.switchTo().window(winnn.get(1));
    System.out.println("All windddd"+winnn); 
    System.out.println(driver.getTitle());
//   
//    
//    List <WebElement>  alloption= driver.findElements(By.xpath("//select[@name='categories']//option"));
//   
//    List <WebElement>  selectopt= driver.findElements(By.xpath("//select[@class='form-control categories dynamic-text m-l']//option"));


    WebElement select= driver.findElement(By.xpath("//select[@name='categories']"));
    
   Select sc=new Select(select);
  
 List<WebElement> alloption= sc.getOptions();
 
 
 int Countts =0;
 for(WebElement options:alloption) {
	 
	 
	 System.out.println(options.getText());
	 
	 switch(options.getText()) {
	 
	 
	 case  "All":{
		 
		 options.click();	
		 Thread.sleep(8000);
	List <WebElement> pageoptions= driver.findElements(By.xpath("//h4"));
	System.out.println(pageoptions.get(0).getText());
	  Countts= pageoptions.size();	 
	  System.out.println(Countts);
		 break;
		 
	 }
 case  "Sotfware Testing":{
	 
	 options.click();	
	 Thread.sleep(8000);
List <WebElement> pageoptions= driver.findElements(By.xpath("//h4"));
System.out.println(pageoptions.get(0).getText());
  Countts= pageoptions.size();	 
  System.out.println(Countts);
	 break;
	 
 }
 
 case  "Software Development":{
	 
	 options.click();	
	 Thread.sleep(8000);
List <WebElement> pageoptions= driver.findElements(By.xpath("//h4"));
Thread.sleep(2000);
System.out.println(pageoptions.get(0).getText());
  Countts= pageoptions.size();	 
  System.out.println(Countts);
	 break;
	 
	 
 }
 case  "Test Automation":{
	 
	 options.click();	
	 Thread.sleep(8000);
List <WebElement> pageoptions= driver.findElements(By.xpath("//h4"));
System.out.println(pageoptions.get(0).getText());
  Countts= pageoptions.size();	 
  System.out.println(Countts);
	 break;
	 
 }
	 
 
 
case  "Python":{
	 
	 options.click();	
	 Thread.sleep(8000);
List <WebElement> pageoptions= driver.findElements(By.xpath("//h4"));
System.out.println(pageoptions.get(0).getText());
  Countts= pageoptions.size();	 
  System.out.println(Countts);
	 break;
	 
 }
		 
		
	 }} }
	
	 
	 
	 
	 
	   
      
   
   

public static void gettext() {
List <WebElement> suboption= driver.findElements(By.xpath("//h4[@class='dynamic-heading']"));
for(int i=0;i<suboption.size();i++) {
	  String ss =suboption.get(i).getText();  
	  System.out.println(ss);
	 
	  
	  
	  
	  }}
	



}
