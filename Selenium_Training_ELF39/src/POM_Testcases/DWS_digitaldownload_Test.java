package POM_Testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import POM_Pages.DWS_HomePage;

public class DWS_digitaldownload_Test extends Base_Test {
	
	
	@Test
	public void TC10() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_digitaldownloads();

}}
