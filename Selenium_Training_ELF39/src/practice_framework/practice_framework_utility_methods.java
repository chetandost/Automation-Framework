package practice_framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class practice_framework_utility_methods {
	
	
	//Utility method to get Test data
	
		public static Object[][]getTestData (String sheetname) throws IOException{
			
					//File path
					String filepath="./TestData/TestData.xlsx";
					
					FileInputStream fis=new FileInputStream(filepath);
					
					//Create object for excel file
					Workbook book=new XSSFWorkbook(fis);
					
					//Access the sheet
					Sheet sheet=book.getSheet(sheetname);
					
					int row_count=sheet.getPhysicalNumberOfRows();
					
					int colcount=sheet.getRow(0).getPhysicalNumberOfCells();
					
					//Get row count and column count
					int rowcount=sheet.getPhysicalNumberOfRows();
					
					int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
			
					Object [][]data=new Object[rowcount-1][col_count];
					
					//Print all the rows and columns
					for(int row=1;row<=rowcount-1;row++) {
						
						for(int col=0;col<=col_count-1;col++) {
							
							//System.out.print(sheet.getRow(row).getCell(col).getStringCellValue()+" ");
							
							data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
						}
						//System.out.println();
					}
					book.close();
				return data;
			
		}
		
		//Utility method for sendkeys
		public static void Enter_value_in_Edit_Field(WebElement element, String value) {
			
			element.sendKeys(value);
			
		}

		//Utility Method for click
		public static void click_Element(WebElement element) {
			
			element.click();
		}
		
		//Utility Method for dropdowns
		
		public static void Select_by_index(WebElement element, String index) {
			
			Select options=new Select(element);
			int a=Integer.parseInt(index);
			
			options.selectByIndex(a);
		}
		
		public static void select_by_visibleText(WebElement element, String value) {
			
			Select options=new Select(element);
			
			options.selectByVisibleText(value);
		}
		
		public static void select_by_value(WebElement element, String value) {
			
			Select options=new Select(element);
			
			options.selectByValue(value);
		}
		public static Actions actions(WebDriver driver,WebElement element) {
			
			Actions action =new Actions(driver);
			
			return action;
		}
		
		public static String Test_Configuration() throws IOException {
			
			String filepath="./Test_Configuration/Test_Configuration.properties";
			
			FileInputStream fis=new FileInputStream(filepath);
			
			Properties prop=new Properties();
			
			prop.load(fis);
			
			String url=prop.getProperty("url");
			
			return url;
		}
	}


