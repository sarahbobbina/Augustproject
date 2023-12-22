package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadauto {


	WebDriver driver;
	
	String baseurl="https://www.ilovepdf.com/word_to_pdf";
	@BeforeTest
	public void beforetest()
	{
	driver= new ChromeDriver();
	
	
	}
	
	@Test
	public void main() throws IOException,Exception
	{
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();	//button click	
		
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Dr Nebu P Mathew\\Downloads\\T1.exe");
		Thread.sleep(3000);
		
		
	}	
		
		
		
		
	
}
