package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demowebshop_dropdowns {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
		WebElement sort=driver.findElement(By.id("products-orderby"));
		
		Select sortby=new Select(sort);
		
    	sortby.selectByIndex(1);
    	
    	WebElement display=driver.findElement(By.id("products-pagesize"));
		
		Select displayby=new Select(display);
		
		displayby.selectByIndex(2);
		
		WebElement viewas=driver.findElement(By.id("products-viewmode"));
		
		Select viewasby=new Select(viewas);
		
		viewasby.selectByIndex(0);
    	
		driver.close();
		

	}

}
