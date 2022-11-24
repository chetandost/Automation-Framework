package practice_framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Utility_Methods;

public class login extends practice_base_test {
	
	
@DataProvider(name="login_amazon_account")
	
	public Object[]testdata() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("Log_in");
		
		return data;
	}
	
	@Test(dataProvider="login_amazon_account")
	
	public void amazon_Search(String phone, String password) {
		
		WebElement click=driver.findElement(By.xpath("//span[@class=\"hm-icon-label\"]"));
		
		Utility_Methods.click_Element(click);
		
		WebElement Click=driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]"));
		
		Utility_Methods.click_Element(Click);
		
		WebElement Phone=driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(Phone, phone);
		
		WebElement Continue_button=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		
		Utility_Methods.click_Element(Continue_button);
		
		WebElement Password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(Password, password);
		
		WebElement sign_in=driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]"));
		
		Utility_Methods.click_Element(sign_in);
	}

}
