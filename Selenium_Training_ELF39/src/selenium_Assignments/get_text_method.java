package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text_method {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		String text_value=driver.findElement(By.linkText("Register")).getText();
		System.out.println(text_value);
		
		String text_value1=driver.findElement(By.cssSelector("a[href=\"/login\"]")).getText();
		System.out.println(text_value1);

		String text_value2=driver.findElement(By.cssSelector("span[class=\"cart-label\"]")).getText();
		System.out.println(text_value2);
		
		String text_value3=driver.findElement(By.cssSelector("input[type=\"submit\"]")).getText();
		System.out.println(text_value3);
		
		//String text_value4=driver.findElement(By.cssSelector("")).getText();
		//System.out.println(text_value4);
	}

}
