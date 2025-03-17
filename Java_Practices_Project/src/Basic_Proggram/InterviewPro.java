package Basic_Proggram;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class InterviewPro {
	public static void main(String[] args) {
		
	//  revertchenumber();
	// 	countthenumber();
	//  logersWords();
	//	bubbleshots();
	//	dublicate_char();
		
		polinrome();
		
		// array();
	
	}
	
	public static void array() {
		
	
		        System.out.println("Try programiz.pro");
		        Integer [] value={33,67,99,12,45,77,34,11,12};
		        System.out.println(value);
		      Arrays.sort(value);
		        for(int  sss:value){
		            System.out.println(sss);
		        }
		        
		      
		        
		        
		        
		        
		        
		        
		        
		        
		    }
		
	
	
	
	
	
	
	public static void polinrome() {		
    
		
		
		
		
		
		
		
		
		
		String name="malayalam";
		
		
		name.equalsIgnoreCase("venkat");
name.replaceAll(name, name);		
		
		
		System.out.println(name.indexOf("o"));
		
		
		
		
		String revstr="";
	for (int i=name.length()-1;i>=0;i--) {
		revstr=revstr+name.charAt(i);
	}
System.out.println(revstr);
	
	
	if(name.equalsIgnoreCase(revstr)) {
		
		System.out.println("This String was Polinrome");
	}else {
		
		System.out.println("This String was  not  rome Polinrome");
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	public static  void dublicate_char() {
		String aa= "Venkatacha lambabuewtgbhjki";
	String[] aaa=	aa.split("");
		
		int ss= aaa.length;
		
		
		System.out.println(aaa.length);
		
		
		char[] name =aa.toCharArray();
		HashMap<Character,Integer> value= new HashMap<Character,Integer>();
		System.out.println(value);
		
		
		for(char  word:name) {
			if(value.containsKey(word)) {
				value.put(word, value.get(word)+1);
			}else {
				value.put(word, 1);
			}
		}
		System.out.println(value);	
	
	for( java.util.Map.Entry<Character,Integer> dd : value.entrySet()) {
		
		System.out.println("Key ="+dd.getKey()+"  Value = "+ dd.getValue());
		
		
	}
	
	}
	
	
	
	
	
	
	
	public static void bubbleshots() {
		int num[] = {553,12,44,2,35,88,99,45,988};
		System.out.println("Before Bubbleshot"+num);
		for(int i=0;i<num.length;i++) {
			for(int j=i;j<num.length;j++) {
				if(num[i]<num[j]) {				
					int temp;
					temp=num[i];
					num[i]=num[j];		
					num[j]=temp;	
				}	
			}
		
		}
		
		for (int dd:num)
		System.out.println("After Bubbleshot"+dd);
		
	}
	
	
	
	public static void logersWords() {
		
		
		Scanner sc= new Scanner(System.in);
		System.err.println("Enter the String value");
	   String words=sc.nextLine();
	   
	String[]    wordss = words.split(" ");
	
	String Smalword=wordss[0] ;
	
	String longerword = wordss[0];
		
	   for(String word:wordss) {
		   
		   if(word.length() >longerword.length()) {
			   longerword=word;	
			  
		   }
		   if(word.length()<Smalword.length()) {
			   Smalword=word;
			  
		   }
			   
		   
	        System.out.println("Shortest word: " + Smalword);
	        System.out.println("Longest word: " + longerword);
	          
			   
			   
		   
	   }
	
	
	
	
	
		
		
		
		
		
	}
	
	
	
	
	
	public static void countthenumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		int count =0;
		while (a!=0) {
		a=a/10;
		count++;	
		}
		System.out.println(count);
		
	}
	
	
	
	
	public static  void revertchenumber() {
		
		int num= 1234;
		System.out.println(num);
		int revers =0;
		while(num!=0) {
		int digit=num%10;
		revers = revers*10 +digit;
		num/=10;
		}
		System.out.println(revers);
        // Printing pattern
        System.out.println("Pattern Output:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
		
		
		
		
		
		
		
	}
	
	

}
