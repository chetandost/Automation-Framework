package selenium_Assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_screenshot_homepage {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","./Driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File homepage=ts.getScreenshotAs(OutputType.FILE);
		
		File destination1=new File("./Screenshots/screenshots1.png");
		
		FileHandler.copy(homepage, destination1);
		
		

	}

}
