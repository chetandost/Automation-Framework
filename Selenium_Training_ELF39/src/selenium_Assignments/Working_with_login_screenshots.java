package selenium_Assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Working_with_login_screenshots {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chetanmkumar100@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("chetan12");
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		driver.findElement(By.xpath("//input[@value=\'Log in\']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File Login=ts.getScreenshotAs(OutputType.FILE);
		
		File designation2=new File("./Screenshots/Screenshots2.png");
		
		FileHandler.copy(Login, designation2);
	}

}
