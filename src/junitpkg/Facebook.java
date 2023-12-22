package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	
	ChromeDriver driver;
	
	String baseurl="https://www.facebook.com";
	@Before
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	public void fbtest()
	{
	
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	
	driver.findElement(By.id("pass")).sendKeys("123abd");
	driver.findElement(By.name("login")).click();
	
	
	}
	
	
	

}
