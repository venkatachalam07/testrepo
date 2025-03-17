package JavaPro;

public class Method_overloading {

	public static void main(String[] args) {
		
		adding(5);
		adding(32, 4);
		adding(4,4.6);
	}
	
	
	public static void adding(int a) {
		int b=20;
	System.out.println("Add The Two Number"+(a+b));
				
	}
	public static void adding(int a,int b) {
	
		System.out.println("add the two number"+(a+b));
	}
	
	public static void adding(int a,double b) {
		
		System.out.println("Multipication"+(a*b));
		
	}

}
