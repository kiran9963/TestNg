package org.test;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Client {

	@BeforeClass
	public  static void beforeClass() {
		System.out.println("Before class");
	}
	@AfterClass
	public static  void afterClass() {
		System.out.println("afterclass");

	}
	@Before
	public void beforeMethod() {
		System.out.println("Beforemethod");
	}
	@After
	public void afterMethod() {
		System.out.println("afterMethod");

	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test 
	public void test2() {
		System.out.println("test2");
	}
}
