package Looping;

public class String_Learn {
	


	public static void main(String[] args) {
//string methods in java
		//length()

		String name = "venkat"; // 6

		int count;

		count = name.length();// returns the number of characters in the string.

		System.out.println(count);

		// substring() - extracts some portion of the string
		
		String name2 = "aeroplane"; //i,n-1
		
		System.out.println(name2.substring(0, 4));
		
		//index of - returns the index of the first occurence of a character
		
		String str = "Mahendran";
		
		System.out.println("index of "+ str.indexOf('h'));
		
        //Replace - replaces any particular charcater or string with a new character or strung
		
		String name3= "Softlogic";
		
		System.out.println("replace "+name3.replace("o", "*"));
		
		//Concatenation - join two strings
		
		String x= "soft";
		
		String y = "logic";
		
		System.out.println("concatenation " + x.concat(y)); //x+y
		
		//ToUppcase //to Lower case
		
		String up = "EARTH";
		
		System.out.println(up.toLowerCase());
		
		String lo = "neptune";
		
		System.out.println(lo.toUpperCase());
		
		//Trim() - it is used to cut the white spaces
		
		String word = "      hello        ";
		System.out.println(word.trim());
		
		//charAT()
		
		String word2= "softlogic";
		
		//print the character g and also its index
		
		for(int i=0;i<word2.length();i++) //1<8 //2<8 //3<8 //4<8 //5<8 //6<8
		{
			if(word2.charAt(i)=='g') //s==g //o==g //f==g //t==g //l==g //o==g //g==g
			{
				System.out.println(i+"= g");
			}
		}
		
		
		//String.valueOf - converts integer to String
		
		int num = 768;
		
		String word4= String.valueOf(num);
		System.out.println(word4);
		
		
		//compare two strings
		
		//==
		String str4 = "Happy morning"; // String literals
		String str2 = new String("Happy morning"); //string objects
		String str3 = new String("Happy morning");
		
		if(str2.equals(str3)) //not recommneded to use == becuase it is checking the memory 
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		
		
		
		

	}

}


