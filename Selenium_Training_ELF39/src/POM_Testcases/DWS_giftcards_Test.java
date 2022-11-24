package POM_Testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import POM_Pages.DWS_HomePage;

public class DWS_giftcards_Test extends Base_Test {
	
	
	@Test
	public void TC12() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_giftcards();

}}
