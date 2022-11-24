package practice_framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Utility_Methods;

public class practice_search extends practice_base_test {
	
	@DataProvider(name="searchdata")
	
	public Object[]testdata() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("Amazon_Search");
		
		return data;
	}
	
	@Test(dataProvider="searchdata")
	
	public void amazon_Search(String Search) {
		
		WebElement search=driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(search,Search);
		
		WebElement click=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		
		Utility_Methods.click_Element(click);
	
		
}}
