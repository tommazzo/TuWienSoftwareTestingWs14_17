package at.ac.tuwien.inso.swtesten.sportsid;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AdminLoginStepDefinitions {
	
	private SportsIdSeleniumHelper sportsIdPage = new SportsIdSeleniumHelper();

	@Given("^I want to log in with the user gruppe(\\d+)a$")
	public void I_want_to_log_in_with_the_user_gruppe_a(int arg1) throws Throwable {
	    sportsIdPage.setUp();
	}

	@When("^I write gruppe(\\d+)a in the username field$")
	public void I_write_gruppe_a_in_the_username_field(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^When I write thomas(\\d+) in the password field$")
	public void When_I_write_thomas_in_the_password_field(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^When I click the Login button$")
	public void When_I_click_the_Login_button() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^the welcome page is shown$")
	public void the_welcome_page_is_shown() throws Throwable {
		// ToDo: Check if welcome page is acutally displayed.
	    sportsIdPage.shutDown();
	}
	
}
