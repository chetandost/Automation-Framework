package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass_cardropdown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Downloads/demo.html");
		
		driver.manage().window().maximize();
		
		//identify the web element of select type
		WebElement select_car=driver.findElement(By.id("standard_cars"));
		
		//Creating an object for select class
		Select sel=new Select(select_car);
		
		//Select by visible text
		sel.selectByVisibleText("Jaguar");
		
		Thread.sleep(3000);
		
		//select by value
		sel.selectByValue("vol");
		Thread.sleep(3000);
		
		//select by index
		sel.selectByIndex(9);
		
		driver.close();
		

	}

}
