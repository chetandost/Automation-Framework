package Test_NG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel_execution_using_xml {
	
	
	@Test()
	public void demo() {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id=\'small-searchterms\']")).sendKeys("computers");
		
		driver.findElement(By.xpath("//input[@type=\'submit\'][1]")).click();
		
		driver.close();

}}
