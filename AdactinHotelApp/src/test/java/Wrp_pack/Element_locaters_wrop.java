package Wrp_pack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Location_Path.Locaters;

public class Element_locaters_wrop {
static WebDriver driver;
	
	public  static void wrpdriver(WebDriver wrdriver) {
		driver=wrdriver;
	}
	
	public static WebElement Elementlocaterid(String username) {
	 WebElement id= driver.findElement(By.id(username));
	return id;
}
	public static WebElement Elementlocaterxpath(String str) {
		 WebElement xpath= driver.findElement(By.xpath(str));
		return xpath;
}
	
	
	public static  void Selectvalue(WebElement webel,String str) {
		Select sc	= new Select(webel);	
		sc.selectByValue(str);
	}

	
	public static void SelectText(WebElement webel,String str) {
		
		Select sh= new Select(webel);
		sh.selectByVisibleText(str);
		
	}
	
		
	public static void JavaScroll(WebElement str) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", str);
	}


	
	public static void ScreenShots() throws IOException {
		TakesScreenshot tk =(TakesScreenshot)driver;
        File from=	tk.getScreenshotAs(OutputType.FILE);
		File to= new File("E:\\Eclipse\\AdactinHotelApp\\Screen\\imges.png");
		FileUtils.copyFile(from, to);
		
	}
	

}
