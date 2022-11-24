package selenium_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class back_forward_close {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Launch the chrome browser
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();//maximize option
		
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();//backward option
		driver.navigate().forward();//forward option
		driver.navigate().refresh();//refresh option
		driver.close();//close the browser		

	}

}
