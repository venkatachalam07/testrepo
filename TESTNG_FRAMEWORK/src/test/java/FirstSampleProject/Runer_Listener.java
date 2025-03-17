package FirstSampleProject;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Runer_Listener  implements ITestListener {
	
	 public void onTestStart(ITestResult result) {
		 
		 System.out.println("Start the  Sutie file ");
	 
	 }
	
	 public void onTestSuccess(ITestResult result) {	
		 
		 System.out.println("Affter Sucess  Testcase Run the Methods"); 
		 
		 
		 
	 }
	  
	 public void onTestFailure(ITestResult result) {
	
		 System.out.println("Affter Failure The Testcase Run the Methods");
		  
	 }
	
	 
}
