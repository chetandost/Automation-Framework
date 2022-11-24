package selenium_Assignments;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_browserwindows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		

	}

}
