package JavaTopics;

import java.util.Scanner;

public class Scaneer {

	public static void main(String[] args) {
	
//		// Using Scanner class get the below details
//        empId
//        empName
//        empEmail
//        empPhoneno
//        empSalary
//        empGender
//        empCity

		
		
		Scanner Sc= new Scanner(System.in);
		
	    // Prompt user for employee details
	    System.out.print("Enter Employee ID: ");
	    int  empId = Sc.nextInt();     
		System.out.println("This You Employee Id : "+ empId);
			
//        			
		System.out.println("Enter the you Name:");
		String name = Sc.next();
		System.out.println("You Name is" + name);
//		    
		
		System.out.println("Enter the you Mobile Number:");
		long mobile = Sc.nextLong();
		System.out.println("This You Mobile Number : " + mobile);
		    
		
		
		
//	    
		 System.out.println("Enter you Email ID : ");
//		 
	     String Email = Sc.next();
//	     
		 System.out.println("You Email Id is "  + Email);
//		  

	
	
		
		Sc.close();
		
	
	System.out.println("finesh");	
	}

	
	
	
}
