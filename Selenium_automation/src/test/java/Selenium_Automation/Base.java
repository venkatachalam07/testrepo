package Selenium_Automation;

	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.apache.commons.io.FileUtils;
	
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;


	import java.awt.*;
	import java.awt.event.KeyEvent;
	import java.io.*;
	import java.time.Duration;
	import java.time.LocalDate;
	import java.util.*;
	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import java.util.zip.ZipEntry;
	import java.util.zip.ZipOutputStream;



	public class Base {


	    public static WebDriver driver;

	    public static final String FILE_PATH = "/home/venkatachalam/Documents/Automation/Sanitycodee/src/main/resources/";



	   // public static  String FLOWTYPE = "test";
	    public static List<String> urlList = new ArrayList<>();




	    public static void screenShot1(WebDriver driver) throws IOException {

	        TakesScreenshot tk=(TakesScreenshot) driver;
	        File from =tk.getScreenshotAs(OutputType.FILE);
	        System.out.println(from);

	        File to = new File("/home/venkatachalam/Documents/Automation/new/src/main/resources"+from);

	        FileUtils.copyFile(from,to);
	    }

	    // chromeBrowserlauch
	    public static WebDriver chromeBrowser() {
	        WebDriverManager.chromedriver().setup();
	        return driver=new ChromeDriver();
	    }

	    //fireFox
	    public static WebDriver firefoxBrowser() {
	        WebDriverManager.firefoxdriver().setup();
	        return driver=new EdgeDriver();
	    }

	    // urlLaucnh
	    public static void urlLaunch(String url) {
	        driver.get(url);
	    }

	    //impWait and maximize




	    public static void maximize(){
	        driver.manage().window().maximize();
	    }





	    // sendKeys
	    public static void sendKeys(WebElement e, String data) {
	        e.sendKeys(data);
	    }
	    // dragAnddrop
	    public static void dragAndDrop(WebElement from, WebElement to) {
	        Actions a=new Actions(driver);
	        a.dragAndDrop(from, to).perform();
	    }
	    // moveToElement
	    public static void moveToElement(WebElement e) {
	        Actions a=new Actions(driver);
	        a.moveToElement(e).perform();
	    }
	    //actionClick
	    public static void actionClick(WebElement clk) {
	        Actions a=new Actions(driver);
	        a.click(clk).perform();
	    }
	    // doubleClick
	    public static void doubleClick(WebElement e) {
	        Actions a=new Actions(driver);
	        a.doubleClick(e).perform();
	    }
	    //contextClick
	    public static void contextClick(WebElement e) {
	        Actions a=new Actions(driver);
	        a.contextClick(e).perform();
	    }

	    // simpleAlert
	    public static void simpleAlert() {
	        Alert alert = driver.switchTo().alert();
	        alert.accept();
	    }
	    // confirmAlert
	    public static void confirmAlert() {
	        Alert alert = driver.switchTo().alert();
	        alert.dismiss();
	    }
	    // promptAlert
	    public static void promptAlert(String input) {
	        Alert alert = driver.switchTo().alert();
	        alert.sendKeys(input);
	        alert.accept();
	    }
	    // selectBYIndex
	    public static void selectByIndex(WebElement e,int index) {
	        Select s=new Select(e);
	        s.selectByIndex(index);
	    }
	    // selectByValue
	    public static void selectByValue(WebElement e,String Value) {
	        Select s=new Select(e);
	        s.selectByValue(Value);
	    }
	    // selectByVisible
	    public static void selectByVisibleText(WebElement e,String Text) {
	        Select s=new Select(e);
	        s.selectByVisibleText(Text);
	    }
	    // isMultiple
	    public static boolean isMultiple(WebElement e) {
	        Select s=new Select(e);
	        return s.isMultiple();
	    }

	    // setAtrribute
	    public static void setAttribute(String text,WebElement e) {
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].setAttribute('value','"+text+"')", e);
	    }
	    // getAtrribute
	    public static String getAttribute(WebElement e) {
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        Object ggg = js.executeScript("return arguments[0].getAttribute('value')", e);
	        return ggg.toString();
	    }
	    // javaClick
	    public static void javaClick(WebElement e) {
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].click()", e);
	    }
	    // down
	    public static void down(WebElement e) {
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].scrollIntoView(true)", e);
	    }
	    //up
	    public static void up(WebElement e) {
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        js.executeScript("arguments[0].scrollIntoView(false)", e);
	    }


	    // frameIndex
	    public static void frameIndex(int index) {
	        driver.switchTo().frame(index);
	    }
	    // frameName
	    public static void frameName(String name) {
	        driver.switchTo().frame(name);
	    }
	    // frameWebElement
	    public static void frameWebElement(WebElement e) {
	        driver.switchTo().frame(e);
	    }
	    // defaultContent
	    public static void defaultContent() {
	        driver.switchTo().defaultContent();
	    }
	    // parentFrame
	    public static void parentframe() {
	        driver.switchTo().parentFrame();
	    }
	    // toUrl
	    public static void toUrl(String url) {
	        driver.navigate().to(url);
	    }
	    // back

	    public static void back() { driver.navigate().back();  }



	    // forward
	    public static void forward() {
	        driver.navigate().forward();
	    }
	    // refresh
	    public static void refresh() {
	        driver.navigate().refresh();
	    }
	    // isDisplayed
	    public static boolean isDisplayed(WebElement e) {
	        return e.isDisplayed();
	    }
	    // isSelected
	    public static boolean isSelected(WebElement e) {
	        return e.isSelected();
	    }
	    // isEnabled
	    public static boolean isEnabled(WebElement e) {
	        return e.isEnabled();
	    }
	    //handleUrl
	    public static void handleUrl(String text) {
	        driver.switchTo().window(text);
	    }
	    //getHandle
	    public static String getHandle() {
	        return driver.getWindowHandle();
	    }
	    //getHandles
	    public static void getHandles(int index) {
	        Set<String> st = driver.getWindowHandles();
	        List<String> li=new ArrayList<String>();
	        li.addAll(st);

	        driver.switchTo().window(li.get(index));
	    }



	    public static void Screenshot () throws IOException {

	        TakesScreenshot tk=(TakesScreenshot) driver;
	        File scr =tk.getScreenshotAs(OutputType.FILE);
	        System.out.println(scr);
	        File des = new File("/home/venkatachalam/Documents/Automation/new/src/main/resources/image"+scr);
	        FileUtils.copyFile(scr,des);

	    }
	    public static void Homescreen()  {
	//
	//
//	        try {
	//
//	            Thread.sleep(3000);
	//
//	            TakesScreenshot tk = (TakesScreenshot) driver;
	//
//	            File scr = tk.getScreenshotAs(OutputType.FILE);
	//
//	            File file =null;
	//
//	            switch(flowtype){
	//
//	                case "PRE-LOGIN":
	//
//	                case "test":
	//
//	                case "postLogin":
//	                    System.out.println("screenshot path  = "+FILE_PATH +flowtype+scr);
//	                    file = new File( FILE_PATH + flowtype + scr );
//	                    break;
	//
	//
//	            }
	//
//	            FileUtils.copyFile(scr,file);
	//
//	        }
//	        catch (IOException I){
//	            System.out.println("taking screenshot error");
//	        } catch (InterruptedException e) {
//	            throw new RuntimeException(e);
//	        }
	//
	    }

	    // --------------------------------------------------------------------------------------------------------

	    public static void homeScreen(String flowtype)  {

	        try {

	            Thread.sleep(3000);

	          ///  System.out.println("driverrr "+driver);
	            TakesScreenshot tk = (TakesScreenshot) driver;

	          //  System.out.println("tk  "+tk);

	            File scr = tk.getScreenshotAs(OutputType.FILE);
	            File file =null;
	            switch(flowtype){

	                case "PRE-LOGIN":

	                case "test":

	                case "postLogin":

	                case "Pre-loginresource":

	                case"profiling":

	                    System.out.println("screenshot path  = "+FILE_PATH +flowtype+scr);
	                    file = new File( FILE_PATH + flowtype + scr );
	                    break;


	            }

	            FileUtils.copyFile(scr,file);

	        }
	        catch (IOException I){
	            System.out.println("taking screenshot error");
	        } catch (InterruptedException e) {
	            throw new RuntimeException(e);
	        }
	    }

	    public static void time() {
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	    }

