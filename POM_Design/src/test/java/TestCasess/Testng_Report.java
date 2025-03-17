package TestCasess;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Testng_Report implements ITestListener {
	
	ExtentSparkReporter Sparkreporter;
	ExtentReports reports;
	ExtentTest test;
	
	
	
	
	
	 public void onStart(ITestContext context) {
		 
		 Sparkreporter = new ExtentSparkReporter("E:\\Eclipse\\POM_Design\\Test_Report\\report.html");
		    
		 Sparkreporter.config().setDocumentTitle("Automation Testing");
		 Sparkreporter.config().setReportName("Guru99");
		 
		 
		 // ======
		 
		 reports = new ExtentReports();
		 reports.attachReporter(Sparkreporter);
		 reports.setSystemInfo("QA", "VENKATACHALAM BABU");
		 
		 //============
	  }


    public void onTestSuccess(ITestResult result) {
	test=reports.createTest(result.getName());
	test.log(Status.PASS,result.getName()); }	 
	
	
	
    public void onTestFailure(ITestResult result) {	
	test=reports.createTest(result.getName());
	test.log(Status.FAIL,result.getName());
	
  }

  






  
    public void onFinish(ITestContext Context) {
    	reports.flush();
    
  }	

 

}
