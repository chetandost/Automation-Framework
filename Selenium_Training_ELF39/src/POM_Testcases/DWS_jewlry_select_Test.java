package POM_Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import POM_Pages.DWS_HomePage;
import POM_Pages.DWS_jewelry_select_class;

public class DWS_jewlry_select_Test extends Base_Test {
	
	@DataProvider(name="DWS_Jewellery")
    public Object [][] test_Jewellery() throws IOException{
		
		Object[][] data=Utility_Methods.getTestData("Jewellery");
		
		return data;
		
	}
	
	@Test(dataProvider= "DWS_Jewellery")
	public void TC16(String sortby,String display,String viewas) {
		
		DWS_HomePage hp = new DWS_HomePage(driver);
		hp.click_jewelry();
		
		DWS_jewelry_select_class  jew = new DWS_jewelry_select_class(driver);
		jew.sortby(sortby);
		jew.display_dropdown(display);
		jew.View_as(viewas);
		
		jew.click_prduct();
		jew.addTo_Cart_btn();
		
		
	}
	
	

}
