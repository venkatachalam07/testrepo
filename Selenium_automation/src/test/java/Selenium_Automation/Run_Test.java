package Selenium_Automation;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Run_Test {
	
	static WebDriver driver;
	public static void main(String[] args) {		
			//launch browser
			
//			verify_heading();
//			verify_textbox_displayed();
			
//			gettext();
//			System.out.println(gettext());
			
			
			
			
			// verrifytheCheckBox();
		      BrowserLunch();
		   //   ClicktheRadiobutton();
			// verrifytheCheckBoxlable();
			
		}
	
	
	
	public static void BrowserLunch() {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
	//	driver.manage().window().maximize();
		
		//driver.get("https://www.letskodeit.com/practice");
		driver.navigate().to("https://www.letskodeit.com/practice");
		System.out.println("Title "+driver.getTitle());
		String actualURL = driver.getCurrentUrl();
		String ExpectedURl = "https://www.letskodeit.com/practice";
		if(actualURL.equalsIgnoreCase(ExpectedURl))
		{
			System.out.println("URL is correct");
		}	
		
	}
	
	
	public static void verrifytheCheckBox() {
		
		
//	ArrayList<Integer> cht_lab= new ArrayList<Integer>();
//		
//		List<WebElement> elament=(List<WebElement>) driver.findElement(By.xpath("//div[@id='checkbox-example-div']//input"));
//		
//		for (int i=0;i<elament.size();i++) {
//			
//			elament.get(i);
//			
//		}
		
		
		//step1:Find the address of all the three check box
		List<WebElement> elements_chk= driver.findElements(By.xpath("//div[@id='checkbox-example-div']//input"));
		
		for(int i=0;i<elements_chk.size();i++)
		{
		elements_chk.get(i).click();

		}
		}
		
		
	
public static void 	verrifytheCheckBoxlable() {
	
	List<WebElement> lables=  driver.findElements(By.xpath("//div[@id='checkbox-example-div']//label"));
	
	String []Expectedoutput = {"BMW","Benz","Honda"};
	
	for(int i=0;i<lables.size();i++) {

      String actural =lables.get(i).getText();


     if(actural.equals(Expectedoutput[i])) {
	
	         Assert.assertTrue(true);
     
}else {
	
	 	assertEquals(actural, Expectedoutput[i]);

}

}

	
}
	
	
	
		
	public static boolean gettext() {
		
		
		
		String ExceptedResult ="Radio Button Example";
		
		WebElement Text =driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
		
	String 	acturalresult = Text.getText();
	
	System.out.println("ExceptedResult content = "+ExceptedResult);
	
	System.out.println("actural content  = "+acturalresult);
		
	if (acturalresult.equalsIgnoreCase(ExceptedResult)) {
		
		System.out.println("It is Same text");
		
	}else {
		
		
		System.out.println("It is not mached content");
	}
	
	 Assert.assertEquals(acturalresult, ExceptedResult);
	return true;
		
		
	}
	
	
	public static void ClicktheRadiobutton() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car name");
		String carvalue=sc.next();
		String car=carvalue.toLowerCase();
		WebElement radiobtn = driver.findElement(By.xpath("//input[@value='"+car+"' and @type='radio' ]"));
		radiobtn.click();
        System.out.println("Enter the Checkbox car name");
		String checkboxcar=sc.next();
		String checbtn=checkboxcar.toLowerCase();
        WebElement checkbox = driver.findElement(By.xpath("//input[@value='"+checbtn+"' and @type='checkbox']"));
        checkbox.click();
		}
		
		public static void verify_heading()
		{//Step1: Find the address of the webelement
	//WebElement heading=driver.findElement(By.xpath("//h1[@data-uniqid='1621702280245']"));
			WebElement heading = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
			//Step2: Verify it is displayed.
        boolean present = heading.isDisplayed();
       System.out.println("Heading is present= " +present);}



//
//	Practice Page
//	https://www.letskodeit.com


		public static void verify_textbox_displayed()
		{
//			- Website launch
//			- Check text box displayed or not - true
//			- Click Hide button
//			- Check text box displayed or not - false
			WebElement textbox= driver.findElement(By.id("displayed-text"));
			System.out.println("Inital text box present check -"+textbox.isDisplayed());
		WebElement hide = 	driver.findElement(By.id("hide-textbox"));
		hide.click();
		System.out.println("After clicking hide button "+ textbox.isDisplayed());
		//clicking on show button
		WebElement show= driver.findElement(By.id("show-textbox"));
		show.click();
		System.out.println("After clicking show button "+ textbox.isDisplayed());}
		
		

}
