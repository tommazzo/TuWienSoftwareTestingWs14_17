package at.ac.tuwien.inso.swtesten.sportsid;

import javax.swing.Box.Filler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.jna.platform.win32.WinNT.WELL_KNOWN_SID_TYPE;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;


public class AdminLoginStepDefinitions {
	
	private SportsIdSeleniumHelper sportsIdPage = new SportsIdSeleniumHelper();

	@Given("^I want to log in with the user gruppe(\\d+)a$")
	public void I_want_to_log_in_with_the_user_gruppe_a(int arg1) throws Throwable {
	    sportsIdPage.setUp();
	   sportsIdPage.goToLoginPage();
	}

	@When("^I write gruppe(\\d+)a in the username field$")
	public void I_write_gruppe_a_in_the_username_field(int arg1) throws Throwable {
		sportsIdPage.fillUsernameField("gruppe27a");
	}

	@When("^When I write thomas(\\d+) in the password field$")
	public void When_I_write_thomas_in_the_password_field(int arg1) throws Throwable {
		sportsIdPage.fillPasswordField("thomas1234");
	}

	@When("^When I click the Login button$")
	public void When_I_click_the_Login_button() throws Throwable {
		sportsIdPage.clickLoginButton();
	}

	@Then("^the welcome page is shown$")
	public void the_welcome_page_is_shown() throws Throwable {
		sportsIdPage.welcomePageIsShown();
	    sportsIdPage.shutDown();
	}
	
}
