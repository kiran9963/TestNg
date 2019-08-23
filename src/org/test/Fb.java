package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fb {
	@Test(dataProvider="res1")
	private void test1(String s1,String s2) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-kk\\Airlines\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			

			WebElement from= driver.findElement(By.id("email"));
		    from.sendKeys(s1);
		    WebElement pass= driver.findElement(By.id("pass"));
		    pass.sendKeys(s2);
		    //driver.quit();
	
	}
	@Test(dataProvider="res2")
	private void test2(String s1,String s2) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-kk\\Airlines\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			

			WebElement from= driver.findElement(By.id("email"));
		    from.sendKeys(s1);
		    WebElement pass= driver.findElement(By.id("pass"));
		    pass.sendKeys(s2);
	}
	@DataProvider(name="res1",parallel=true)
	public Object[][] date(){
		//Object[][] obj=new Object[3][2];
		return new Object[][] {{"10","java"},{"20","sel"}};
}
	@DataProvider(name="res2")
	public Object[][] date1(){
		//Object[][] obj1=new Object[3][2];
		return new Object[][] {{"100","javaaa"},{"200","selenium"}};
}

}
