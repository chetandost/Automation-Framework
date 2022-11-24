package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativepath_register_demowebshop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		
		driver.findElement(By.xpath("//input[@name='Gender']")).click();
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Chetu");
		
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("kumar");
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("chetanmkumar02@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("chetan12");
		
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("chetan12");
		
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();

	}

}
