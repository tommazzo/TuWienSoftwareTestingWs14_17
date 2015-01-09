package at.ac.tuwien.inso.swtesten.sportsid;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import at.ac.tuwien.inso.swtesten.util.SeleniumWebDriver;

public class SportsIdSeleniumHelper {

	public WebDriver driver;
	public String baseUrl;

	public void setUp() {
		driver = SeleniumWebDriver.getDriver();
		baseUrl = "https://sportsid.risedev.at";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void shutDown() {
		SeleniumWebDriver.closeDriver();
	}
	
}
