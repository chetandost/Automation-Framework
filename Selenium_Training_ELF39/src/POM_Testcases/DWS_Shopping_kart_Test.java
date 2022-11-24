package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import POM_Pages.DWS_HomePage;

public class DWS_Shopping_kart_Test extends Base_Test {
	
	
	
	@Test
	public void TC04() {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_shopping_kart();
		
	}


}
