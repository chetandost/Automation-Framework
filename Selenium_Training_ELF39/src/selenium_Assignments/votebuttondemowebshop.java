package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class votebuttondemowebshop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		
		driver.quit();

	}

}
