package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		//Identify the webelement on which i have to double click
		WebElement double_click=driver.findElement(By.cssSelector("button[ondblclick=\"myFunction()\"]"));
		
		//Create an Object for action class
		Actions action=new Actions(driver);
		
		action.doubleClick(double_click).build().perform();
		
		
		
		

	}

}
