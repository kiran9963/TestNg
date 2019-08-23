package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Simple {
	
		
	
	@Parameters({"username","password"})
 @Test
 private void test2(String s1,String s2) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-kk\\Airlines\\chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	

	WebElement from= driver.findElement(By.id("email"));
    from.sendKeys(s1);
    WebElement pass= driver.findElement(By.id("pass"));
    pass.sendKeys(s2);
    
	 
 }
 @Test(priority=161)
 private void test3() { 
}
 @Test(priority=131)
 private void test4() {
}
 @Test(priority=121)
 private void test5() {
	 System.out.println("kk");
 }

}

