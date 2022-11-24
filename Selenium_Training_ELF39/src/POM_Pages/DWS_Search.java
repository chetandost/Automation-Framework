package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_Search extends Utility_Methods {
	
	public DWS_Search(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//WebElement
	@FindBy(id="small-searchterms")
	WebElement search;
	
	@FindBy(xpath="//input[@type=\'submit\']")
	WebElement search_button;
	
	//Method
	public void enter_search(String value) {
		
		Enter_value_in_Edit_Field(search, value);
	}
	
	public void click_search() {
		click_Element(search);
		
	}

}
