package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm {	
	
	
	

	ChromeDriver driver;
	
	String baseurl="https://www.google.com";
	@Before
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	public void googletest()
	{
	
	driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
	
	//driver.findElement(By.id("btnk")).click();
	
	//WebElement .searchbutton=driver.findElement(By.name("q");//with out using sendkeys
	//searchbutton.sendKeys("Books");
	//serchbutton.submit();
	}
}
