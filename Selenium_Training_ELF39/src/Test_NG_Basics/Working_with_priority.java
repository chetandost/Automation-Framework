package Test_NG_Basics;

import org.testng.annotations.Test;

public class Working_with_priority {
	
	
	/*@Test(priority=1)
	public void Register() {	
		System.out.println("register");
	}*/
	
	/*@Test(priority=2)
	public void Login() {
				System.out.println("login");
	}*/
	
	@Test(groups = "SmokeTest",priority=4)
	public void wishlist() {
		System.out.println("wishlist");
	}}
	
	/*@Test(priority=3)
	public void search() {
				System.out.println("search");
	}
	
	@Test(priority=5)
	public void logout() {
				System.out.println("logout");
	}

}*/


