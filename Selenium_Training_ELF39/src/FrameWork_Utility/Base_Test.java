package FrameWork_Utility;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Base_Test {
	
	
	public WebDriver driver;
	@BeforeClass
	
	public void BrowserSetup() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		 String url=Utility_Methods.Test_Configuration();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterClass
	
	public void Teardown() {
		
		driver.close();
	}
	

	
	

}
