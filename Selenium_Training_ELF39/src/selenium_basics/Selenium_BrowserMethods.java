package selenium_basics;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_BrowserMethods {

	public static void main(String[] args) {
		

		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32/chromedriver.exe");(Direct Method)
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Navigate to website
		driver.get("http://demowebshop.tricentis.com/");
		//maximize the window
		driver.manage().window().maximize();
		

	}

}
