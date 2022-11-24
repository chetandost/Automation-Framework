package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_Shopping_kart  extends Utility_Methods{
	
		public DWS_Shopping_kart(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		//WebElement
		@FindBy(xpath="//span[text()='Shopping cart']")
		 WebElement Shoppingkart;
		
		//Methods
		public void click_shoppingkart() {
			click_Element(Shoppingkart);
		}

}
