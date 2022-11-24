package selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptions_demowebshop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/books");
		
		driver.manage().window().maximize();
		
		WebElement books=driver.findElement(By.name("products-viewmode"));
		
		Select sel=new Select(books);
		
		List<WebElement> a1=sel.getOptions();
		
		for(int i=0;i<=a1.size()-1;i++) {
			
			System.out.println(a1.get(i).getText());
		}
		
		driver.close();

	}

}
