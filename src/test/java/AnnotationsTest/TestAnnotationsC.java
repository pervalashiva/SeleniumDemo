package AnnotationsTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAnnotationsC {
	
	@Test
	void pqr()
	{
		System.out.println("This is pqr form test3");
	}
	
	@BeforeSuite
	void xyz()
	{
		System.out.println("This is beforesuit ");
	}
	@AfterSuite
	void search()
	{
		System.out.println("This is aftersuit method");
	
	}

}
