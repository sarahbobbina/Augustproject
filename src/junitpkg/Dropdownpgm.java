package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpgm {

	
	
	ChromeDriver driver;
	
	String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	@Before
	public void setUP()
	{
	driver= new ChromeDriver();
	driver.get(baseurl);
	
	}
	@Test
	public void dropdowntest()
	
	
	{
	
	
	WebElement dayelement=driver.findElement(By.xpath("//*[@id ='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
	
	
	Select day= new Select(dayelement);
	day.selectByValue("02");
	
	WebElement monthelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
	Select month= new Select(monthelement);
	
	
	month.selectByValue("12");
	
	
	
	
	WebElement yearelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
	Select year= new Select(yearelement);
	
	
	year.selectByValue("2023");
	

	
	
	
	
	
	
	
	
	
	
}}
