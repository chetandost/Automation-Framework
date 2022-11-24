package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_HomePage extends Utility_Methods{
	
	
	//Constructor -To initialize the driver instance and webElements
	public DWS_HomePage(WebDriver driver) {
		
		
		PageFactory.initElements(driver,this );
	}
	
	//WebElements
	
	@FindBy(xpath = "//input[@class=\"button-1 search-box-button\"]")
	WebElement search_btn;
	
	@FindBy(xpath = "//a[text()='Log in']")
	WebElement login_link;
	
	@FindBy(xpath="//a[text()=\"Register\"]")
	WebElement register_link;
	
	@FindBy(xpath="//span[text()=\"Shopping cart\"]")
	WebElement shopping_kart_link;
	
	@FindBy(xpath="//span[text()=\"Wishlist\"]")
	
	WebElement wishlist;
	
	@FindBy(id="small-searchterms")
	
	WebElement search;
	
	@FindBy(xpath="(//a[@href=\'/books\'])[1]")
	
	WebElement books;
	
	@FindBy(xpath="(//a[@href=\"/computers\"])[1]")
	
	WebElement computers;
	
	@FindBy (xpath="(//a[@href='/electronics'])[1]")
	
	WebElement electronics;
	
	@FindBy(xpath="(//a[@href=\"/apparel-shoes\"])[1]")
	
	WebElement apparels;
	
	@FindBy(xpath="(//a[@href=\"/digital-downloads\"])[1]")
	
	WebElement digitaldownloads;
	
	@FindBy(xpath="(//a[@href=\"/jewelry\"])[1]")
	
	WebElement jewelry;
	
	@FindBy(xpath="(//a[@href=\"/gift-cards\"])[1]")
	
	WebElement giftcards;
	
	@FindBy(xpath="//input[@id='newsletter-email']")
	
	WebElement newsletter;
	
	@FindBy(xpath="//input[@value=\'Subscribe\']")
	
	WebElement subscribe;
	
	@FindBy(xpath="//input[@id='pollanswers-1']")
	
	WebElement radio;
	
	@FindBy(xpath="//input[@id=\'vote-poll-1\']")
	
	WebElement vote;
	
	@FindBy (xpath="//a[@href=\'/tricentis\']")
	
	WebElement Tricentis;
	
	@FindBy (xpath="(//a[contains(text(),'Jewelry')])[1]")
	
	WebElement jewellery;
	
	@FindBy(xpath="//a[text()='Contact us']")
	
	WebElement contact;
	
	@FindBy(xpath="//a[text()='Facebook']")
	
	WebElement facebook;
	
	
	
	
	
	//Method
	
	public void click_search_btn() {
		search_btn.click();
	}

	
	public void click_login() {
		login_link.click();
	}
	
	public void click_register() {
		register_link.click();
	}
	
	public void click_shopping_kart() {
		shopping_kart_link.click();
	}
	
	public void click_wishlist() {
		wishlist.click();
	}
	
	public void entervalue_in_searchtextfield(String value) {
		
		Utility_Methods.Enter_value_in_Edit_Field(search, value);
		
	}
	
	public void click_books() {
		books.click();
	}
	
	public void click_computers() {
		computers.click();
	}
	
	public void click_electronics() {
		electronics.click();
	}
	
	public void click_apparel() {
		apparels.click();
	}
	
	public void click_digitaldownloads() {
		digitaldownloads.click();
	}
	
	public void click_jewelry() {
		jewelry.click();
	}
	public void click_giftcards() {
		giftcards.click();
	}
	
	public void newsletter() {
		newsletter.click();
	}
	
	public void click_subscribe() {
		subscribe.click();
	}
	
	public void click_radio() {
		radio.click();
	}
	
	public void click_vote() {
		vote.click();
	}
	
	public void click_tricentis() {
		Tricentis.click();
	}
	
	public void click_facebook() {
		facebook.click();
	}
	
	public void click_contact() {
		contact.click();
	}
	
	
	
}
	
	
	
	
	
	
	


