package selenium_Assignments;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click_me_handling_alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		WebElement right_clk=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions action=new Actions(driver);
		
		Thread.sleep(2000);
		
		List<WebElement>options=driver.findElements(By.xpath("//ul/li/span"));

	    
	    for(int i=0;i<=options.size()-1;i++) {
	    	
	    	action.contextClick(right_clk).perform();
	    	
	    	options.get(i).click();
	    	
	    	Thread.sleep(1000);
	    	
	    	Alert ale=driver.switchTo().alert();
	    	
	    	ale.accept();
	    	
	    }
		
	    driver.close();
		
		
		
		
	

	}

}
