package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendkeys_demowebshop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		WebElement sendkeys=driver.findElement(By.id("small-searchterms"));
		
		Actions action=new Actions(driver);
		
		//First method
		//action.moveToElement(sendkeys).click().sendKeys("mobiles").perform();
		
		//second method
		action.sendKeys(sendkeys, "computers").perform();
		
		Thread.sleep(2000);
		
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		//driver.close();

	}

}
