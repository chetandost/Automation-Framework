package Test_NG_Basics;

import org.testng.annotations.Test;

public class Working_with_groups {

	
	@Test(groups = "SmokeTest",priority=1)
	public void Register() {	
		System.out.println("register");
	}
	
	@Test(groups = "SmokeTest",priority=2)
	public void Login() {
	System.out.println("login");
	}
	
	@Test(groups = "SmokeTest",priority=3)
	public void search() {
	System.out.println("search");
	}
	
	@Test()
	public void logout() {
	System.out.println("logout");
	}

}