//
//	    public  static void impminutes(int mits){
//	        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
//	    }

	    public static void down () throws AWTException {
	        Robot robot=new Robot();
	        robot.keyPress(KeyEvent.VK_DOWN);
	        robot.keyRelease(KeyEvent.VK_DOWN);
	    }


	    public static void Scroll() throws InterruptedException {
	        JavascriptExecutor j = (JavascriptExecutor) driver;
	        j.executeScript("window.scrollBy(500,900)");
	        Thread.sleep(4000);
	        j.executeScript("window.scrollBy(500,5000)");
	    }


	   //  --- Credit card Baner validation

	    public static void ccbeener() throws InterruptedException {

	        while (true) {
	            WebElement cc2 = driver.findElement(By.xpath(" /html/body/div[2]/div[5]/div[2]/section[7]/div/div[11]/div/div/div[1]"));
	           // System.out.println(cc2);
	            WebElement cont = driver.findElement(By.xpath(" //p[text()='Check the Best ']"));
	            if (cont.getText().equals("Check the Best")) {
	              //  System.out.println("hsdjagsajsajhsajs" + cont);
	                System.out.println("pop up came ");
	                WebElement cc1 = driver.findElement(By.xpath("//*[@id=\"CreditCardOffer\"]/div/div/div[1]"));
	                Thread.sleep(3000);
	                javaClick(cc1);
	                break;
	            }

	        }
	    }


	    public static void Enter () throws AWTException {
	        Robot robot=new Robot();
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	    }
	    public static void printscreen() throws AWTException {
	        Robot robot=new Robot();
	        robot.keyPress(KeyEvent.VK_PRINTSCREEN);
	        robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
	    }

	    // Doesboard Banner validation


	    public static void company() throws InterruptedException {
	        WebElement salay=driver.findElement(By.xpath(" //span[text()='Salaried']"));javaClick(salay);
	        Thread.sleep(4000);
	        WebElement com=driver.findElement(By.xpath("//span[text()='Select a company']"));
	        com.click();
	        Thread.sleep(4000);
	        WebElement cmli=driver.findElement(By.xpath("//input[@type=\"search\"]"));javaClick(cmli);
	        sendKeys(cmli,"eee");
	        Thread.sleep(4000);
	        WebElement ee=driver.findElement(By.xpath(" //li[text()='EEE AND CEE PRESSINGS PRIVATE LIMITED']"));moveToElement(ee);ee.click();
	     homeScreen("base");
	        Thread.sleep(4000);
	        WebElement bank=driver.findElement(By.xpath("(//span[text()='Select an option'])[1]"));bank.click();
	        Thread.sleep(4000);
	        WebElement banklist=driver.findElement(By.xpath("(//li[@role=\"option\"])[4]"));banklist.click();
	        Thread.sleep(4000);
	        WebElement scs=driver.findElement(By.xpath("//button[text()='Show me my Credit Score']"));scs.click();
	        homeScreen("Base");}




	    public static void Zipfile() throws IOException {


	        List<String> filesListInDir1 = new ArrayList<String>();

	        //zipping the files , present inside the folder
	        String path="/home/venkatachalam/Documents/Automation/Sanitycodee/src/main/resources/"+LocalDate.now()+"/tmp";

	        System.out.println(path);

	        File dir = new File(path);


	        //zipped file path
	        String zipDirName = "/home/venkatachalam/Documents/Automation/Sanitycodee/src/main/resources/"+LocalDate.now()+"/tmp1.zip";

//	            File createFolder=new File("src/main/resources/zipFolder2");
	//
//	            if(!createFolder.exists()){
//	                createFolder.mkdirs();
//	            }


	        File[] files = dir.listFiles();

	        for (File file : files) {
	            if (file.isFile()) filesListInDir1.add(file.getAbsolutePath());

	            FileOutputStream fos = new FileOutputStream(zipDirName);
	            ZipOutputStream zos = new ZipOutputStream(fos);
	            for (String filePath : filesListInDir1) {
	                System.out.println("Zipping " + filePath);
	                //for ZipEntry we need to keep only relative file path, so we used substring on absolute path
	                ZipEntry ze = new ZipEntry(filePath.substring(dir.getAbsolutePath().length() + 1, filePath.length()));
	                zos.putNextEntry(ze);
	                //read the file and write to ZipOutputStream
	                FileInputStream fis = new FileInputStream(filePath);
	                byte[] buffer = new byte[1024];
	                int len;
	                while ((len = fis.read(buffer)) > 0) {
	                    zos.write(buffer, 0, len);
	                }
	                zos.closeEntry();
	                fis.close();
	            }
	            zos.close();
	            fos.close();
	        }

//	            if(dir.exists())
//	                System.out.println("Folder deleted successfully "+dir.delete());
	    }

	// Zipfile
	    public static void zipFile(String path,String zipFilePath) throws IOException {

	        List<String> filesListInDir1 = new ArrayList<String>();

	        //zipping the files , present inside the folder

	        System.out.println(path);

	        File dir = new File(path);

	        //zipped file path

	        File[] files = dir.listFiles();

	        System.out.println("total screenshot size = "+files.length);

	        for (File file : files) {

	            if (file.isFile()) filesListInDir1.add(file.getAbsolutePath());


	            FileOutputStream fos = new FileOutputStream(zipFilePath);

	            ZipOutputStream zos = new ZipOutputStream(fos);

	            for (String filePath : filesListInDir1) {

	                System.out.println("Zipping " + filePath);

	                //for ZipEntry we need to keep only relative file path, so we used substring on absolute path
	                ZipEntry ze = new ZipEntry(filePath.substring(dir.getAbsolutePath().length() + 1, filePath.length()));

	                zos.putNextEntry(ze);

	                //read the file and write to ZipOutputStream
	                FileInputStream fis = new FileInputStream(filePath);

	                byte[] buffer = new byte[1024];

	                int len;

	                while ((len = fis.read(buffer)) > 0) {
	                    zos.write(buffer, 0, len);
	                }

	                zos.closeEntry();

	                fis.close();

	            }

	            zos.close();

	            fos.close();

	        }

	    }


	    public static String geturl(){
	        String dd =driver.getCurrentUrl();
	        System.out.println(dd);
	        return dd;
	    }

	        public static void cmlogo() throws InterruptedException {
	    WebElement CM=driver.findElement(By.xpath("//img[@alt=\"CreditMantri\"]"));CM.click();
	    Thread.sleep(4000);
	    WebElement pop=driver.findElement(By.xpath("//span[@class=\"pd-lt-10\"]"));pop.click();

	//p[contains(text(),'Send')]
	}

