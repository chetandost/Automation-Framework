package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_Wishlist extends Utility_Methods {
	
	public DWS_Wishlist(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	//WebElement
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement wishlist;


	//methods

	public void click_wishlist() {
		click_Element(wishlist);

	
	}}
	
	
