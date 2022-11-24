package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import POM_Pages.DWS_Advance_Search;
import POM_Pages.DWS_HomePage;

 
	
	
	 public class DWS_Advance_Search_Test extends Base_Test {
		
		@DataProvider(name = "testdata")
		public Object[][]advanceserach() throws IOException{
			Object[][] data=Utility_Methods.getTestData("advance_Search");
			return data;
		}
		

		@Test(dataProvider = "testdata")
		public void TC18(String searchvalue, String category_value,String manufacture_value,String from_value,String to_value) {
			
			DWS_HomePage hp=new DWS_HomePage(driver);
			hp.entervalue_in_searchtextfield(searchvalue);
			hp.click_search_btn();
			
		
			DWS_Advance_Search as = new DWS_Advance_Search(driver);
			
			as.click_advancesearch_checkbox();
			as.Click_Categorydropdown_button(category_value);
			as.Click_Manufacturerdropdown_button(manufacture_value);
			as.Enter_from_textfield(from_value);
			as.Enter_to_textfield(to_value);
			as.click_finalsearch_button();

			}
	}


