package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groupingpgm {

	
	
	@BeforeTest
	
	public void setup()
	{
		
		
		
		System.out.println("browser open");
	}
	
	
	@BeforeMethod
	public void urlload()
	{
	
		
		
		System.out.println("url load");
	
	
	}
	@Test(groups="sanity")
	public void test1()
	{
		
		
			
		System.out.println("TEST1");
	
	
	}

	@Test(groups= "smoke")
	public void test2()
	
	{System.out.println("TEST2");
	
	
	}
	@Test(groups= {"smoke","sanity"})
	
	public void test3()
	{System.out.println("TEST3");
	
	
	}
	@Test(groups= {"smoke","regression"})
	public void test4()
	{System.out.println("TEST4");
	
	
	}
	

	@Test(groups="regression")
	public void test5()
	{System.out.println("TEST5");
	
	
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
	
	
	
	
	
	
	

