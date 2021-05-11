package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Ui.Login;
public class Testclass extends Helper{
	
	public Testclass()
{
}
	@Test
	public void returnTicket() {
		driver.get("http://demo.guru99.com/test/newtours/");
		Login login=PageFactory.initElements(driver, Login.class);
		login.loginpage("mercury","mercury");
		
	}
}