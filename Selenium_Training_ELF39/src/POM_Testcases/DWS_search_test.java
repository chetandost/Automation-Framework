package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_Search;

public class DWS_search_test extends Base_Test{
	
	@DataProvider(name="Testdata")
	public Object[][] testdata() throws IOException {
		Object[][]data=Utility_Methods.getTestData("searc_h");
		return data;
	}
	
	@Test(dataProvider = "Testdata")
	public void TC03(String search) {
		
		DWS_Search sp=new DWS_Search(driver);
		sp.enter_search(search);
		sp.click_search();
		
		
	}

}
