package POM_Testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import POM_Pages.DWS_HomePage;

public class DWS_voting_poll extends Base_Test{
	
	@Test
	public void TC14() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_radio();
		hp.click_vote();

}}
