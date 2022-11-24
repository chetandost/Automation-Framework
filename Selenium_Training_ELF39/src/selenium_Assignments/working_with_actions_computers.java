package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class working_with_actions_computers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		WebElement computer=driver.findElement(By.xpath("//a[contains(text(),'Computers')][1]"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(computer).build().perform();
		
		
		

	}

}
