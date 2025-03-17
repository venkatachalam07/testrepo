package JavaPro;

public class exceptionn {
	

public static void main(String[] args) {
		
		int a=10;
		int b=12;
		
		
		try {
			
			System.out.println("Output"+ a/0);
			
			
		}  catch (Exception e) {			
		System.out.println("Final output = "+a/2);
		
		}
		finally {
			
			System.out.println("Executed this finaly methods = "+a*b);
			
			
		}
		
	}
	
	
	
	
	
	public int addingopration(int a,int b) throws Exception    {
	int c;
		c=a+b;
		Thread.sleep(3000);
	return c;
	
	}
	
	
	

}
