package AnnotationsTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationsA {

	@Test
	void abc()
	{
		System.out.println("This is abc from abc");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("This is Before test method");
	
	}
	
}
