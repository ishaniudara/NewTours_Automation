package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Ui.FlightFinder;
import Ui.Login;
public class Testclass extends Helper{
	
	public Testclass()
{
}
	@Test
	public void returnTicket() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
//		driver.get("//http://demo.guru99.com/test/newtours/reservation.php");
//		Login login=PageFactory.initElements(driver, Login.class);
//		login.loginpage("mercury","mercury");
		FlightFinder flightFinder=PageFactory.initElements(driver, FlightFinder.class);
		flightFinder.continueWordPress("1", "Zurich", "July", "12", "Frankfurt", "september", "15", "business class");
		
		
	}
	
}