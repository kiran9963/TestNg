package org.test;

import org.testng.annotations.Test;

public class Employee {
	@Test(priority=12)
	private void test1() {
		System.out.println(Thread.currentThread().getId());
		
	}
 @Test(priority=5)
 private void test2() {
	 System.out.println(Thread.currentThread().getId());
	 
 }
 @Test(priority=-1)
 private void test3() {
	 System.out.println(Thread.currentThread().getId());
	 
}
 @Test(priority=3)
 private void test4() {
	 System.out.println(Thread.currentThread().getId());
}
 @Test(priority=2)
 private void test5() {
	 System.out.println(Thread.currentThread().getId());
 }

}