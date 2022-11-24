package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginconfirmationdemowebshop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("ico-login")).click();
		
		driver.findElement(By.id("Email")).sendKeys("chetanmkumar21@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("chetan123");
		
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		
		String excepted ="chetanmkumar21@gmail.com";
		
		String actual=driver.findElement(By.className("account")).getText();
		
		if(excepted.equalsIgnoreCase(actual)) {
			System.out.println("succesful");
		}
		else {
			System.out.println("unsuccesful");
		}
	}

}
