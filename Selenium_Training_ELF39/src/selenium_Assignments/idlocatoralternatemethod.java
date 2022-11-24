package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocatoralternatemethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		//alternate method using class locator
		
		driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("computer");
		driver.close();
		
		//alternate method using id locator
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("computers");
		driver.close();
	}

}
