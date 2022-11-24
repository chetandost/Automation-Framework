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

public class Search_TC extends Base_Test {
	
	@DataProvider(name="searchdata")
	
	public Object[]testdata() throws IOException{
		
		Object[][]data=Utility_Methods.getTestData("search");
	
		/*data[0][0]="computers";*/
		
		return data;
	}
	@Test(dataProvider="searchdata")
	
	public void demo(String search) {
		
		WebElement text_field=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		Utility_Methods.Enter_value_in_Edit_Field(text_field, search);
		
		WebElement click=driver.findElement(By.xpath("//input[@value='Search']"));
		
		Utility_Methods.click_Element(click);
		
		
		
		
	}

}
