package Ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.NAME, using="userName")
	@CacheLookup
	WebElement username;
	
	@FindBy(how=How.NAME, using="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.NAME, using="submit")
	@CacheLookup
	WebElement login;
	
	public void loginpage(String use, String pass) {
		try {
			username.sendKeys(use);
			Thread.sleep(4000);
			password.sendKeys(pass);
			Thread.sleep(4000);
			login.click();
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
