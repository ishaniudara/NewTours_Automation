package Ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlightFinder{
WebDriver driver;

public FlightFinder(WebDriver driver) {
	this.driver=driver;
}

@FindBy(how=How.NAME, using="tripType")
@CacheLookup
WebElement roundTrip;

@FindBy(how=How.NAME, using="passCount")
@CacheLookup
WebElement passCount;

@FindBy(how=How.NAME, using="fromPort")
@CacheLookup
WebElement fromPort;

@FindBy(how=How.NAME, using="fromMonth")
@CacheLookup
WebElement fromMonth;

@FindBy(how=How.NAME, using="fromDay")
@CacheLookup
WebElement fromDay;

@FindBy(how=How.NAME, using="toPort")
@CacheLookup
WebElement toPort;

@FindBy(how=How.NAME, using="toMonth")
@CacheLookup
WebElement toMonth;

@FindBy(how=How.NAME, using="toDay")
@CacheLookup
WebElement toDay;

@FindBy(how=How.XPATH, using=".//*[@value='coach']")
@CacheLookup
WebElement coach;


public void continueWordPress(String pcount, String fPort, String fMonth, String fDay, String tPort, String tMonth, String Tday, String servClass) throws InterruptedException
{try{passCount.sendKeys(pcount);
Thread.sleep(3000);
fromPort.sendKeys(fPort);
Thread.sleep(4000);
fromMonth.sendKeys(fMonth);
Thread.sleep(4000);
fromDay.sendKeys(fDay);
Thread.sleep(4000);
toPort.sendKeys(tPort);
Thread.sleep(4000);
toMonth.sendKeys(tMonth);
Thread.sleep(4000);
toDay.sendKeys(Tday);
Thread.sleep(4000);
coach.sendKeys(servClass);





}
catch(InterruptedException e) {
	e.printStackTrace();
	
}
	
}
}