package Test_NG_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alphabetical_order {
	
	@BeforeSuite
	
	public void beforesuite() {
		
		System.out.println("before Suite");
	}
	
	@BeforeTest
	
	public void beforetest() {
		
		System.out.println("beforetest");
	}
	
	@BeforeClass
	
	public void beforeclass() {
		
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	
	public void beforemethod() {
		
		System.out.println("beforemethod");
	}

	@Test
	
	public void medicalshop(){
		
		System.out.println("welcome to medicalshop");	
	}
	
	@Test
	
	public void vegetableshop() {
		
		System.out.println("welcome to vegetable shop");
		
	}
	
	@org.testng.annotations.AfterMethod
	
	public void AfterMethod() {
		
		System.out.println("aftermethod");
	}
	
	@AfterClass
	
	public void afterclass() {
		
		System.out.println("afterclass");
	}
	
	@AfterTest
	
	public void aftertest() {
		
		System.out.println("aftertest");
	}
	
	@AfterSuite
	
	public void aftersuite() {
		
		System.out.println("Aftersuite");
	}
	
	
	}
	
	


