package AnnotationsTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testAnnotationsB {
	@Test
	void xyz()
	{
		System.out.println("This is xyz form TAB");
	}
	@AfterTest
	void search()
	{
		System.out.println("This is afterTest method");
	
	}
	

}
