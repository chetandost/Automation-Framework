package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerconfirmationdemowebshop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		String expectedresult="Your registration completed";
		
		driver.findElement(By.linkText("Register")).click();// Link Text locator
		
		driver.findElement(By.cssSelector("input[id=\"gender-male\"]")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Chet");// ID locator
		
		driver.findElement(By.name("LastName")).sendKeys("Kumr");// Name locator
		
		driver.findElement(By.id("Email")).sendKeys("chetanmkumar21@gmail.com");//id locator
		
		driver.findElement(By.name("Password")).sendKeys("chetan123");//name locator
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("chetan123");//name locator
		
		driver.findElement(By.id("register-button")).click();//id locator
	
		String actualresult=driver.findElement(By.className("result")).getText();
		
		System.out.println(actualresult);
		
		if(actualresult.equalsIgnoreCase(expectedresult)) {
			System.out.println("sucessful");
		}
		else {
			System.out.println("unsuccessful");
		}}}

