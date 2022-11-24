package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;

public class computers_accessories_TC extends Base_Test {
	
	@Test
	
	public void accessories() {
		
		Actions action=new Actions(driver);
		
		WebElement mouse_hover=driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
		
		Utility_Methods.actions(driver, mouse_hover).moveToElement(mouse_hover).build().perform();
		
		WebElement click=driver.findElement(By.xpath("(//a[@href=\"/accessories\"])[1]"));
		
		Utility_Methods.actions(driver, click).moveToElement(click).click().perform();
		
	}

}
