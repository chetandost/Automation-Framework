package Test_NG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_Register_provider {
	
	
	@DataProvider(name="Test")
	
	public Object[][]testdata(){
		
		Object[][]data=new Object[5][5];
		
		data[0][0]="chetan";
		data[0][1]="kumar";
		data[0][2]="chetanmkumar92@gmail.com";
		data[0][3]="chetan12";
		data[0][4]="chetan12";
		data[1][0]="darshan";
		data[1][1]="gowda";
		data[1][2]="chetanmkumar96@gmail.com";
		data[1][3]="chetan12";
		data[1][4]="chetan12";
		data[2][0]="rajneesh";
		data[2][1]="gowda";
		data[2][2]="chetanmkumar95@gmail.com";
		data[2][3]="chetan12";
		data[2][4]="chetan12";
		data[3][0]="soma";
		data[3][1]="shekhar";
		data[3][2]="chetanmkumar94@gmail.com";
		data[3][3]="chetan12";
		data[3][4]="chetan12";
		data[4][0]="sankalp";
		data[4][1]="sangapur";
		data[4][2]="chetanmkumar94@gmail.com";
		data[4][3]="chetan12";
		data[4][4]="chetan12";
		
		return data;
	}
	@Test(dataProvider="Test")
	
	public void testdatademo(String Firstname, String Lastname,String Email, String password, String ComfirmPassword) {
		
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys(Firstname);
		
		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys(Lastname);
		
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys(Email);
		
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys(ComfirmPassword);
		
		driver.findElement(By.xpath("//input[@id=\"register-button\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"button\"][1]")).click();
		
		driver.close();
	}

}
