package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {

	
	
	
	


	ChromeDriver driver;
	
	String baseurl="https://demo.guru99.com/test/upload/";
	@BeforeTest
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	
	@Test
	public void uploadtest()
	{
		
		
		
	
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\\\Users\\\\Dr Nebu P Mathew\\\\Desktop\\\\sarah test scenarios.docx");
	
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	
	
	
driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
