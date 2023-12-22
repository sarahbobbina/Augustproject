package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonselection {

	ChromeDriver driver;
	
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	public void radiobuttontest()
	{
		boolean radio=driver.findElement(By.xpath("//*[@id ='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(radio)
		{System.out.println("selected");
		}
		else
		{System.out.println("selected");
		}
	}
}
