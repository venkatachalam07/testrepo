package Method_Defanition_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Location_Path.Locaters;
import Wrp_pack.Element_locaters_wrop;

public class Defanitions {
	
	static WebDriver driver;

	public static void defatinationdriver(WebDriver ddriver) {
		
	driver=ddriver;
	 
	}
	
	
	
	
	// ----------------------------
	
	public static WebElement UserName() {
		Element_locaters_wrop.wrpdriver(driver);	
		WebElement userName =Element_locaters_wrop.Elementlocaterid(Locaters.userName);
		userName.sendKeys("VenkatachalamVicky");
		return userName;
	}
	
	
	public static WebElement Pass() {
		WebElement password= Element_locaters_wrop.Elementlocaterid(Locaters.pass);
		password.sendKeys("Venkat@2531");
		return password;	
	}
	public  static WebElement loginbutton() {
		WebElement loginbtn=Element_locaters_wrop.Elementlocaterxpath(Locaters.login);
		loginbtn.click();
		return loginbtn;
	}
	
	
	// Selectclass
	
	public static void selectlocation() {
	
		WebElement location= Element_locaters_wrop.Elementlocaterid(Locaters.location);
		Element_locaters_wrop.Selectvalue(location, "London");
		
	
	}
	
	

	public static void selecthotels() {
		WebElement selecthotels=  Element_locaters_wrop.Elementlocaterid(Locaters.hotels);		
		Element_locaters_wrop.SelectText(selecthotels, "Hotel Creek");		
	}
	
	
	// =================Search_Hotel==================
	
	

	
	
	public static void  room_type() {
		WebElement room_type=Element_locaters_wrop.Elementlocaterid(Locaters.room_type);
		room_type.click();
		Element_locaters_wrop.Selectvalue(room_type, "Double");
		
	}
	
	public static  void  room_nos() {
		WebElement room_nos =Element_locaters_wrop.Elementlocaterid(Locaters.room_nos);
		room_nos.click();
		Element_locaters_wrop.Selectvalue(room_nos, "4");
		
	}

	public static void   CheckInDate() {
		WebElement CheckInDate =Element_locaters_wrop.Elementlocaterxpath(Locaters.CheckInDate);
		CheckInDate.clear();
		CheckInDate.sendKeys("06/01/2025");
	}
	
	public static   void  datepick_out() {
		WebElement datepick_out = Element_locaters_wrop.Elementlocaterid(Locaters.datepick_out);
		datepick_out.clear();
		datepick_out.sendKeys("07/01/2025");
	}
	
	public static void    adult_room() {
		WebElement adult_room =Element_locaters_wrop.Elementlocaterid(Locaters.adult_room);
		adult_room.click();
		Element_locaters_wrop.Selectvalue(adult_room, "3");
		}
	
	
	public static   void child_room() {
	WebElement child_room =Element_locaters_wrop.Elementlocaterid(Locaters.child_room);
	child_room.click();
	Element_locaters_wrop.Selectvalue(child_room, "3");
		}
	
	public static void submit() {
	WebElement Submit =Element_locaters_wrop.Elementlocaterid(Locaters.Submit);
	Submit.click();
	}
	
	public static void radiobutton() {
	WebElement radiobutton=Element_locaters_wrop.Elementlocaterid(Locaters.radiobutton);
	radiobutton.click();
	}
	
	public static void continu1() {
	WebElement continu1 =Element_locaters_wrop.Elementlocaterid(Locaters.continuee);
	continu1.click();
	}
	
	public static void first_name() {
	WebElement first_name = Element_locaters_wrop.Elementlocaterid(Locaters.first_name);
	Element_locaters_wrop.JavaScroll(first_name);
	first_name.click();
	first_name.sendKeys("VENKAT");
	}
	
	public static void last_name() {
	WebElement last_name = Element_locaters_wrop.Elementlocaterid(Locaters.last_name);
	last_name.click();
	last_name.sendKeys("BABU");
	}
	
	public static void address() {
	WebElement address = Element_locaters_wrop.Elementlocaterid(Locaters.address);
	address.sendKeys("address");
	}
	
	
	public static void cc_num() {
	WebElement cc_num =Element_locaters_wrop.Elementlocaterid(Locaters.cc_num);
	cc_num.sendKeys("6080231944450345");
	}
	
	public static void cctype() {
	WebElement cc_type = Element_locaters_wrop.Elementlocaterid(Locaters.cc_type);
	cc_type.click();
	Element_locaters_wrop.Selectvalue(cc_type, "MAST");
	
	}
	
	public static void cc_exp_month (){
	WebElement cc_exp_month =Element_locaters_wrop.Elementlocaterid(Locaters.cc_exp_month);
	cc_exp_month.click();
	Element_locaters_wrop.Selectvalue(cc_exp_month, "3");
	}
	
	
	public static void cc_exp_year(){
	WebElement cc_exp_year =Element_locaters_wrop.Elementlocaterid(Locaters.cc_exp_year);
	cc_exp_year.click();
	Element_locaters_wrop.Selectvalue(cc_exp_year, "2028");
	}
	
	public static void cc_cvv (){
	WebElement cc_cvv = Element_locaters_wrop.Elementlocaterid(Locaters.cc_cvv);
	cc_cvv.sendKeys("522");
	}
	
	public static void book_now() {
	WebElement book_now = Element_locaters_wrop.Elementlocaterid(Locaters.book_now);
	book_now.click();
	}
	
	

	public static void orderno() throws InterruptedException {
	Thread.sleep(8000);
    WebElement orderno=	 Element_locaters_wrop.Elementlocaterid(Locaters.orderno);
    Element_locaters_wrop.JavaScroll(orderno);
	System.out.println(orderno.getText());
	}
	

	public static void my_itinerary() {
	WebElement	my_itinerary=	Element_locaters_wrop.Elementlocaterid(Locaters.my_itinerary);
	my_itinerary.click();	
	System.out.println(driver.getCurrentUrl());
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
