package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class patternmatchingdemowebshop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//span[contains(text(),'Wishlist')]")).click();//text method
		
		driver.findElement(By.xpath("//span[contains(@class,'cart-label')][1]")).click();//using locators
		
		driver.close();

	}

}
