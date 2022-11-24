package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import POM_Pages.DWS_Contact_us;
import POM_Pages.DWS_HomePage;

public class DWS_contact_us extends Base_Test {
	
	
	@DataProvider(name="Testdata")
	public Object[][] testdata() throws IOException {
		Object[][]data=Utility_Methods.getTestData("Enquiry");
		return data;
	}
	
	@Test(dataProvider = "Testdata")
	public void TC02(String name,String mail,String enquiry) {
		
		
		DWS_HomePage cs=new DWS_HomePage(driver);
		cs.click_contact();
		
		DWS_Contact_us cc=new DWS_Contact_us(driver);
		cc.enter_name(name);
		cc.enter_Mail(mail);
		cc.enter_Enquiry(enquiry);
		cc.click_submit();
		
		
		
		
	
	}

}
