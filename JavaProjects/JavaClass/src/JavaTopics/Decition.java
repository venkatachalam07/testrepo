package JavaTopics;

public class Decition {
	
	
	public static void main(String[] args) {
//		
//	
//	int a=40;
//	
//	int b=30;
//	
//	
//	if(a>b) 
//	
//	{
//	System.out.println(" A is bigger Value");		
//		
//		}					
//	
	
	int Exp=11;
	
	String Result= "PASS";
	
	
	
	if(Exp<=5 && Result=="PASS") {
		System.out.println("Your appointed Junior Test Enggnier");
		
	}
	
	
	else if((Exp>=5 && Exp<=10) && Result=="PASS") {
		System.out.println("Your appointed Senior Test Enggnier");	
	}
	
	else if((Exp>=10 && Exp<=15) && Result=="PASS") {
		
		System.out.println("Your appointed Manager");
		
	}
	
	else {
	System.out.println("Waiting for two Day you result is processing");
	}
	
	
	

}}


