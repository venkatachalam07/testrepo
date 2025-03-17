package JavaPro;

public class Method_overriding implements Myinterfacemethod {
	
	public static void main(String[] args) {
		
		Method_overriding Methodover=new Method_overriding();
		Methodover.caseDeposite();
		Methodover.savingsAccount();
	    Methodover.currentAccount();
		
	}
	
	
	
public void savingsAccount() {
	System.out.println("For you saving accoount "
	+ "money ever 10K monthly inrested 200 Rupes");
	}

	@Override
	public void currentAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void caseDeposite() {
		// TODO Auto-generated method stub
		
	}

	

	

			
	

	
}
