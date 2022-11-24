package selenium_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class numberoflinksin_demowebshop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement>link=driver.findElements(By.xpath("//a"));
		
		int j=0;
		
		for(int i=0;i<link.size();i++) {
			
			j=i;
		}

		System.out.println("total link:" +j);
		
		for(int i=0;i<link.size();i++) {
			
			System.out.println(link.get(i).getText());
		}
		
		printing only links without spaces
		
		/*for(int i=0;i<link.size();i++) {
			
			String s=link.get(i).getText();
			
			if(s.equalsIgnoreCase("")) {
				
				continue;
			}
			else {
				
				System.out.println(s);/*
			}
		}
	}

}
