package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {

	
	
	
ChromeDriver driver;
	
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	public void dragdroptest()
	{
		
		
		WebElement debitamount =driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement damount=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/h3"));
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement daccount=driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/h3"));
		Actions act=new Actions(driver);
		act.dragAndDrop(debitamount,damount).perform();
		act.dragAndDrop(bank,daccount).perform();
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		
		
		
		WebElement camount=driver.findElement(By.xpath("//*[@id=\"shoppingCart4\"]/h3"));
		
		
		
		
		WebElement caccount=driver.findElement(By.xpath("//*[@id=\"shoppingCart3\"]/h3"));
		
	
		act.dragAndDrop(sales,caccount).perform();
		act.dragAndDrop(debitamount,camount).perform();

	
	
		boolean perfect=driver.findElement(By.xpath("//*[@id=\"equal\"]")).isEnabled();
		if(perfect)
		{System.out.println("selected");
		}
		else
		{System.out.println("selected");
		}
	
	
	
	
	
	}
	
	
	
	
	
}
