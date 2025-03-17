package My_Report;

import java.io.ObjectInputFilter.Status;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MyReport implements ITestListener {
	
	static WebDriver driver;
	
	ExtentSparkReporter spsrkreport;
	ExtentReports report;
	ExtentTest test;
	public static void myreportdriver(WebDriver reportdriver) {
		driver=reportdriver;
		
		
	}
	
	
	
	
	
	
  public void onStart(ITestContext context) {
	  spsrkreport = new ExtentSparkReporter("E:\\Eclipse\\Softlogic\\ExtendReport\\myreport.html");
      spsrkreport.config().setDocumentTitle("Automation Test Report");
      spsrkreport.config().setReportName("Venkatachalam Babu");
 //      report
      report = new ExtentReports();
      report.attachReporter(spsrkreport);
      report.setSystemInfo("QA", "VENKATACHALAM BABU");

      
	  
	  
	  }
  
  

	public void onTestStart(ITestResult result) {
		
		
		
	
		
	}
  public void onTestSuccess(ITestResult result) {
		  
		  test=report.createTest(result.getName());
		  test.log(com.aventstack.extentreports.Status.PASS,result.getName());
		  
		  
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 
		  
		  test=report.createTest(result.getName());
		  test.log(com.aventstack.extentreports.Status.FAIL,result.getName());
		
	 }
	
	  public void onFinish(ITestContext context) {
		  report.flush();
		  System.out.println("Its Done");
			driver.close();	
	  }
	 
}
