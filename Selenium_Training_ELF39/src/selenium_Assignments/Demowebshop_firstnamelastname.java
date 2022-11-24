package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop_firstnamelastname {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//launch browser
		
		driver.get("https://www.google.co.in");
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Register")).click();// Link Text locator
		
		driver.findElement(By.cssSelector("input[id=\"gender-male\"]")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Chetan M");// ID locator
		
		driver.findElement(By.name("LastName")).sendKeys("Kumar");// Name locator
		
		driver.findElement(By.id("Email")).sendKeys("chetanmkumar12@gmail.com");//id locator
		
		driver.findElement(By.name("Password")).sendKeys("chetan123");//name locator
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("chetan123");//name locator
		
		driver.findElement(By.id("register-button")).click();//id locator
		
		driver.findElement(By.className("register-continue-button")).click();
		
		driver.findElement(By.cssSelector("a[href=\"/logout\"]")).click();
		
		driver.close();
		
		
		
		
		

	}

}
