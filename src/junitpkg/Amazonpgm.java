package junitpkg;

import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
public class Amazonpgm {

	

	ChromeDriver driver;
	
	String baseurl="https://www.amazon.in";
	@Before
	public void setUP()throws InterruptedException
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	Thread.sleep(100000);
	driver.manage().window().maximize();
	
	}
	@Test
	public void amazontest()
	{
	
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).sendKeys("phones");
	
	driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
	driver.navigate().back();

	driver.findElement(By.xpath("//*[@	id='nav-cart-text-container']")).click();
		
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
}
