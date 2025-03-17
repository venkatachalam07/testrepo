package Sample;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed_TestCases implements IRetryAnalyzer {

	
	
	
	int a=0;
	
	int b=4;
	
	
	
	@Override
	public boolean retry(ITestResult result) {
		
		
		if(a<b) {
			a++;
			return true;
			
		}
		return false;
	}

}
