package selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_webdriverwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//WebDriverWait wait=new WebDriverWait(driver,15);
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("ico-register"))));
		driver.findElement(By.className("ico-register")).click();
		
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("chetan");
		
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("kumar");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chetan12@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("chetan123");
		
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("chetan123");
		
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='register-button']"))));
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();

	}

}
