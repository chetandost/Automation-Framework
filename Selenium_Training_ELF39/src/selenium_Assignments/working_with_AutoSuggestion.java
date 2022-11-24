package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@class='ui-menu-item'][2]/div[text()='India']")).click();
		
		//driver.close();

	}

}
