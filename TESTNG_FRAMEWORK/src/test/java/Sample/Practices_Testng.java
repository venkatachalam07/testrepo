package Sample;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Practices_Testng {
	
	
	
	
	@BeforeClass
	
	public void Before_Class() {
		
		System.out.println("Before Runing methods");		
	int a=10;
	int b=20;
	
	System.out.println("Result= "+a+b);
	
	}
	
	
	
	
	
	
	
	@Test
	
	public void Test01() {
		
		
		System.out.println("Run the 1 St TestCase");
		
		int a=10;
		int b=20;
		
		System.out.println("Result= "+a/b);
		
	}
		
		
		
		

		@Test
		
		public void Test02() {
			
			
			System.out.println("Run the 2 St TestCase");
			
			int a=30;
			int b=20;
			
			System.out.println("Result= "+a+b);
			
		}
			
			
			

			@Test
			
			public void Test03() {
				
				
			System.out.println("Run the 3 St TestCase");
				
				int a=10;
				int b=2;
				
				System.out.println("Result= "+a/b);	
	}
			@Test
			
			public void Test04() {
				
				
			System.out.println("Run the 4 St TestCase");
				
				int a=-5;
				int b=9;
				
				System.out.println(a%b);
	
			}
}
