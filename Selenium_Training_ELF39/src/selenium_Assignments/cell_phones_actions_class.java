package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cell_phones_actions_class {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		//identify the webelement on which i have to mouse hover
		WebElement electronics=driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		
		
		//create an object for Actions class
		Actions action=new Actions(driver);
		
		action.moveToElement(electronics).build().perform();
		
		Thread.sleep(2000);
		
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')])[1]"))).click().perform();

		driver.close();
	}

	
	}


