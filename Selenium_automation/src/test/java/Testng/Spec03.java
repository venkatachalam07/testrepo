package Testng;

	

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Spec03 {
	
	
@DataProvider(name="loginData")
public Object[][] credentials()
{
	return new Object[][] {{"admin","ad123"},{"user123","test123"},{"softlogic","123"}};
}

@Test(dataProvider ="loginData")
public void test03(String username,String password)
{
	System.out.println("username "+username);
	System.out.println("password "+password);
	
}

}


