package JavaPro;

import java.util.Scanner;

public class Java_Proggram {

	public static void main(String[] args) {

		//reversstring();
	   // spitTheWord();
		vowels();
	}

	

	static String revers = "";
	public static void reversstring() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Value");
		String word = sc.nextLine();
		for (int i = word.length() - 1; i >= 0; i--) {
			revers = revers + word.charAt(i);
		}
		System.out.println("Input Value = " + word);
		System.out.println("Output Value = " + revers);
	}



public static  void  spitTheWord() { 
String words = "Good ! Morning";
     String replaceSting= words.replace("[^A-Z,a-z]", "");
     String[] ss=replaceSting.split("!");
     System.out.println("Actual Words = "+words);
     System.out.println("Excepted Words ="+(ss[1]+" "+ss[0]));
}



public static void vowels() {
	
	String vowels="aeroplane";
	
	
	
	int count=0;
	for(int i=0;i<vowels.length();i++) {
		if((vowels.charAt(i)=='a') ||(vowels.charAt(i)=='A')||
			(vowels.charAt(i)=='e') ||(vowels.charAt(i)=='E')||
			(vowels.charAt(i)=='o') ||(vowels.charAt(i)=='O')||
			(vowels.charAt(i)=='i') ||(vowels.charAt(i)=='I')||
			(vowels.charAt(i)=='u') ||(vowels.charAt(i)=='U')){
			count++;
		}	
	}
	System.out.println("Total Words Count = "+vowels.length());
	System.out.println("vowels Count = "+count);
	
	
	
}
}