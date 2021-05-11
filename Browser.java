package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser{
	public static WebDriver driver;
	public Browser() {
		
	}
	public static WebDriver getDriver() {
		if(driver==null) {
			ChromeOptions options= new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			
		}
		return driver;
	}
		public static WebDriver getDriver(String browsername) {
			if(driver==null)
			{
				if(browsername.equalsIgnoreCase("firefox"))
				{
//					System.setProperty("kkc");
					driver= new FirefoxDriver();
					driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
					driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
					
					
				}
		}
			return driver;}
	
}