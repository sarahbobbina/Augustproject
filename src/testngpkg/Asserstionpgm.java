package testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
public class Asserstionpgm {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
	 driver=new ChromeDriver();//to launch browser	
	
	driver.get("https://www.google.com");
	}

	@Test
	public void test()
	{
	
	String exptitle="google";
	String actualtitle=driver.getTitle();
	System.out.println("title="+actualtitle);
	
	Assert.assertEquals(actualtitle, exptitle);	
	
	
	System.out.println("title verified");
	
	}
}
