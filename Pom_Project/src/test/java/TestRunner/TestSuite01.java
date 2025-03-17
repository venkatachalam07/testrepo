package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Pack.Base;
import Function_Defention.FunctionRun01;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSuite01 {
WebDriver driver;
FunctionRun01 run;

Base Base;
	@BeforeMethod
	public void verify_launch_browser()
	{
		// Base.Base();	
		 Base=(Base_Pack.Base) driver;
	run = new FunctionRun01(driver);
		
	}
	


	@Test
	public void verify_heading()
	{
	Assert.assertTrue(run.check_headingDisplayed());
	}

	




	@Test(dependsOnMethods= {"verify_heading"})
	public void verify_disable()
	{
		run.click_DisableButton();
		
	
	Assert.assertFalse(run.verify_textBoxDisabled());
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}