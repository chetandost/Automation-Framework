package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativepathfirstname {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Downloads/xpath1.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("chetu");
		
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("kumar");
		
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("TYSS");
		
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Banashankari 3rd stage");
		
		//driver.close();

	}

}
