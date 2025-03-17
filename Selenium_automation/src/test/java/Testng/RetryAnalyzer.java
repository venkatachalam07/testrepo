package Testng;


	

	import org.testng.IRetryAnalyzer;
	import org.testng.ITestResult;

	public class RetryAnalyzer implements IRetryAnalyzer {
		int count = 0;
		int maxcount = 2;
		@Override
		public boolean retry(ITestResult result) {
			if(count < maxcount) //0<3
	 //1<3
	 //2<3

			{
				count++; //count =1  2 
				return true;
			}

				
			
			return false;
		}



	}

