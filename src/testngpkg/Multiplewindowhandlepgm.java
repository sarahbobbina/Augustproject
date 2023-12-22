package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindowhandlepgm {

ChromeDriver driver;
	
	String baseurl="https://demo.guru99.com/popup.php";
	@BeforeTest
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	
	public void test()
	{
	
	driver.get("https://demo.guru99.com/popup.php");
	
	
	String parentwindow =driver.getWindowHandle();//current window
	System.out.println("parent window title"+driver.getTitle());
	
	driver.findElement(By.xpath("/html/body/p/a")).click();
	Set<String>allwindowhandles= driver.getWindowHandles();
	
	
	for(String handle:allwindowhandles) {
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			
			
			driver.switchTo().window(handle);
			//String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("sarah@gmail.com");
			
			driver.close();
			
			
		}
		
		
		driver.switchTo().window(parentwindow);
		
		
		
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
