package selenium_Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handling_with_alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		WebElement double_click=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions action=new Actions(driver);
		
		action.doubleClick(double_click).build().perform();
		
		Thread.sleep(2000);
		
		//Switching the alert
		Alert ale=driver.switchTo().alert();
		
		//to get text from alert
		System.out.println(ale.getText());
		
		//Handling the alert
		ale.accept();

	}

}
