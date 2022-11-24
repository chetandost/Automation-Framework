package selenium_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_robot_mouse_pointer_register {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Point location=driver.findElement(By.xpath("//a[text()='Register']")).getLocation();
		
		System.out.println(location);
		
		Robot robot=new Robot();
		
		robot.mouseMove(850, 190);
		
		Thread.sleep(1000);
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

	}

}
