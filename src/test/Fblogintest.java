package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fblogipage;

public class Fblogintest {
	
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	}
	@Test
	public void testlogin()
	{
	
	Fblogipage ob= new Fblogipage(driver);
	ob.setvalues("sa@gmail.com","abcd");
	
	ob.login();
	
	
	
	}	
	
	
	
	
	
	
	
}
