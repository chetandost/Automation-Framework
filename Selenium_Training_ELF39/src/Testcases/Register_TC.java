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

public class Register_TC extends Base_Test {
	
	@DataProvider(name="registerdata")
	
	public Object[]testdata() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("Register");
	
	/*data[0][0]="chetan";
	data[0][1]="kumar";
	data[0][2]="chetanmkumar50	@gmail.com";
	data[0][3]="chetan12";
	data[0][4]="chetan12";*/
	return data;
	}
	@Test(dataProvider="registerdata")
	
	public void demo(String firstname, String lastname, String email, String password, String confirmpassword ) {
	

		WebElement register=driver.findElement(By.linkText("Register"));
	
		Utility_Methods.click_Element(register);
	
		WebElement gender=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
		
		Utility_Methods.click_Element(gender);
		
		WebElement first_name=driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(first_name, firstname);
		
		WebElement Lastname=driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(Lastname, lastname);
		
		WebElement Email=driver.findElement(By.xpath("//input[@name=\"Email\"]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(Email, email);
		
		WebElement Password=driver.findElement(By.xpath("//input[@id=\"Password\"]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(Password, password);
		
		WebElement confirm_password=driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(confirm_password, confirmpassword);
		
		WebElement Register=driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
		
		Utility_Methods.click_Element(Register);
		
		WebElement button=driver.findElement(By.xpath("//input[@type=\"button\"][1]"));
		
		Utility_Methods.click_Element(button);
		
	}

}
