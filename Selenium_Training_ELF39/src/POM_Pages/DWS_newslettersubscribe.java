package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_newslettersubscribe extends Utility_Methods{
	
	public DWS_newslettersubscribe(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
		
		//WebElements
		@FindBy(xpath="(//input[@id=\"newsletter-email\"])[1]")
		
		WebElement newsletter;
		
		@FindBy(xpath="(//input[@type=\'button\'])[1]")
		
		WebElement subscribe;
		
	//Methods
		
		public void enter_subscribe_field(String value) {
			
			Enter_value_in_Edit_Field(newsletter, value);
		}
		public void click_subscribe() {
			
			click_Element(subscribe);
		}
		}
		
		


