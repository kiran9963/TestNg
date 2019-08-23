package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAutomation {
	@Test(dataProvider="a")
	public void test1(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-kk\\Airlines\\chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(s1);
		    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(s2);
		    driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(s3);
		    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(s4);
		    driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(s5);
		    driver.findElement(By.xpath("//input[@value='Male']")).click();
		    driver.findElement(By.xpath("//input[@value='Movies']")).click();
		    WebElement skill=driver.findElement(By.xpath("//select[@id='Skills']"));
		    Select k=new Select(skill);
		    k.selectByIndex(9);
		    WebElement country=driver.findElement(By.xpath("//select[@ng-model='country']"));
		    Select c=new Select(country);
		    c.selectByVisibleText(s6);
		    driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(s7,Keys.ENTER);
		    WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		    Select c1=new Select(year);
		    c1.selectByValue(s8);
		    WebElement mon = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		    Select c2=new Select(mon);
		    c2.selectByValue(s9);
		    WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
		    Select c3=new Select(day);
		    c3.selectByValue(s10);
		    
		    driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(s11);
		    driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(s12);    
		  
	
	}
	
		
	@DataProvider(name="a")
	public Object[][] date(){
		//Object[][] obj=new Object[3][2];
		return new Object[][] {{"kranti","kiran","2-20, vijayavada","kiran@gmail.com","8608578638","India","Hong Kong","1993","July","21","2222","2222"},{"greens","teck","omr, "
				+ "chennai","kiran@gmail.com","9963966653","Algeria","New Zealand","1996","October","19","11111","11111"}};
}
	@DataProvider(name="a1")
	public Object[][] date1(){
		//Object[][] obj=new Object[3][2];
		return new Object[][] {{"kk","kiran","2-21, Chennai","kranti@gmail.com","23165468","America","Bangladesh","1994","June","20","555","555"},{"Tecnology","green","Thoripakkam, "
				+ "chennai","narasimha@gmail.com","9963966653","America","Japan","1996","August","1","1001","1001"}};
}
		
}



