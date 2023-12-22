package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demopgm {

	
	
ChromeDriver driver;
	
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	@BeforeTest
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	public void demotest()
	{

		
		
		
		
		
		
		
		
		
		

		
		Actions act=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(right).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		driver.switchTo().alert().accept();
		
		
		
		//*[@id="authentication"]/ul/li[1]/span
		
		WebElement doubleclickbutton=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclickbutton).perform();
		
		
		
		//*[@id="authentication"]/button
	
		
	Alert a1=driver.switchTo().alert();
		
		String alert=a1.getText();
		System.out.println(alert);
		a1.accept();
	}
		
	}

		
		
//*[@id="authentication"]/button
		
		
	