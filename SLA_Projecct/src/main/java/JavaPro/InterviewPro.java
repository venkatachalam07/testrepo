package JavaPro;


import java.util.HashMap;
import java.util.Scanner;

public class InterviewPro {

	
	
	public static void main(String[] args) {
		// greterthanthreenumber();
       	//	swaping();	
	    // bubbleshoting();
		// lettersCount();
		
		
	}
	
	public static void 	lettersCount() {
	
     String a="LongQuestions";
	
     
     
     HashMap< Character , Integer> value= new HashMap<Character, Integer>();
     
     System.out.println("Before Mapvalue = "+value);
     
     
  char[] all= a.toCharArray();
     for (char ss:all) {
    	 System.out.println(ss);
    	 if(value.containsKey(ss)) {
    		 value.put(ss, value.get(ss)+1);
    	 }else {
    		 value.put(ss,1);
    	 } 
     }
     
     
     

	System.out.println(value);	
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void bubbleshoting() {
		
		int [] a= {20,55,07,77,66,12,02};
		
		
		
		for (int dd:a) {
		System.out.println("Before Swaping a Array value = "+dd );
		}		
		
System.out.println( "===============================");



for (int i=0;i<a.length;i++) {
	
	for(int j=i;j<a.length;j++) {
	
		if(a[i]>a[j]) {
			
			
			int temp;
			
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		
	}


	}}	


System.out.println("After Swapting a valaues");
		for (int ddd:a) {
			System.out.println(ddd);
		}
	}
	
	
	
	
	
	public static  void swaping() {
		int a= 35;
		int b= 55;
		int c;
		System.out.println("Before A value = "+a);
		System.out.println("Before B value = "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After a value = "+a);
		System.out.println("After B value = "+b);	
		System.out.println("with fourmula");
		
	a= a+b;
	b=a-b;
	a=a-b;
	
	System.out.println("with farmula a value = "+a);
	System.out.println("With farmula B value = "+b);	
	}
	
	
	public static  void greterthanthreenumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A Value");
		int a= sc.nextInt();
		System.out.println("Enter the B Value");
		int b = sc.nextInt();
		System.out.println("Enter the C Value");
		int c= sc.nextInt();
		if(a>b&&a>c) {
			System.out.println("A is big number");
		}else if (b>a&&b>c) {
			System.out.println("B is a Bigg number");
		}  else if(c>b&&c>a) {
			System.out.println("C isb a big number");		
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
