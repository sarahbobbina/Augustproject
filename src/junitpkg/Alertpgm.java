package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	
	ChromeDriver driver;
	
	String baseurl="file:///C:/Users/Dr%20Nebu%20P%20Mathew/Desktop/alert1.html";
	@Before
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	
	
	
	@Test
	public void alerttest()
	{
		
		
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		
		Alert a=driver.switchTo().alert();
		
		
		String alerttext=a.getText();
		if(alerttext.equals("Hello!Iam an alert box!!"))
			
		{System.out.println("pass");
		
		}
		else
		{System.out.println("fail");
			
		}
		
		a.accept();
		//a.dismiss();//to cancel alert
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("efg");
		
		
		
	}}
