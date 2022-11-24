package Test_NG_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Working_with_property_file {
	
	
	@Test
	
	public void propertydemo() throws IOException {
		
		String filepath="./Test_Configuration/Test_Configuration.properties";
		
		FileInputStream fis=new FileInputStream(filepath);
		
		//Create an object for property file
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.get("firstname"));
		
		System.out.println(prop.get("lastname"));
		
		
	}

}
