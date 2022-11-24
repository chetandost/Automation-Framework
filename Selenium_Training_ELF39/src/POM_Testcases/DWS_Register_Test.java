package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_Register;

public class DWS_Register_Test extends Base_Test {
	@DataProvider(name="Testdata")
	public Object[][] testdata() throws IOException {
		Object[][]data=Utility_Methods.getTestData("reg_ister");
		return data;
	}
	
	@Test(dataProvider = "Testdata")
	public void TC02(String firstname,String lastname,String email,String pwd,String cpwd) {
		DWS_HomePage hp=new DWS_HomePage(driver);
		hp.click_register();
		
		DWS_Register rp=new DWS_Register(driver);
		rp.click_gender();
		rp.enter_firstname(firstname);
		rp.enter_lastname(lastname);
		rp.enter_email(email);
		rp.enter_password(pwd);
		rp.enter_confirmpassword(cpwd);
		
	}

}
