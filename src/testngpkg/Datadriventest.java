package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {

WebDriver driver;
	
	String baseurl="https://www.facebook.com";
	@BeforeTest
	public void setUP()
	{
	driver= new ChromeDriver();
	
	
	}
	@Test
	
	public void test() throws Exception
	{
	FileInputStream f= new FileInputStream("C:\\Users\\Dr Nebu P Mathew\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh= wb.getSheet("sheet1");
	int count =sh.getLastRowNum();
	for(int i=1;i<=count;i++)
	{String un= sh.getRow(i).getCell(0).getStringCellValue();
	
	String ps = sh.getRow(i).getCell(1).getStringCellValue();
	
	System.out.println("username="+un);
	System.out.println("password="+ps);
	
	driver.get("https://www.facebook.com");
	

	driver.findElement(By.name("email")).sendKeys(un);
	driver.findElement(By.name("pass")).sendKeys(ps);
	driver.findElement(By.name("login")).click();
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
