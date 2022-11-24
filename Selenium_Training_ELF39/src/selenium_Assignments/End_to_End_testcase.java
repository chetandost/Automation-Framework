package selenium_Assignments;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class End_to_End_testcase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");                  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
	
		 driver.findElement(By.cssSelector("input[value='radio1']")).click(); // radio-button
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind"); // auto-suggestion
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//li[@class='ui-menu-item'])[2]/div[text()='India']")).click();
	    
	    WebElement drop_down=driver.findElement(By.id("dropdown-class-example"));// drop-down using select method
	    Select sel=new Select( drop_down);
	    sel.selectByVisibleText("Option2");
	    
	    List<WebElement> all_option=driver.findElements(By.xpath("//input[@type='checkbox']/../input"));//find elements
	    for(int i=0;i<= all_option.size()-1;i++) {
	    	all_option.get(i).click();
	    }
	   
		
		String parent_window =driver.getWindowHandle();    // multiple windows
		System.out.println(parent_window);
		
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> total_window=driver.getWindowHandles();
		System.out.println(total_window);

		
		for(String child_window:total_window) {
			
			driver.switchTo().window(child_window);
			System.out.println(driver.getTitle());
		
		if(driver.getTitle().equalsIgnoreCase("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy")) {
			Thread.sleep(1000);
			driver.close();
		}	
		}
		driver.switchTo().window(parent_window);
		 Thread.sleep(1000);  
		 driver.findElement(By.name("enter-name")).sendKeys("chetan");
		driver.findElement(By.id("alertbtn")).click();
		
		Alert ale =driver.switchTo().alert();
		Thread.sleep(3000);
		ale.accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		ale.accept();
		
		 //Dependent x-path
		driver.findElement(By.xpath("(//td[text()='30'])[2]/../td[3]")).click();
	

		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click(); // to hide 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();  // to show
		
		
	  WebElement mouse=	driver.findElement(By.id("mousehover"));
	  
	  Actions action =new Actions(driver);
	  action.moveToElement(mouse).build().perform();
	//  action.moveToElement( driver.findElement(By.xpath("//a[text()='Top']"))).click().perform();
	  action.moveToElement( driver.findElement(By.xpath("//a[text()='Reload']"))).click().perform();
	  
	  //I-FRAMES
	//  Actions action =new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		action.sendKeys(Keys.PAGE_DOWN).perform();
	  driver.switchTo().frame(0);   // inspect and type // iframe
	  driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
	 
	 }

}

	

	


