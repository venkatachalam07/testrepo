package JavaTopics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {
	
	
	
	public static void main(String[] args) {
		
		Date d=new Date();
		
		
		System.out.println(d);
		
	 String  currentdate=d.toString(); 
		
		
		System.out.println(currentdate);
		
	
		
		
	SimpleDateFormat sd=new SimpleDateFormat("yy:dd:MM");
	System.out.println(sd.format(d));
	
		
		
		
		
		
	}
	
	

}
