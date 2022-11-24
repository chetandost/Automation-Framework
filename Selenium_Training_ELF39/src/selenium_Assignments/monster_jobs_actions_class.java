package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class monster_jobs_actions_class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		
		driver.manage().window().maximize();
		
		WebElement jobs=driver.findElement(By.xpath("(//a[@data-check=\"menutab\"])[1]"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(jobs).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Jobs by Skills')])[1]"))).click().perform();	
		
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("(//a[@href=\"https://www.monsterindia.com/search/java-jobs\"])[1]"))).click().perform();
		
	}

}
