package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_newslettersubscribe;

public class DWS_news_letter_subscribe extends Base_Test {
	
	@DataProvider(name="Testdata")
	
	public Object[][] testdata() throws IOException {
		
		Object[][]data=Utility_Methods.getTestData("subscribe");
		
		return data;
	}
	
	@Test(dataProvider = "Testdata")
	public void TC13(String subscribe) {

		DWS_newslettersubscribe sub=new DWS_newslettersubscribe(driver);
		
		sub.enter_subscribe_field(subscribe);
		
		sub.click_subscribe();
	
		

}}