//	    public static void emailsent() throws MessagingException {
//
//
//
//	        System.out.println("Preparing Email .. ");
//	        Properties properties=new Properties();
//	        properties.put("mail.smtp.auth","true");
//	        properties.put("mail.smtp.starttls.enable","true");
//	        properties.put("mail.smtp.host","smtp.gmail.com");
//	        properties.put("mail.smtp.port","587");
//	//
//	        String myAccountEmail="venkatachalam@creditmantri.com";
//	        String password="bsmgqzvhtruxrrbb"; //
//
//	//
////	        String myAccountEmail="venkatachalambabu2001@gmail.com";
////	        String password="njmdtlfjhrnwxtvd"; //
//
//	        Session session=Session.getDefaultInstance(properties, new Authenticator() {
//	            @Override
//	            protected PasswordAuthentication getPasswordAuthentication() {
//	                return new PasswordAuthentication(myAccountEmail,password);
//	            }
//	        });
//
//	        Message message = prepareMessage(session,myAccountEmail,"","/home/venkatachalam/Documents/Automation/Sanitycodee/src/main/resources/" + LocalDate.now());
//
//	     //  String Prelogin= message();
//
//	        Transport.send(message);
//
//	        System.out.println("Mail Sent Successfully");
//
//	    }

//
//	    public static void emailSent(String excelPath,String zipFilePath) throws MessagingException {
//
//
//
//	        System.out.println("Preparing Email .. ");
//	        Properties properties=new Properties();
//	        properties.put("mail.smtp.auth","true");
//	        properties.put("mail.smtp.starttls.enable","true");
//	        properties.put("mail.smtp.host","smtp.gmail.com");
//	        properties.put("mail.smtp.port","587");
//	//
//	        String myAccountEmail="venkatachalam@creditmantri.com";
//	        String password="zqzjzmqxticaudtt"; //
//
//	//
////	        String myAccountEmail="venkatachalambabu2001@gmail.com";
////	        String password="njmdtlfjhrnwxtvd"; //
//
//	        Session session=Session.getDefaultInstance(properties, new Authenticator() {
//	            @Override
//	            protected PasswordAuthentication getPasswordAuthentication() {
//	                return new PasswordAuthentication(myAccountEmail,password);
//	            }
//	        });
//
//	        Message message = prepareMessage(session,myAccountEmail,excelPath,zipFilePath);
//
//	        Transport.send(message);
//
//	        System.out.println("Mail Sent Successfully");
//
//	    }
//
//	    static Message prepareMessage(Session session, String myAccountEmail,String excelPath,String zipFilePath){
//	        Message message=new MimeMessage(session);
//
//	        try{
//	            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("fhsafaa.g@creditmantri.com"));
//	            String address = "venkatachalam@creditmantri.com,";
//	            InternetAddress[] iAdressArray = InternetAddress.parse(address);
//	            message.setRecipients(Message.RecipientType.CC, iAdressArray);
//	            message.setSubject("Prelogin Automation Report");
//
//	            BodyPart messageBodyPart1 = new MimeBodyPart();
//
//	            // Set the body of email    This is message body
//	            messageBodyPart1.setText("Hi Team,\n" +
//	                    "\n" +
//	                    "Thanks & Regards \n" +
//	                    "Venkatachalam B");
//
//	            // Create another object to add another content
//	            MimeBodyPart messageBodyPart2 = new MimeBodyPart();
//
//	            // Mention the file which you want to send
//	            String filename =zipFilePath;
//	      //     String filename ="/home/venkatachalam/Documents/Automation/Sanitycodee/src/main/resources/newExcel.xlsx";
//
//	            // Create data source and pass the filename
//	            DataSource source = new FileDataSource(filename);
//
//	            // set the handler
//	            messageBodyPart2.setDataHandler(new DataHandler(source));
//
//	            messageBodyPart2.setFileName("venkat.zip");
//
//	            // set the file
//	            messageBodyPart2.setFileName(filename);
//
//	            DataSource source1 = new FileDataSource(excelPath);
//	            BodyPart messageBodyPart = new MimeBodyPart();
//	            messageBodyPart.setDataHandler(new DataHandler(source));
//	            messageBodyPart.setFileName(filename);
//
//
//
//	            // Create object of MimeMultipart class
//	            Multipart multipart = new MimeMultipart();
//
//	            multipart.addBodyPart(messageBodyPart);
//
//	            // add body part 1
//	            multipart.addBodyPart(messageBodyPart2);
//
//	            // add body part 2
//	            multipart.addBodyPart(messageBodyPart1);
//
//	            // set the content
//	            message.setContent(multipart);
//
//
//	            return message;
//
//	        }catch (Exception e){
//
//	            System.out.println(e.getMessage());
//	            e.printStackTrace();
//	        }
//	        return null;
//	    }
//
//
//




	    public static void createFolder(){

	        String path="/home/venkatachalam/Documents/Automation/Sanitycodee/src/main/resources/"+ LocalDate.now();

	        System.out.println("path " +path);

	        File createFolder = new File(path);

//	            if(createFolder.exists()){
	//
//	                System.out.println("isFolderExist "+createFolder.exists());
	//
//	                System.out.println("Folder Already Exist");
	//
	//
//	            }else{

	        System.out.println("creating folder ....");

	        createFolder.mkdir();

	        System.out.println("folder created");

//	            }

	    }




	//
