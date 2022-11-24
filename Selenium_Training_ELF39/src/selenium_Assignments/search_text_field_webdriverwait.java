package selenium_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search_text_field_webdriverwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		//Launch the chrome Browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Create an object of WebdriverWait
		//WebDriverWait wait=new WebDriverWait(driver,20);
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@type='text'][1]"))));
		
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("computer");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='Search']"))));
		
		
		String value=driver.findElement(By.xpath("//h1[text()='Search']")).getText();
		
		if(value.equalsIgnoreCase("Search")) {
			
			System.out.println("Pass");
			
		}
		
		driver.close();
	}}


