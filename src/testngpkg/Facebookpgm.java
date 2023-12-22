package testngpkg;

import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Facebookpgm {

	ChromeDriver driver;
	
	String baseurl="https://www.facebook.com";
	@BeforeTest
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	
	
	
	@Parameters({"email","pswd"})
	@Test
	public void fbtest(String email,String pswd)
	{
	
	driver.findElement(By.name("email")).sendKeys(email);
	driver.findElement(By.name("pass")).sendKeys(pswd);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	
	
	
	
}
