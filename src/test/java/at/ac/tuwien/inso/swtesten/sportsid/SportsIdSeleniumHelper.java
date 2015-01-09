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
	
	public void login(String userName, String password){
		goToLoginPage();
		fillUsernameField(userName);
		fillPasswordField(password);
		clickLoginButton();
		welcomePageIsShown();
	}
	
	public void goToLoginPage(){
	    driver.get(baseUrl + "/#pages.login");
	}
	
	public void goToWelcomePage(){
		driver.get(baseUrl + "/admin.html#pages.welcome");
	}
	
	public void goToCreateNewMemberPage(){
		driver.get(baseUrl + "/admin.html#pages.member.detail");
	}
	
	public void goToMembersList(){
		driver.get(baseUrl + "admin.html#pages.member.list");
	}
	
	public void fillUsernameField(String userName){
	    driver.findElement(By.id("input-username")).clear();
	    driver.findElement(By.id("input-username")).sendKeys(userName);
	}
	
	public void fillPasswordField(String password){
		driver.findElement(By.id("input-password")).clear();
	    driver.findElement(By.id("input-password")).sendKeys(password);
	}
	
	public void clickLoginButton(){
		driver.findElement(By.id("login-button")).click();
	}
	
	public void welcomePageIsShown(){
		assertEquals(driver.findElement(By.cssSelector("#content-inner > div:nth-child(1) > h1:nth-child(1)")).getText(), "Welcome ADMIN A GRUPPE 27!");
	}
	
	// Registration
	public void shutDown() {
		SeleniumWebDriver.closeDriver();
	}
	
}
