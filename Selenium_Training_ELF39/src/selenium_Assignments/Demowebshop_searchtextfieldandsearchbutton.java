package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop_searchtextfieldandsearchbutton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		//driver.findElement(By.className("search-box-text")).sendKeys("Blue Jeans");//search box textfield
		//driver.findElement(By.className("button-1")).click();//search button
		
		//driver.findElement(By.tagName("a")).click();
		//driver.close();
		//driver.quit();
	}

}
