package TestRunner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uploadFile {

	WebDriver driver;

		
		@Test
		public void upload() throws InterruptedException, AWTException
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			driver.get("https://sandbox.mabl.com/file-upload");
			
			driver.findElement(By.xpath("//*[text()='Upload']")).click();
			Thread.sleep(3000);
			 String filePath = "C:\\Users\\venka\\OneDrive\\Desktop\\Screenshot 2024-10-06 124745.png";

	         // Copy the file path to the clipboard
	         StringSelection selection = new StringSelection(filePath);
	         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	         Robot robot = new Robot();
	         
	         robot.delay(5000); // Wait for the file chooser dialog to appear
	         robot.keyPress(KeyEvent.VK_CONTROL);
	         robot.keyPress(KeyEvent.VK_V);
	         robot.delay(5000);
	         robot.keyRelease(KeyEvent.VK_V);
	         robot.keyRelease(KeyEvent.VK_CONTROL);
	         robot.delay(5000);
	         // Simulate Enter key to select the file
	         robot.keyPress(KeyEvent.VK_ENTER);
	        
	      // Additional wait to ensure upload completes (if required)
	         Thread.sleep(2000);

	         System.out.println("File uploaded successfully!");
			
			
		}

	}
