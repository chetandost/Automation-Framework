package selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_iframes {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Downloads/iframe.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//identify the frame and switch to it
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();

		driver.close();
	}

}
