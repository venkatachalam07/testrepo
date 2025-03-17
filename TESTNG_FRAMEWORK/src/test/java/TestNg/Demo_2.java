package TestNg;

import java.util.HashMap;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Demo_2 {
	@Test
	public void Test_Case1() {	
		System.out.println("Demo-2TestCase-1");
		}
	@Test
	public void Test_case2() {	
		System.out.println("Demo-2TestCase-2");
		String name ="Auto mation Test Ng Test Ng Automation @BeforMethods Auto Test @AfterMethods Test";	
    String[] words= name.split(" ");		

    
    HashMap<String, Integer> count=new HashMap<String ,Integer>();
    count.put("Venkat", 8);
    System.out.println(count);
    for(String sapraterString:words) { 
    	//System.out.println(sapraterString);
    	
    	
    	
    	if(count.containsKey(sapraterString)) {
    		count.put(sapraterString,count.get(sapraterString)+1);
    		
    		
    	}else {
    		
    		count.put(sapraterString, 1);
	
		}
    	
    }
	
	System.out.println(count);
    
    
		
		
		
		
		
		
		
		
	}
	@AfterClass
	public void Test3() {
		System.out.println("Demo2 After Method");
     //    int a=	10/0;
		
		
	}

}
