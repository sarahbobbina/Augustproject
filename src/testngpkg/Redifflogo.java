package testngpkg;

import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Redifflogo {

	ChromeDriver driver;
	
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@BeforeTest
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	public void logotest()
	{
		boolean logo=driver.findElement(By.xpath("//*[@title='Rediff.com']")).isEnabled();
		if(logo)
		{System.out.println("selected");
		}
		else
		{System.out.println("selected");
		}
	}
}
