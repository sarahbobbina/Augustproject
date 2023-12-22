package testngpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screeenshotpgm {
	
ChromeDriver driver;
	
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	public void test()throws IOException
	{
	
		//to take page screenshot
	File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		FileHandler.copy(screenshot, new File("E://guru99.png"));
		
		
		//to take webelememt screenshot
		WebElement ownerbutton=driver.findElement(By.xpath("//*[@id=\"credit3\"]/a")); 
		
		
		File buttonscreenshot=ownerbutton.getScreenshotAs(OutputType.FILE);
	FileHandler.copy( buttonscreenshot,new File("./Screenshot/buttonscreenshot.png"));
		
		
		
	}
		
}
