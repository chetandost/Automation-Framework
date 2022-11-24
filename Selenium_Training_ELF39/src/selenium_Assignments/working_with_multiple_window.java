package selenium_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_multiple_window {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		//make a note of parent window first
		String parent_window=driver.getWindowHandle();
		System.out.println(parent_window);
		
		//identify the facebook link
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		
		Thread.sleep(2000);
		
		Set<String>total_windows=driver.getWindowHandles();
		
		System.out.println(total_windows);
		
		for(String child_window:total_windows) {
			
		
		driver.switchTo().window(child_window);
		
		System.out.println(child_window);
		
		//switch to child window
		driver.switchTo().window(child_window);
		System.out.println(driver.getTitle());
		
		
		if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
			
			driver.findElement(By.name("email")).sendKeys("chetanmkumar97@gmail.com");
			
			Thread.sleep(2000);
			
			//close child window
			
			driver.close();
		}
		
		//switch back to parent window
		
		//driver.switchTo().window(parent_window);
		
		//driver.close();
			
			
			
			
		}
		

	}

}
