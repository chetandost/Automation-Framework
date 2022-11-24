package selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickonradiobuttons_demowebshop {

	public static void main(String[] args)  throws Throwable{ 
		
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> radiobuttons =driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(int i=0;i<=radiobuttons.size()-1;i++) {
			
			radiobuttons.get(i).click();
			
			Thread.sleep(1000);
			
		}
		
		driver.close();
		
			
			
		}

	}


