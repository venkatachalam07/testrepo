package Testng;


	



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerListener  implements ITestListener 

{
	static WebDriver driver;

	public  static void driver_initial(WebDriver dd)
	{
	driver = dd;
	}

	public void onTestStart(ITestResult result) {
		
	  }
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("I run after TC is passed");
		    System.out.println(result.getName());
		    System.out.println(result.getStatus());
		   
		  }
	 
	 public void onTestFailure(ITestResult result) {
		   System.out.println("I run after TC is failed.");
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
	File destination = new File("D:\\Selenium_JAVA_Projects\\TestNG_Learn\\screenshots\\test01.png");
	 
	 try {
		FileUtils.copyFile(source, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 }
	

}



