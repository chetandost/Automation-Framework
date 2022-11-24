package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop_cssselector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]")).sendKeys("Computer");
		
		driver.findElement(By.cssSelector("input[class=\"button-1 search-box-button\"]")).click();
		driver.close();

	}

}
