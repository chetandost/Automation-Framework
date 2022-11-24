package Test_NG_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_with_excel {

	@Test
	
	public void exceldemo() throws IOException {
		
		//File path
		String filepath="./TestData/TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(filepath);
		
		//Create object for excel file
		Workbook book=new XSSFWorkbook(fis);
		
		//Access the sheet
		Sheet sheet=book.getSheet("Sheet1");
		
		//Get row count and column count
		int rowcount=sheet.getPhysicalNumberOfRows();
		
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		 
		//System.out.println(rowcount);
		
		//System.out.println(col_count);
		
		Object [][]data=new Object[rowcount-1][col_count];
		
		//Print all the rows and columns
		for(int row=1;row<=rowcount-1;row++) {
			
			for(int col=0;col<=col_count-1;col++) {
				
				//System.out.print(sheet.getRow(row).getCell(col).getStringCellValue()+" ");
				
				data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
			}
			//System.out.println();
		}
		
		for(int i=0;i<=data.length-1;i++) {
			for(int j=0;j<=data[i].length-1;j++) {
				System.out.println(data[i][j]);
			}
		}
		
		
		//Access the row and column
		/*String value=sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());*/
	}
	
	
}
