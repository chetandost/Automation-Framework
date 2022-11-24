package POM_Testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import POM_Pages.DWS_HomePage;

public class DWS_Tricentis extends Base_Test {
	
	
	@Test
	
	public void TC15() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_tricentis();

}}
