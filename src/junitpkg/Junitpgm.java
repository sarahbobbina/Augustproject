package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpgm {
	ChromeDriver driver1;
	String baseurl2="https://www.google.com";

	@Before
	public void setUp()
	
	{driver1 =new ChromeDriver();
	driver1.get(baseurl2);
	driver1.getPageSource();
	
	}
	@Test
	
	public void  test1()
	{
	ChromeDriver driver1=new ChromeDriver();
	driver1.get(baseurl2);
	String src1=driver1.getPageSource();
	if(src1.contains("Gmail"))

	{		System.out.println("text is present");
	
	
	
	}
	else
	{		System.out.println("text isnot present");
	
	
	
	}
	}
	
	
	
	
	
	
	
	@After
	public void tearDown()
	{driver1.quit();
	
	}

	
	
	

}
