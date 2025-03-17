package Selenium;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


//extends Base_Class

public class FlipKart {
	
		
	@BeforeClass
	
	public void browserlunch() {
		
	//	chromeBrowser();
//		urlLaunch("http://www.flipkart.com/");
	}

	
	@BeforeTest
	
	public void BeforeTest() {
		System.out.println("Before Test");	
	}
   
	
	
	@BeforeMethod
	public void BeforeMethods() {
		
		System.out.println("BeforeMethods-FK");
	}
	
	@Test
	
	public void login() {		
		System.out.println("Accout Login");
		
	}
	
	@Test public void accoutCreation() {
	System.out.println("Account Creations");
		
	}
	
  @AfterMethod public void  aftermethos() {
	  System.out.println("AfterMethods");
	  
	  
	  
  }
	

}
