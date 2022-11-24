package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;

public class Login_TC extends Base_Test {
	
@DataProvider(name="LoginData")
	
	public Object[]testlog() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("Login");
		
		/*data[0][0]="chetanmkumar50@gmail.com";
		data[0][1]="chetan12";*/
		
		return data;
	}
	@Test(dataProvider="LoginData")
	
	public void demo(String Email, String Password) {
		
		
		WebElement login_Link=driver.findElement(By.linkText("Log in"));
		
		Utility_Methods.click_Element(login_Link);
		
		WebElement email=driver.findElement(By.id("Email"));
		
		Utility_Methods.Enter_value_in_Edit_Field(email, Email);
		
		WebElement password=driver.findElement(By.id("Password"));
		
		Utility_Methods.Enter_value_in_Edit_Field(password, Password);
		
		WebElement click=driver.findElement(By.id("RememberMe"));
		
		Utility_Methods.click_Element(click);
		
		WebElement submit=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		
		Utility_Methods.click_Element(submit);
			
		WebElement logout=driver.findElement(By.xpath("//a[text()='Log out']"));
		
		Utility_Methods.click_Element(logout);
	}}

	
	
