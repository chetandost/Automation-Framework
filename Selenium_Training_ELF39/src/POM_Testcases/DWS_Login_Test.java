package POM_Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_Loginpage;

public class DWS_Login_Test extends Base_Test {
		
		@Test
		public void TC01() {
		
			
			DWS_HomePage hp=new DWS_HomePage(driver);
			hp.click_login();
			
			DWS_Loginpage lp=new DWS_Loginpage(driver);
			lp.Enter_username("chetanmkumar97@gmail.com");
			lp.Enter_password("chetan12");
			lp.click_login();
	}

}
