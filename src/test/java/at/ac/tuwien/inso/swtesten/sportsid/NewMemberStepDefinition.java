package at.ac.tuwien.inso.swtesten.sportsid;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class NewMemberStepDefinition {
	
	private SportsIdSeleniumHelper sportsIdPage = new SportsIdSeleniumHelper();
	
	@Given("^I want to add new user$")
	public void I_want_to_add_new_user() throws Throwable {
	    sportsIdPage.setUp();
	   sportsIdPage.login("gruppe27b", "1234");
	}

	@When("^I write PERIC in the field Surname Nativ$")
	public void I_write_PERIC_in_the_field_Surname_Nativ() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    
	}

	@When("^When I write PERO in the field given Name Nativ$")
	public void When_I_write_PERO_in_the_field_given_Name_Nativ() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  
	}

	@When("^When I write (\\d+)-(\\d+)-(\\d+) in the field Birthday$")
	public void When_I_write_in_the_field_Birthday(int arg1, int arg2, int arg3) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	
	}

	@When("^When I write Australia \\[AUS\\] in the field Nationality$")
	public void When_I_write_Australia_AUS_in_the_field_Nationality() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  
	}

	@When("^When I select male for Gender$")
	public void When_I_select_male_for_Gender() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	
	}

	@When("^When I write PERIC in the field Int Surname$")
	public void When_I_write_PERIC_in_the_field_Int_Surname() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^When I write PERO in the field Int Name given$")
	public void When_I_write_PERO_in_the_field_Int_Name_given() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^When I select ACTIVE for Status$")
	public void When_I_select_ACTIVE_for_Status() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^When I click on the Save button$")
	public void When_I_click_on_the_Save_button() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^the new member is added$")
	public void the_new_member_is_added() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}



}
