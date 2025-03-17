package Selenium_Automation;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;

public class HomePage extends Base {
	
	
	
	
	 public static void main(String[] args) throws InterruptedException, IOException {
		
		 
		 chromeBrowser();
	        urlLaunch("https://www.creditmantri.com");
	        time();
	        maximize();
	       
	        WebElement Mob =driver.findElement(By.id("login-mobile-number"));
	        Mob.click();
	       
	        

//
//			XSSFWorkbook workBook = new XSSFWorkbook("C:\\Users\\DevaDarshan\\Desktop\\Names_Excel.xlsx");
//			XSSFSheet sheet = workBook.getSheetAt(0);
//		    XSSFCell cell=	sheet.getRow(4).getCell(0);
//		    
//		double cellValue=  cell.getNumericCellValue();
//		
//		int a = (int) cellValue;
//		System.out.println(a);
//			
	        
//	        
//	        XSSFWorkbook workBook =new  XSSFWorkbook("/home/venkatachalam/Desktop/Excel_CM_Data.xlsx");
//	      XSSFSheet sheet=  workBook.getSheetAt(0);
//	     XSSFCell cell=   sheet.getRow(1).getCell(0);
//	     
//	     
//	double ass=   cell.getNumericCellValue();
//	    
//	System.out.println(ass);
	    
	    Mob.sendKeys("8754653501");
	    
	    
	        
        WebElement GET =driver.findElement(By.xpath("//input[@value='Get Started']"));
        GET.click();
	       
	        
	        Date Todaydate=new Date();
			System.out.println(Todaydate);
			SimpleDateFormat format=new SimpleDateFormat("YY:MM:dd");
			String DateMontYear =format.format(Todaydate);
			System.out.println(DateMontYear);
		    String SingleDate=	DateMontYear.replaceAll(":", "");
	    	System.out.println(SingleDate);
	    	String FinalyDate= SingleDate.substring(0, 6); 
	    	String tt =FinalyDate.toString();
	    	for(int i=1;i<tt.length();i++) {
//		   WebElement gettextotp=  	driver.findElement(By.xpath("//p[text()='OTP has been sent to ']"));
//		     System.out.println( gettextotp.getText());
		    	// Verify Mobile Number 
		    	WebElement ff= driver.findElement(By.xpath("(//input[@class='form-control input otp-error-new' and @type='number' and @autocomplete='off' and @pattern='d*'])["+i+"]"));
		    	ff.sendKeys(""+ tt.charAt(i) +"");
		        javaClick(ff) ;}
	     	//  profilingform();
	    	Thread.sleep(3000);
	    	System.out.println("Profile Was done");	    	
	    	WebElement LC=driver.findElement(By.xpath("//a[text()='Loans & Cards ']"));
	    	LC.click();
	    	
	    	

	    	WebElement pl=driver.findElement(By.xpath("(//p[text()='Personal Loan'])[2]"));
	    	pl.click();
	    	
	    	
	    WebElement loanAmount=driver.findElement(By.id("loanAmount"));
	    String ln=	loanAmount.getText();
	    	
	         String  amount=loanAmount.getAttribute("value");
	       System.out.println(amount);
	    	if (ln.equalsIgnoreCase(amount)) {
	    		loanAmount.sendKeys("100000");
	    	}else {
		    	System.out.println("Loan Amount alredy Filed");
		    	loanAmount.clear();
		    	loanAmount.sendKeys("200000");
		    	
		    	
	    	}
	   
	    	WebElement employmentType=driver.findElement(By.id("employmentType"));
	    	employmentType.click();
	    	
	   
	    	WebElement salary=driver.findElement(By.id("employmentType:salaried__nth"));
	    	System.out.println(salary.getText());
	    	System.out.println(salary.getAttribute("value"));
	    	
	    	salary.clear();
	    	salary.sendKeys("100000");
	  
	    	 Thread.sleep(5000);
	    	WebElement company=driver.findElement(By.xpath("//span[text()='Where do you currently work ?']"));
	    	company.click();
	    	

	    	WebElement companysc=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
	    	companysc.sendKeys("www");
	   


	    	WebElement comn=driver.findElement(By.xpath("//li[text()='WWW COMMUNICATIONS LIMITED']"));
	        comn.click();
	   
	        

	 
	    	
	    	
	    	WebElement joiningDate=driver.findElement(By.id("personalDetailsV2FormSubmit"));
	    	moveToElement(joiningDate);
	    	
	    	joiningDate.click();
	    	joiningDate.click();
	    	
	    	
	}
	 
	 
	 
	 public static void profilingform() {
	    	WebElement email=driver.findElement(By.id("cs-email"));
	    	email.sendKeys("Venkatachalammmm@gmail.com");
	    	WebElement Drop =driver.findElement(By.id("cs-day"));
	    	Select sc=new Select(Drop);
	    	sc.selectByValue("09");
	    	WebElement Month =driver.findElement(By.id("cs-month"));
	    	Select scm=new Select(Month);
	    	scm.selectByVisibleText("Feb");
	    	WebElement year =driver.findElement(By.id("cs-year"));
            Select scy=new Select(year);
	    	scy.selectByValue("2001");
	    	WebElement pincode=driver.findElement(By.id("cs-pincode"));
	    	pincode.sendKeys("600018");
	    	WebElement pan=driver.findElement(By.id("cs-pan"));
	    	pan.sendKeys("CJJPK3780M");
//	    	WebElement element = driver.findElement(By.id("cs-first-name"));
//	    	System.out.println("Is Displayed: " + element.isDisplayed());
//	    	System.out.println("Is Enabled: " + element.isEnabled());
	    	WebElement firstname=driver.findElement(By.id("cs-first-name"));
	    	firstname.sendKeys("GOVINDAN");
	    	WebElement lastname=driver.findElement(By.id("cs-last-name"));
	    	lastname.sendKeys("KASIRAJA");
	    	WebElement Submitbtn=driver.findElement(By.xpath("//input[@value='Get Free Credit Score']"));
	    	Submitbtn.click();
	    	
	    	
		 
	 }
	 
	 
	 
 
	 
	 public static  String EveryDayOtp() {
			Date Todaydate=new Date();
			System.out.println(Todaydate);
			SimpleDateFormat format=new SimpleDateFormat("YY:MM:dd");
			String DateMontYear =format.format(Todaydate);
			System.out.println(DateMontYear);
		    String SingleDate=	DateMontYear.replaceAll(":", "");
	    	System.out.println(SingleDate);
	    	String FinalyDate= SingleDate.substring(1, 6);
			return FinalyDate;
	    	
	    	}
	 
	 
}
	


	 


