package AdactinHotelApp_Report;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Wrp_pack.Element_locaters_wrop;

public class HotelReport implements ITestListener {
	WebDriver driver;
	
	ExtentSparkReporter Sparkreport;
	ExtentReports Report;
	ExtentTest test;
	
	
	
	   public void onStart(ITestContext context) {
	
		   System.out.println(context.getName());
		   
		   Sparkreport= new ExtentSparkReporter("E:\\Eclipse\\AdactinHotelApp\\HotelRepot\\repot.html");
		   Sparkreport.config().setDocumentTitle("Automation Testing");
		   Sparkreport.config().setReportName("Automation Test Script");
		   
		   // ==============
		   
		   Report=new ExtentReports();
		   Report.attachReporter(Sparkreport);
		   Report.setSystemInfo("QA","VENKATACHALAM");
		  
		  // =================== 
	  }
	   


    public void onTestSuccess(ITestResult result) {
    	test=Report.createTest(result.getName());
    	test.log(Status.PASS, result.getName());
    	try {
			Element_locaters_wrop.ScreenShots();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    
  }
   public void onTestFailure(ITestResult result) {
	   test=Report.createTest(result.getName());
   	   test.log(Status.FAIL, result.getName());
    
  }
   public void onFinish(ITestContext context) {
    Report.flush();
	   
  }

}
