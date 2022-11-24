package selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase_demowebshop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("ico-register")).click();
		
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("Chetan");
		
		driver.findElement(By.name("LastName")).sendKeys("kumar");
		
		driver.findElement(By.id("Email")).sendKeys("chetanmkumar009@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("chetan12");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("chetan12");
		
		driver.findElement(By.name("register-button")).click();
		
		driver.findElement(By.cssSelector("input[class='button-1 register-continue-button']")).click();
		
		driver.findElement(By.linkText("Log out")).click();
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("chetanmkumar009@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("chetan12");
		
		driver.findElement(By.id("RememberMe")).click();
		
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
		WebElement sortoption=driver.findElement(By.id("products-orderby"));//identifying an web element
		
		Select sortby= new Select(sortoption);//creating an object for select class
		
		sortby.selectByIndex(1);//select class using index method
		
		driver.findElements(By.linkText("//a"));//find elements method
		
		List<WebElement> bookname=driver.findElements(By.xpath("//img"));//find elements method
		
		for(int i=0;i<=bookname.size()-1;i++) {
			
			System.out.println(bookname.get(i).getAttribute("alt"));
		}
		
		driver.close();
		
		

	}

}
