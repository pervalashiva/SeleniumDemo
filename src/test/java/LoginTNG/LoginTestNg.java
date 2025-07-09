package LoginTNG;

import org.testng.annotations.Test;

//open application
//login
//logout


public class LoginTestNg {
	
	@Test(priority=1)
	void openapp()
	{
		System.out.println("Open application");
	}
	@Test(priority=2)
	void login()
	{
		System.out.println("login to appliation");
	
	}
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout application");
	
	}
}
