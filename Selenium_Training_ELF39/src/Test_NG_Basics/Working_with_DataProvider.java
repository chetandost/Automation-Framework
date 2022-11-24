package Test_NG_Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_DataProvider {
	
	@DataProvider(name="TestData")
	public Object[][] testdata(){
		Object[][]data=new Object[5][2];
		data[0][0]="chetan";
		data[0][1]="kumar";
		data[1][0]="soma";
		data[1][1]="shekar";
		data[2][0]="darshan";
		data[2][1]="gowda";
		data[3][0]="sankalp";
		data[3][1]="sangapur";
		data[4][0]="gowda";
		data[4][1]="darshan";
	return data;
		}
	
	@Test(dataProvider="TestData")
	public void testdatademo(String Firstname, String Lastname) {
		System.out.println(Firstname);
		System.out.println(Lastname);
	}

}
