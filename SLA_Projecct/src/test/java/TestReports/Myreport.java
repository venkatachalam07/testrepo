package TestReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Myreport implements ITestListener {
	
	ExtentSparkReporter sparkreport;
	ExtentReports reports;
	ExtentTest test;
	
	
	  public void onStart(ITestContext context) {
		  sparkreport= new ExtentSparkReporter("E:\\Eclipse\\SLA_Projecct\\Reports\\reports.html");
		  sparkreport.config().setDocumentTitle("AutomationTesting");
		  sparkreport.config().setReportName("GuruPaymnetPageProject");
		  
		  // ================================
		  
		  reports = new ExtentReports();
		  reports.attachReporter(sparkreport);
		  reports.setSystemInfo("QA", "VENKATBABU");
	  }
	  
	  
	  
	 public void onTestStart(ITestResult result) {
		 System.out.println("Test is Started");
		  }
	 
	  public void onTestSuccess(ITestResult result) {
		  test=reports.createTest(result.getName());
		  test.log(Status.PASS,result.getName());
		  
		  
		  }
	
	


	public void onTestFailure(ITestResult result) {
		  
		  test=reports.createTest(result.getName());
		  test.log(Status.FAIL,result.getName());
		  
		  }

	
	  
	  public void onFinish(ITestContext context) {
		  reports.flush();
		  }
}
