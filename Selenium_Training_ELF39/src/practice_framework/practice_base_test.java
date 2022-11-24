package practice_framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import FrameWork_Utility.Utility_Methods;

public class practice_base_test {
	
	
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


