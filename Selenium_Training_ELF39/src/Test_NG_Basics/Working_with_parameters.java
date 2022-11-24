package Test_NG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Working_with_parameters {
	
	@Parameters({"URL","product"})
	@Test()
	public void parameters(String url, String value) {
		
	System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get(url);
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@id=\'small-searchterms\']")).sendKeys(value);
	
	driver.findElement(By.xpath("//input[@type=\'submit\'][1]")).click();
	
	driver.close();

}}


