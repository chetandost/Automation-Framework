package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

	public class DWS_Contact_us extends Utility_Methods{
	
	
	public DWS_Contact_us(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
		
		@FindBy(xpath="//input[@id=\'FullName\']")
		
		WebElement name;
		
		@FindBy(xpath="//input[@id=\'Email\']")
		
		WebElement mail;
		
		@FindBy(xpath="//textarea[@id=\'Enquiry\']")
		
		WebElement enquiry;
		
		@FindBy(xpath="//input[@name='send-email']")
		
		WebElement submit;
	
	
	public void enter_name(String value) {
		Utility_Methods.Enter_value_in_Edit_Field(name, value);
		
	}
	public void enter_Mail(String value) {
		Utility_Methods.Enter_value_in_Edit_Field(mail, value);
		
	}
	public void enter_Enquiry(String value) {
		Utility_Methods.Enter_value_in_Edit_Field(enquiry, value);
	}
	public void click_submit() {
		submit.click();
	}}

