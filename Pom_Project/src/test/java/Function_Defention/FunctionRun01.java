package Function_Defention;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Gen_Wrap.Wrap;
import ObjectRepository.ElementLocation;

public class FunctionRun01 
{
	WebDriver driver;
public FunctionRun01(WebDriver driver)
{
this.driver = driver;
}
	
	
public boolean check_headingDisplayed()
{
	Wrap.get_driver(driver);
	WebElement heading = Wrap.locateElement(ElementLocation.heading);
	
    boolean result = heading.isDisplayed(); //true
    
    return result;
    
}
public void click_DisableButton()
{
	Wrap.get_driver(driver);
	WebElement disableButton =  Wrap.locateElement(ElementLocation.disableButton);
	   disableButton.click();
}


public boolean verify_textBoxDisabled()
{
	WebElement textBox=  Wrap.locateElement(ElementLocation.textBox);
	boolean result = textBox.isEnabled(); //false
	return result;
}

}