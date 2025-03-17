package Method_Def;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import LocatersPack.Locaters;
import Wrap_Pack.Selenium_Methods;
import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

public class Defanitions {
	
	static WebDriver driver;
	
	
	public static  void derfdriver(WebDriver defdriver) {
        	driver = defdriver;
	}
	
	

	public static  WebElement buyNow() {
		Selenium_Methods.selDriver(driver);
		WebElement buy= Selenium_Methods.Elementlocaterxpath(Locaters.BuyNow);
		Selenium_Methods.scroll(buy);
		Selenium_Methods.javaclik(buy);	        	
	    return buy;
	}
	
	public static WebElement getCardNum() {
		  WebElement  getcardnumber= Selenium_Methods.Elementlocaterxpath(Locaters.getcrednum);
		  getcardnumber.click();
		  return getcardnumber;
		  }

public static void getWindowHandles() {
	String singlewindows=  driver.getWindowHandle();
    Set<String> multiplewindows = driver.getWindowHandles();
    for (String window:multiplewindows) {
    if(!window.equals(singlewindows)) {
	driver.switchTo().window(window);
	break;    }}}

public static WebElement cardimage() {
	WebElement cardimg = Selenium_Methods.Elementlocaterxpath(Locaters.cardimg);
	Selenium_Methods.scroll(cardimg);
	return cardimg; }

 public static ArrayList<String> value=new ArrayList<String>();


public static void getCardDetails() {
    List <WebElement> carddetails= Selenium_Methods.ElementlocatorssXpath(Locaters.cardDetails);
 
   System.out.println("Before value"+value);
   
 for( WebElement   card:carddetails) {
	 
	String dd= card.getText();
 String   getnumber= dd.replaceAll("[^0-9]", "");
 value.add(getnumber);
 }
    
System.out.println("After value"+value);    
}









}



