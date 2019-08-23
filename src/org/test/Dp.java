package org.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp {
	
	@Test(dataProvider ="res1",dataProviderClass=Fb.class)
	private void test1(String s1,String s2) {
		System.out.println(s1);
		System.out.println(s2);
	}
	
	}

