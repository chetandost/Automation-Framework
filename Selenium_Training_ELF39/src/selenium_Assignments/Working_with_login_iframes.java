package selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_login_iframes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Downloads/iframe.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		
		//driver.close();
	}

}
