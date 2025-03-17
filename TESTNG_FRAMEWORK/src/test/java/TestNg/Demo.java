package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	

	@BeforeSuite
	public void Beforesuitee() {
		System.out.println("Beforesuite");
		}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("beforeTest");
		}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	
   @BeforeMethod
   public void  BeforeMethod() {
	System.out.println("Before Methods");
    }
	
	
	
	@Test
	public void Test_Case1() {
		
		System.out.println("TestCase-1");
	}
	

	@Test
	public void Test_case2() {	
		System.out.println("TestCase-2");
	}
	
	@AfterSuite
	public void Aftersuitee() {
		System.out.println("Aftersuite");
		}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
		}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	
@org.testng.annotations.AfterMethod
public void  AfterMethod() {
	System.out.println("After Methods");
}
	

	
	
	
	
	


}

