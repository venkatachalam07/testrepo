package JavaPracticeHW;

public class String1 {
	
	
	
	public static void main(String[] args) {

		String s= new String();
		
    String	name = "AutomationTesting" ;

		System.out.println(name);
			
System.out.println(name.length());

System.out.println(name.indexOf('T'));

System.out.println(name.lastIndexOf("i"));

System.out.println(name.substring(0, 10));

System.out.println(name.replace("o", "  "));

System.out.println(name.toLowerCase());
		
System.out.println(name.toUpperCase());

System.out.println(name.trim());

System.out.println("=======================");


//  String	name = "AutomationTesting" ;

// CharAt();
//0 <17   --- T so execute    -- when it's fail na i=18< condition is fail so for loops that time it's not not satisfied
for (int i=0;i<name.length();i++) {    // 0 
	
	System.out.println(name);
	
	
	if(name.charAt(i)=='o') {  
		// a == o check f // again check u ==o f // again   o ==o t  execute the 
		
		System.out.println("DONE");
		
		
	}

	
}


System.out.println("-------------");

String name1="Testing";

 String name2 = "Testing";
 
 //  (name1.equals(name2)) == checking for value
 
 //  (name1==name2) == checking for memory 
 
 if (name1==name2){
	  
	  System.out.println("Yes name2 is Saticfaild");
	  
  }
 else {
	 

	  System.out.println("Yes name2 is Not Saticfaild");
	  
 }

int aa=98893;

String bb =String.valueOf(aa);
 System.out.println(bb);
 
 
 
 String ss= "Venkat99";
 
 
  // sdouble sd =String.valueOf(ss);
 
 

	}

}
