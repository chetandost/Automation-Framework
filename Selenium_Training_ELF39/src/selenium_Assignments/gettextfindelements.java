package selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextfindelements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement>buttons=driver.findElements(By.xpath("//input[@type='button']"));
		
		for(int i=0;i<=buttons.size()-1;i++) {
			
			System.out.println(buttons.get(i).getText());
			
			driver.close();

	}

}}
