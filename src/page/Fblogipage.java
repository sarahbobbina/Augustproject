package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogipage {
WebDriver driver;

	
//	By  fbemail=By.id("email");
	
	
	//By  fbpassword=By.id("pass");
//	By  fblogin =By.name("login");
	
	
	//public Fblogipage(WebDriver driver)
//	{

//this.driver= driver;
//	}
	//public void setvalues(String email, String password) {
		
	//	driver.findElement(fbemail).sendKeys(email);
	
	//	driver.findElement(fbpassword).sendKeys(password);
		
	//}


	//public void login() {
		
	//	driver.findElement(fblogin).click();
		
		
//	}

@FindBy(name="login")
	WebElement loginbutton;
	
	@FindBy(name="email")
	WebElement emailid;
	
	@FindBy(name="pass")
	WebElement pswd;
	
	
	public Fblogipage(WebDriver driver)
	{

this.driver= driver;
PageFactory.initElements(driver, this);
	}
	public void setvalues(String email, String password) {
		
		emailid.sendKeys(email);
	
		pswd.sendKeys(password);
		
	}


	public void login() {
		
		loginbutton.click();
		
		
	}
	
}
	


	
	
	
	
	
	
	
	
	
	
	
	
	

