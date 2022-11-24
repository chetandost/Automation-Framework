package Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;

public class Advanced_search extends Base_Test {
	
	@DataProvider(name="advancesearch")

	public Object[]testdata() throws IOException{
	
	Object[][]data=Utility_Methods.getTestData("advancesearch");
		
		/*data[0][0]="computers";
		data[0][1]="1000";
		data[0][2]="90000";
		data[0][3]= 1;
		data[0][4]= 1;*/
		
		return data;
	}
	@Test(dataProvider="advancesearch")
	
	public void demo(String search, String a, String b, String from, String to ) {
		
		WebElement Send_keys=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		Utility_Methods.Enter_value_in_Edit_Field(Send_keys, search);
		
		WebElement Search=driver.findElement(By.xpath("//input[@value='Search']"));
		
		Utility_Methods.click_Element(Search);
		
		WebElement button=driver.findElement(By.xpath("//input[@id=\'As\']"));
		
		Utility_Methods.click_Element(button);
		
		WebElement category=driver.findElement(By.id("Cid"));
		
		Utility_Methods.Select_by_index(category, a);
		
		WebElement Checkbox=driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]"));
		
		Utility_Methods.click_Element(Checkbox);
		
		WebElement mfr=driver.findElement(By.id("Mid"));
		
		Utility_Methods.Select_by_index(mfr, b);
		
		WebElement price_from=driver.findElement(By.xpath("(//input[@type=\"text\"])[4]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(price_from, from);
		
		WebElement price_to=driver.findElement(By.xpath("(//input[@type=\"text\"])[5]"));
		
		Utility_Methods.Enter_value_in_Edit_Field(price_to, to);
		
		WebElement check_box=driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[3]"));
		
		Utility_Methods.click_Element(check_box);
	
	}

}
