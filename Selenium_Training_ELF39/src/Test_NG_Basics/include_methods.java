package Test_NG_Basics;

import org.testng.annotations.Test;

public class include_methods {
	
	
	@Test()
	public void Register() {	
		System.out.println("register");
	}
	
	@Test()
	public void Login() {
				System.out.println("login");
	}
	
	@Test()
	public void wishlist() {
		System.out.println("wishlist");
	}
	
	@Test()
	public void search() {
				System.out.println("search");
	}
	
	@Test()
	public void logout() {
				System.out.println("logout");
	}

}


