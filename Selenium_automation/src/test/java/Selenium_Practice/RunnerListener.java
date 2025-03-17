package Selenium_Practice;


import org.testng.ITestListener;
import org.testng.ITestResult;

	

	public class RunnerListener implements ITestListener

	{

		public void onTestStart(ITestResult result) {
		   System.out.println("I run before TC");
		  }
		 public void onTestSuccess(ITestResult result) {
			    System.out.println("I run after TC is passed");
			    System.out.println(result.getName());
			    System.out.println(result.getStatus());
			   
			  }
		 
		 public void onTestFailure(ITestResult result) {
			   System.out.println("I run after TC is failed.");
			  }
		

	}
	
	


