package Java_Pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Java_Methods {
	
	public static Properties prop;
	
	public static void Properties() throws IOException {
		
	
		prop= new Properties();
		 FileInputStream fis=new FileInputStream("E:\\Eclipse\\KeywordDriven\\TestData.Properties");
		 prop.load(fis);
	
		
	}
	

}
