package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {

	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@BeforeTest
	
	public void setup()
	{
		
		
		
		System.out.println("browser open");
	}
	
	
	@BeforeMethod
	public void urlload()
	{
	
		driver= new ChromeDriver();
		driver.get(baseurl);
		
		System.out.println("url load");
	
	
	}
	@Test(priority=1)//,invocationCount=3) execute 3 times//,enabled=false)skippingtest
	public void test1()
	{
		
		driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
			
		System.out.println("TEST1");
	
	
	}
	
	@Test(priority=0,dependsOnMethods= {"test1"})
	public void test2()
	{System.out.println("TEST2");
	
	
	}
	
	@AfterMethod
	public void aftmethod()
	
		{System.out.println("after method");
		
		
		}
		
		@AfterTest
		public void teardown()
		{
	
	
			System.out.println("browser close");
	
		}
	
}
