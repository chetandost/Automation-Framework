package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_Register extends Utility_Methods {
	
	
	public DWS_Register(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	//WebElements
	@FindBy (id="gender-male")
	WebElement gender;
	
	@FindBy(id="FirstName")
	
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	
	WebElement confirmpassword;
	
	@FindBy(id="register-button")
	WebElement register;


	//Methods
	
	public void click_gender() {
		
		click_Element(gender);
		
	}
	public void enter_firstname(String value) {
		
		Enter_value_in_Edit_Field(firstname, value);
	}
	
	public void enter_lastname(String value) {
		Enter_value_in_Edit_Field(lastname, value);
	}
	
	public void enter_email(String value) {
		Enter_value_in_Edit_Field(email, value);
	}
	
	public void enter_password(String value) {
		Enter_value_in_Edit_Field(password, value);
	}
	
	public void enter_confirmpassword(String value) {
		
		Enter_value_in_Edit_Field(confirmpassword, value);
	}
	
	public void click_register_button() {
		
		click_Element(register);
	}}
