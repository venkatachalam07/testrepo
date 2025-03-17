package Method_Defenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Object_Repository.Element_Locations;
import Wrop_Method.wrop;

public class Method_defenition_Class {
	 static WebDriver driver;
	public Method_defenition_Class(WebDriver md) {	
	this.driver=md;
	
	}
	
	public static WebElement   addccustomer(){
	     	wrop.getdriver(driver);
		    WebElement addccustomer=  wrop.locateElement(Element_Locations.addccustomer);
		    addccustomer.click();
	    	return addccustomer;
	    	}

public static WebElement  radiobtn() {
	 WebElement radiobtn= wrop.locateElement(Element_Locations.radiobtn);
	    radiobtn.click();
		return radiobtn;
}

public   static WebElement fname() {
WebElement fname=wrop.locateElement(Element_Locations.fname);
fname.sendKeys("Venkat");
return fname;

}

public static WebElement   lname(){
    WebElement lname=wrop.locateElement(Element_Locations.lname);
 lname.sendKeys("Babu");
	return lname;
}


public static WebElement   email(){
    WebElement email=wrop.locateElement(Element_Locations.email);
    email.sendKeys("venkaktatt@gmai.com");
	return email;		
}

public static WebElement   address(){
    WebElement address=wrop.locateElement(Element_Locations.address);
    address.sendKeys("No 30 Metustreet");
	return address;
}


public static WebElement   mobilenumber() {
    WebElement mobilenumber=wrop.locateElement(Element_Locations.mobilenumber);
    mobilenumber.sendKeys("9993376732");
	return mobilenumber;
}
















}
