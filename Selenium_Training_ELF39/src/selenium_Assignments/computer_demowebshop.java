package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class computer_demowebshop {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/desktops");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@href='/build-your-cheap-own-computer'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();

	}

}
