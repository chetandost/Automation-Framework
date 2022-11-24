package selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshoppractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Downloads/demo.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> text =driver.findElements(By.xpath("//input[@name='fname']"));
		
		for(int i=0;i<=text.size();i++) {
			text.get(i).sendKeys("chetu");
			
			
		}
		

	}

}
