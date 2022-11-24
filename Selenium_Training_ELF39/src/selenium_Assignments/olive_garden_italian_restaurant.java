package selenium_Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class olive_garden_italian_restaurant {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Downloads/MultipleWindow.html");
		
		driver.manage().window().maximize();
		
		String parent_window=driver.getWindowHandle();
		
		
		driver.findElement(By.cssSelector("input[type='button']")).click();
		
		Thread.sleep(2000);
		
		Set<String>total_windows=driver.getWindowHandles();
		
		for(String child:total_windows) {
		
		driver.switchTo().window(child);
		
		if(driver.getTitle().equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food")) {
			
		driver.close();
		}}}
}
		
		
		
		
		
		
		

	




		
	
