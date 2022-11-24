package selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_Books_searchfield_iframes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Downloads/iframe.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("Books");
		
		driver.findElement(By.xpath("//input[@value='Search'][1]")).click();
		
		driver.close();

	}

}
