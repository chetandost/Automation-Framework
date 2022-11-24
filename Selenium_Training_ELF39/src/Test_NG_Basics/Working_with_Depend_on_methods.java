package Test_NG_Basics;



import org.testng.annotations.Test;

public class Working_with_Depend_on_methods {
	
	@Test
	public void Register() {	
		System.out.println("register");
	}
	
	@Test(dependsOnMethods = "Register")
	public void Login() {
				System.out.println("login");
	}
	
	@Test(dependsOnMethods = "search")
	public void wishlist() {
		System.out.println("wishlist");
	}
	
	@Test(dependsOnMethods = "Login")
	public void search() {
				System.out.println("search");
	}
	
	@Test(dependsOnMethods = "wishlist")
	public void logout() {
				System.out.println("logout");
	}

}
