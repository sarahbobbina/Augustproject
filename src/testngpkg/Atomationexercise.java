package testngpkg;

import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Atomationexercise {
	


	ChromeDriver driver;
	
	String baseurl="https://automationexercise.com/";
	@BeforeTest
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@BeforeMethod
	public void bmethod()
	{driver= new ChromeDriver();
     driver.get(baseurl);
	}
	@Test//(enabled=false)
	public void automationtest()
	{
		WebElement signup =driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(signup).click().perform();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("sarah");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("sarahbobbina@gmail.com");
	
	
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	
	
	
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sarah123");
	
WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"days\"]"));
	

	Select day= new Select(dayelement);
	day.selectByValue("12");
	
WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"months\"]"));
Select month= new Select(monthelement);
	

month.selectByVisibleText("March");
	
	
	
	
	WebElement yearelement=driver.findElement(By.xpath("//*[@id=\"years\"]"));
	Select year= new Select(yearelement);
	
	
	year.selectByValue("1985");
	
	
	
	
	driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("sarah");
	
	driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("bobbina");
	driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("thadathel");	
	driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kerala");
	
	driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("thiruvalla");
	driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("689658");
	
	driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9947089422");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
	}
	
	@Test
	public void test1()
	{WebElement signup =driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
	Actions act=new Actions(driver);
	act.moveToElement(signup).click().perform();
	
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("sarahbobbina@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("sarah123");
		
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		
		
	
}}
