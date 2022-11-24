package selenium_basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_BrowserMethodsfirefox {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Downloads\\geckodriver-v0.32.0-win64\\New folder/geckodriver.exe");(Direct Method)
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		//Launch the firefox browser
		WebDriver driver=new FirefoxDriver();
		
		
		//Navigate to website
		//driver.get("http://www.google.com");
		driver.get("http://demowebshop.tricentis.com/");
		
	}

}
