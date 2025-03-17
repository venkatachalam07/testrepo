package Selenium_Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Profiling extends Base {

	

	    public static void venkatBlProfile( String emailid ,String phoneNumber,String otpUat, String panNumber) throws InterruptedException {

	        chromeBrowser();
	        urlLaunch("https://qa-cmol.creditmantri.net.in/business-loan/");
	        time();
	        maximize();
	        WebElement CEB=driver.findElement(By.xpath(" (//a[text()='CHECK ELIGIBILITY'])[1]"));
	        javaClick(CEB);

	        Homescreen();

	        WebElement email=driver.findElement(By.id("otp-email"));email.click();

	        time();

	        email.sendKeys(emailid);

	        WebElement phone = driver.findElement(By.xpath("//input[@id='otp-mobile']"));
	        javaClick(phone);
	        phone.sendKeys(phoneNumber.toString());

	        time();
	        //   WebElement city = driver.findElement(By.xpath("//img[@src='https://cm-cdn-postlogin.creditmantri.com/offers/bundle/chennai-select.png']"));


	        WebElement city = driver.findElement(By.xpath("//img[@src=\"https://cm-cdn.cmtri.in/offers/bundle/chennai-select.png\"]"));

	        city.click();
	        time();

	        WebElement dop=driver.findElement(By.xpath("//input[@name='dob']"));dop.click();

	        WebElement mon=driver.findElement(By.xpath("//select[@data-handler=\"selectMonth\"]"));
	        Select s=new Select(mon);
	        s.selectByValue("1");

	        WebElement year=driver.findElement(By.xpath("//select[@data-handler=\"selectYear\"]"));
	        Select y=new Select(year);
	        y.selectByValue("1993");

	        WebElement date=driver.findElement(By.xpath("(//a[@class=\"ui-state-default\"])[6]"));moveToElement(date);
	        date.click();

	        WebElement pincode=driver.findElement(By.xpath("//input[@name='residentialPincode']"));pincode.click();
	        pincode.sendKeys("600018");


	        WebElement BPIN=driver.findElement(By.xpath("//input[@name='businessPincode']"));BPIN.click();
	        BPIN.sendKeys("600018");


	        WebElement cyear=driver.findElement(By.xpath("//span[text()='Year']"));cyear.click();


	        WebElement yearse=driver.findElement(By.xpath("//li[text()='Before 2020']"));
	        moveToElement(yearse);
	        yearse.click();

	        WebElement btype=driver.findElement(By.xpath("(//span[text()='Select an option'])[1]"));
	        moveToElement(btype);
	        btype.click();


	        WebElement plc=driver.findElement(By.xpath("//li[text()='Limited company']")); moveToElement(plc);
	        plc.click();


	        WebElement intype=driver.findElement(By.xpath("(//span[@role=\"presentation\"])[5]"));
	        moveToElement(intype);
	        time();
	        intype.click();
	        Thread.sleep(4000);
	        WebElement inname=driver.findElement(By.xpath("//li[text()='Architecture/Interior Designing']"));
	        moveToElement(inname);
	        Thread.sleep(4000);
	        inname.click();

	        WebElement NDFSC=driver.findElement(By.xpath("//span[text()='Yes']"));
	        javaClick(NDFSC);



	        WebElement nextbutton=driver.findElement(By.xpath("//button[text()='Next']"));
	        nextbutton.click();

	        Homescreen();
	        Thread.sleep(2000);
	        WebElement otp=driver.findElement(By.xpath("//*[@id=\"otp\"]"));otp.click();
	        Thread.sleep(30000);

	        otp.sendKeys(otpUat);

	        System.out.println("otp done ");

	        Thread.sleep(2000);

	        time();
	        Homescreen();
	        WebElement pan=driver.findElement(By.xpath("//input[@name=\"pan\"]"));pan.click();
	        sendKeys(pan,panNumber);
	        Homescreen();
	        WebElement state=driver.findElement(By.xpath("//span[text()='Select State']"));
	        Thread.sleep(2000);
	        state.click();

	        WebElement statename=driver.findElement(By.xpath("(//li[@class=\"select2-results__option\"])[30]"));statename.click();

	        WebElement submit=driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));submit.click();

	        Homescreen();
	        WebElement emptype=driver.findElement(By.xpath("//span[text()='Self employed business']"));javaClick(emptype);

	        WebElement accounttype=driver.findElement(By.xpath("//span[text()='Savings Account']"));javaClick(accounttype);

	        WebElement residence=driver.findElement(By.xpath("(//span[@class=\"radio-label\"])[6]"));javaClick(residence);

	        WebElement Business=driver.findElement(By.xpath("(//span[@class=\"radio-label\"])[8]"));javaClick(Business);

	        WebElement loanamount=driver.findElement(By.xpath("//input[@name=\"loanAmount\"]"));javaClick(loanamount);
	        loanamount.sendKeys("300000");

	        WebElement grossannual=driver.findElement(By.xpath("(//span[text()='Select an option'])[1]"));
	        Thread.sleep(3000);
	        grossannual.click();

	        Thread.sleep(3000);
	        WebElement annualText=driver.findElement(By.xpath("//li[text()='75 Lakhs+']"));
	        annualText.click();



	        WebElement postyaer=driver.findElement(By.xpath("(//span[text()='Year'])[1]"));postyaer.click();
	        Thread.sleep(4000);
	        WebElement years=driver.findElement(By.xpath("//li[text()='Before 2019']"));
	        moveToElement(years);
	        years.click();


	        WebElement businessr=driver.findElement(By.xpath("//span[text()='Yes']"));
	        businessr.click();


	        WebElement Submit=driver.findElement(By.xpath("//button[text()=' Submit']"));
	        Submit.click();
	        Thread.sleep(4000);
	        Homescreen();
	        Thread.sleep(4000);
	        WebElement CM=driver.findElement(By.xpath("//img[@alt=\"CreditMantri\"]"));CM.click();
	        Thread.sleep(4000);
	        WebElement pop=driver.findElement(By.xpath("//span[@class=\"pd-lt-10\"]"));pop.click();





	        WebElement salay=driver.findElement(By.xpath(" //span[text()='Salaried']"));javaClick(salay);
	        Thread.sleep(4000);
	        WebElement com=driver.findElement(By.xpath("//span[text()='Select a company']"));
	        com.click();
	        Thread.sleep(4000);
	        WebElement cmli=driver.findElement(By.xpath("//input[@type=\"search\"]"));javaClick(cmli);
	        sendKeys(cmli,"eee");
	        Thread.sleep(4000);
	        WebElement ee=driver.findElement(By.xpath(" //li[text()='EEE AND CEE PRESSINGS PRIVATE LIMITED']"));moveToElement(ee);ee.click();
	        Homescreen();
	        Thread.sleep(4000);

	        WebElement bank=driver.findElement(By.xpath("(//span[text()='Select an option'])[1]"));bank.click();
	        Thread.sleep(4000);
	        WebElement banklist=driver.findElement(By.xpath("(//li[@role=\"option\"])[4]"));banklist.click();
	        Thread.sleep(4000);
	        WebElement scs=driver.findElement(By.xpath("//button[text()='Show me my Credit Score']"));scs.click();
	        Homescreen();


	    }















	    public static void main(String[] args) throws InterruptedException {

	        venkatBlProfile(  "jfdsjfhkjshfjds@gmail.com", "8778978280", "41129","ITIPM4332J");

	        //   KasiBlProfile();


	        // PaviBlProfile();


	        //     RagaBlProfile();


	    }





	}
	

