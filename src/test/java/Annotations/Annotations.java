package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	void openapp()
	{
		System.out.println("Open application");
	}
	@Test
	void search()
	{
		System.out.println("This is search");
	
	}
	@Test
	void advancedsearch()
	{
		System.out.println("This is advanced search");
	
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("logout application");
	
	}
}
	
