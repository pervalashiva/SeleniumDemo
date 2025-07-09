package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//open application
//login
//logout


public class classAnnotations {
	
	@BeforeClass
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
	
	@AfterClass
	void logout()
	{
		System.out.println("logout application");
	
	}
}
