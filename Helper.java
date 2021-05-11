package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import framework.Browser;

public class Helper{
	public static WebDriver driver;
	Browser obj;
	public Helper() {
		
		
	}
	@BeforeSuite
	public void beforesuite() {
		
	}
	@BeforeClass
	public void beforeclas() {
		System.out.println("jdjjd");
	
	}
	@BeforeMethod
	public void beforemethod() {
		Helper.driver=Browser.getDriver();
		
		
	}
	
}