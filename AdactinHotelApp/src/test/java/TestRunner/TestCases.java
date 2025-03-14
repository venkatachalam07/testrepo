package TestRunner;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Base_pack.Base_Class;
import Method_Defanition_pack.Defanitions;


public class TestCases {
	WebDriver driver;

	
	@BeforeSuite
		public void Verify_url_launch() throws IOException {
		Base_Class b= new Base_Class();
		driver= b.launch();
		
	}
	
	@Test   (priority=1)
	public void  Login() {
     	Defanitions.defatinationdriver(driver);
		Defanitions	.UserName();
		Defanitions	.Pass();
		Defanitions	.loginbutton();
	}
	

	@Test   (priority=2)
	public void Search_Hotel() {
		Defanitions.selectlocation();
		Defanitions.selecthotels();
		Defanitions.room_type();
		Defanitions.room_nos();
		Defanitions.CheckInDate();
		Defanitions.datepick_out();
        Defanitions.adult_room();
		Defanitions.child_room();
		Defanitions.submit();
		}
	
	
		
	@Test (priority=3)
	public void Confrom_Hotel() throws Throwable   {	
		Defanitions.radiobutton();
		Defanitions.continu1();
		}
	
	
	@Test (priority=4)
	public void Book_Hotel() {	
		Defanitions.first_name();
		Defanitions.last_name();
		Defanitions.address();
	}
	
	@Test (priority=5)
	public void Payments() {
		Defanitions.cc_num();
		Defanitions.cctype();
		Defanitions.cc_exp_month();	
		Defanitions.cc_exp_year();
		Defanitions.cc_cvv();
		Defanitions.book_now();
	}
	
	
	
	@Test (priority=6)
	
	public void getHotelbookingid() throws InterruptedException {
		Defanitions.orderno();
		Defanitions.my_itinerary();		
		System.out.println("Project Was Completed ");
	}
	
		
	
}
