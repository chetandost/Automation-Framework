package selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattributemethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		//get attribute method
		
		String attribute_value=driver.findElement(By.linkText("Register")).getAttribute("class");
		System.out.println(attribute_value);
		
		driver.close();

	}

}