//	    // getExcelData
//	    public static String getExcelData( String filename,String sheetname,int rowno,int cellno) throws IOException {
//	        File loc=new File("C:\\Users\\MY PC\\eclipse-workspace\\Testmaven\\src\\test\\resources\\Screenshot\\Excel\\"+filename+".xlsx");
//	        FileInputStream st= new FileInputStream(loc);
//	        Workbook w =new XSSFWorkbook(st);
//	        Sheet sheet = w.getSheet(sheetname);
//	        Row row = sheet.getRow(rowno);
//	        Cell cell = row.getCell(cellno);
	//
//	        int type = cell.getCellType();
//	        // type-----1 String
//	        // type-----0 Number,Date
//	        String value=null;
//	        if (type==1) {
//	            value = cell.getStringCellValue();     }
//	        else {
//	            if (DateUtil.isCellDateFormatted(cell)) {
//	                value = new SimpleDateFormat("dd-MM-yyyy").format(cell.getDateCellValue());     }
//	            else {
//	                value = String.valueOf((long)cell.getNumericCellValue());
//	            }
//	        }
//	        return value;
	//
//	    }
	//}



	    // ====================================



//
////	    public static void addUrlTestCaseInExcel(List<LinkedHashMap<String,String>> urlStatusList ,String filename) throws IOException {
//	    public static void addUrlTestCaseInExcel(List<UrlTestCase> urlStatusList ,String filename) throws IOException {
//
//
//
//	     //   String filename = "src/main/resources/newExcel.xlsx";
//
//	        HSSFWorkbook workbook = new HSSFWorkbook();
//
//	        HSSFSheet sheet = workbook.createSheet("UrlTestCase");
//
//	        HSSFRow rowhead;
//
//	        rowhead = sheet.createRow(0);
//
//	        rowhead.createCell(0).setCellValue("Url");
//
//	        rowhead.createCell(1).setCellValue("Status");
//
//	        rowhead.createCell(2).setCellValue("Testcases");
//
//	        for(int i=1;i<=urlStatusList.size();i++) {
//
//	            System.out.println("row "+i);
//
//
//	            rowhead = sheet.createRow((short) i);
//
//	            for (int j = 0; j <= 2; j++) {
//
//	                if(j==0)
//	                    rowhead.createCell(j).setCellValue(urlStatusList.get(i-1).getUrl());
//
//	                else if(j==1)
//	                    rowhead.createCell(j).setCellValue(urlStatusList.get(i-1).getStatus());
//
//	                else if(j==2)
//	                    rowhead.createCell(j).setCellValue("Landing");
//
//	            }
//
//
//
//
//
//	        }
//
//	        FileOutputStream fileOut = new FileOutputStream(filename);
//	        workbook.write(fileOut);
//	//closing the Stream
//	        fileOut.close();
//	//closing the workbook
//	        workbook.close();
//
//
//
//	    }
//
//	    //new email method
//
//	    public static void emailSent(List<String> fileList,String flowtype,Long successCount,Long failureCount) throws MessagingException, javax.mail.MessagingException {
//
//	        System.out.println("Preparing Email .. ");
//
//	        Properties properties=new Properties();
//
//	        properties.put("mail.smtp.auth","true");
//	        properties.put("mail.smtp.starttls.enable","true");
//	        properties.put("mail.smtp.host","smtp.gmail.com");
//	        properties.put("mail.smtp.port","587");
//
//	//KASI
//	        String myAccountEmail="kasiraja.g@creditmantri.com";
//	       String password="nlpmuiluzqhiybym";
//
//	// Presnoal email
////	        String myAccountEmail="venkatachalambabu2001@gmail.com";
////	        String password=" zhidilhjifiomdwc";
//
//
//	//company email
//
//	      //  String myAccountEmail="venkatachalam@creditmantri.com";
//	     //   String password="xxwulrqvgsfmjqjd";
//
//
//
//
////	        String myAccountEmail="venkatachalam@creditmantri.com";
////	        String password="zqzjzmqxticaudtt"; //
//
////	        String myAccountEmail="venkatachalam@creditmantri.com";
//	//
////	        String password="xxwulrqvgsfmjqjd";
//
//	        Session session=Session.getDefaultInstance(properties, new Authenticator() {
//	            @Override
//	            protected PasswordAuthentication getPasswordAuthentication() {
//	                return new PasswordAuthentication(myAccountEmail,password);
//	            }
//	        });
//
//	        Message message = prepareMessage(session,myAccountEmail,fileList,flowtype,successCount,failureCount);
//
//	        Transport.send(message);
//
//	        System.out.println("Mail Sent Successfully");
//
//	    }
//	    static Message prepareMessage(Session session, String myAccountEmail,List<String> fileList,String flowtype,Long successCount,Long failureCount){
//
//	        Message message=new MimeMessage(session);
//
//
//	        try{
//	// presnaol email sentreport
//
//	     //     message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("venkatachalam@creditmantri.com"));
//	    //     String address = "venkatachalam@creditmantri.com";
//
//	// Team email
//
//	           message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("kasiraja.g@creditmantri.com"));
//
//	         String address = "productengineering-qas@creditmantri.com";
//
//	            InternetAddress[] iAdressArray = InternetAddress.parse(address);
//
//	            message.setRecipients(Message.RecipientType.CC, iAdressArray);
//
//	            message.setSubject("Prelogin Automation Report");
//
//	            BodyPart messageBodyPart1 = new MimeBodyPart();
//
//	            String text="<table border=\"1px solid black\" style=\"width:50%\" >"+ "<tr style=\"background-color: #BEBEBE\">"+ "<td><b>   URL  <b></td>"+ "<td><b>Success Test Case<b></td>"+"<td><b>Failure Test Case<b></td>"+"</tr>"+"<tr>"+"<td>" + "Total Count" + "</td>"+ "<td style=\"background-color: #008000\">" + successCount + "</td>"+ "<td style=\"background-color: #FF0000\">" + failureCount + "</td>"+"</tr>"+"</table>";
//
//
//	            messageBodyPart1.setContent(text,"text/html");
//
//	            System.out.println(fileList);
//
//
//	            // Create object of MimeMultipart class
//	            Multipart multipart = new MimeMultipart();
//
//
//	            for(String fileName : fileList){
//
//	                // Create another object to add another content
//	                MimeBodyPart messageBodyPart = new MimeBodyPart();
//
//	                System.out.println(fileName);
//
//	                DataSource source = new FileDataSource(fileName);
//
//	                messageBodyPart.setDataHandler(new DataHandler(source));
//
//	                if(fileName.contains(".zip")){
//	                    messageBodyPart.setFileName(flowtype+".zip");
//	                }else if(fileName.contains(".xlsx")){
//	                    messageBodyPart.setFileName(flowtype+".xlsx");
//	                }
//
//
//
//	                multipart.addBodyPart(messageBodyPart);
//
//	            }
//
//
//
//
//
////	            // Create object of MimeMultipart class
////	            Multipart multipart = new MimeMultipart();
//
////	            multipart.addBodyPart(messageBodyPart);
//
//	            // add body part 1
////	            multipart.addBodyPart(messageBodyPart2);
//
//	            // add body part 2
//	            multipart.addBodyPart(messageBodyPart1);
//
//	            //3
////	            multipart.addBodyPart(messageBodyPart3);
//
//	            // set the content
//	            message.setContent(multipart);
//
//	            return message;
//
//	        }catch (Exception e){
//
//	            System.out.println(e.getMessage());
//	            e.printStackTrace();
//	        }
//	        return null;
//	    }
//
//
//
//	    //create a Folder
//
//	    public static void createFolder(String path)  {
//
//	        File file = new File(path);
//
//	        if(file.exists()){
//
//	            try {
//
//	                System.out.println("isDirectory Or Not "+file.isDirectory());
//
//	                if(file.isDirectory()) {
//
//	                    System.out.println("Folder Deleting ..");
//
//	                    FileUtils.deleteDirectory(file);
//
//	                    System.out.println("Folder Deleted ");
//
//	                    createFolder(path);
//
//	                }
//
//	            }catch(Exception e){
//
//	                System.out.println("while deleting folder got exception");
//
//	                e.printStackTrace();
//
//	            }
//
//
//	        }else{
//
//	            System.out.println("Folder Creating ...");
//
//	            Boolean isFolderCreated = file.mkdir();
//
//	            System.out.println("Folder Created "+isFolderCreated);
//
//	        }
//
//
//
//
//
//
//	    }
//
//
//	    public static void main(String[] args) throws IOException, InterruptedException, MessagingException, AWTException {
//
//	        zipFile("/home/venkatachalam/Documents/Automation/Sanitycodee/src/main/resources/PRE-LOGIN/tmp","/home/venkatachalam/Documents/Automation/Sanitycodee/src/main/resources/automattttttt.zip");
//	    }
//
//
//
//

	//   ==========

	    // Profiling BL




//
//	    public static void createZipFileAndSendEmail(String FLOWTYPE,List<UrlTestCase> urlTestCaseList) throws IOException, MessagingException {
//
//	        String screenShotDirPath = FILE_PATH+FLOWTYPE+"/tmp" ;
//
//	        String zipFilePath = FILE_PATH+FLOWTYPE+".zip";
//
//	        String excelPath = "src/main/resources/newExcel.xlsx";
//
//	        zipFile(screenShotDirPath,zipFilePath);
//
//	        LeanExcel.createExcelSheets(excelPath);
//
//	        addUrlTestCaseInExcel(urlTestCaseList,excelPath);
//
//	        List<String> attachmentList = new LinkedList<>();
//
//	        attachmentList.add(excelPath);
//
//	        attachmentList.add(zipFilePath);
//
//	        Long successCount = urlTestCaseList.stream().filter(s->s.getStatus().contains("success")).count();
//	        Long failureCount = urlTestCaseList.stream().filter(s->s.getStatus().contains("failure")).count();
//
//
//	        emailSent(attachmentList,FLOWTYPE,successCount,failureCount);
//
//
//	    }





	}


