package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class working_with_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/User/Downloads/xpath1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Chetan");
		
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("TYSS");
		
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Bengaluru");

	}

}
