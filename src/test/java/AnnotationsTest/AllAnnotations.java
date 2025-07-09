package AnnotationsTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AllAnnotations {
	@BeforeTest
	void xyz()
	{
		System.out.println("This is xyz before test");
	}
	@AfterTest
	void search()
	{
		System.out.println("This is afterTest ");
	
	}
	
	@BeforeClass
	void openapp()
	{
		System.out.println("this is before class");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("this is after  class");
	
	}
	
	@BeforeSuite
	void xyz2()
	{
		System.out.println("This is before suit ");
	}
	@AfterSuite
	void search2()
	{
		System.out.println("This is aftersuit ");
	
	}	
	@BeforeTest
	void abc1()
	{
		System.out.println("This is before test");
	}
	@AfterTest
	void abc2()
	{
		System.out.println("This is after test");
	}
	

}
