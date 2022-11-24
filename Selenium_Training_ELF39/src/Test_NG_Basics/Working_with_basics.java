package Test_NG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Working_with_basics {
	
	
	@Test
	//Test Case
	public void Demo(){
		//Test Steps
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("computers");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}

}
