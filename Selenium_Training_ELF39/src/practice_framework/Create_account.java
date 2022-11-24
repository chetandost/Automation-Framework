package practice_framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Utility_Methods;

public class Create_account extends practice_base_test {
	
	
@DataProvider(name="create_amazon_account")
	
	public Object[]testdata() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("Amazon_account");
		
		return data;
	}
	
	@Test(dataProvider="create_amazon_account")
	
	public void amazon_Search(String name,String phone,String password) {
		
		WebElement click=driver.findElement(By.xpath("//span[@class=\"hm-icon-label\"]"));
		
		Utility_Methods.click_Element(click);
		
		WebElement Click=driver.findElement(By.xpath("//b[text()='Hello, sign in']"));
		
		Utility_Methods.click_Element(Click);
		
		WebElement create=driver.findElement(By.id("createAccountSubmit"));
		
		Utility_Methods.click_Element(create);
		
		WebElement username=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(username, name);
		
		WebElement phone_no=driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(phone_no, phone);
		
		WebElement Password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(Password, password);
		
		WebElement Continue=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		
		Utility_Methods.click_Element(Continue);
		
		WebElement Create=driver.findElement(By.xpath("//input[@id=\"auth-verify-button\"]"));
		
		Utility_Methods.click_Element(Create);
		
		
	}

}
