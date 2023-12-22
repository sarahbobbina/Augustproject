package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonmultiplewindowpgm {

ChromeDriver driver;
	
	String baseurl="https://www.amazon.com";
	@BeforeTest
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	
	public void test()
	{
	
	driver.get("https://www.amazon.com");

	
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobilephones");
	
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	
			
			String parentwindow =driver.getWindowHandle();
			System.out.println("parent window title"+driver.getTitle());
			
			

			String exptitle="Amazon.in:mobilephone";
			
			
			if(parentwindow.equalsIgnoreCase(exptitle))
			
			{
				
				System.out.println("pass");
			}
			else
			{		System.out.println("fail");
			
				
				
				
				
				
			}
			
			
			
			
			
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
			
			
			Set<String>allwindowhandles= driver.getWindowHandles();
			
			
			for(String handle:allwindowhandles) {
				if(!handle.equalsIgnoreCase(parentwindow))
				{
					
					
					driver.switchTo().window(handle);
					
					driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
					
					driver.close();
					
					
				}
	
	
	
	
	
	
			}
	
	
	
	
	
}
}