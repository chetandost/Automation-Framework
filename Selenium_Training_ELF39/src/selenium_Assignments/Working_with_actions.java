package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_actions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		//identify the webelement on which i have to mouse hover
		WebElement electronics=driver.findElement(By.xpath("//a[contains(text(),'Electronics')][1]"));
		
		//Create an object for Actions class
		Actions action=new Actions(driver);
		
		action.moveToElement(electronics).build().perform();
		
		driver.close();

	}



	
		
		}
