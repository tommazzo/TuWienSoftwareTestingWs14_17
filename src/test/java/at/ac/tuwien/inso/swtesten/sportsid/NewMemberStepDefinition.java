package at.ac.tuwien.inso.swtesten.sportsid;

import static org.junit.Assert.assertEquals;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class NewMemberStepDefinition {
	
	private SportsIdSeleniumHelper sportsIdPage = new SportsIdSeleniumHelper();
	private WebDriver driver = null;
	
	@Given("^I want to add new user$")
	public void I_want_to_add_new_user() throws Throwable {
	    sportsIdPage.setUp();
	   sportsIdPage.login("gruppe27a", "thomas1234");
	   
	   driver = sportsIdPage.driver;
	   
	   sportsIdPage.goToCreateNewMemberPage();
	}

	@When("^I write PERIC in the field Surname Nativ$")
	public void I_write_PERIC_in_the_field_Surname_Nativ() throws Throwable {
	    driver.findElement(By.id("member-family-name-native")).sendKeys("PERIC");
	    driver.findElement(By.id("member-first-name-native")).clear();
	}

	@When("^When I write PERO in the field given Name Nativ$")
	public void When_I_write_PERO_in_the_field_given_Name_Nativ() throws Throwable {
	    driver.findElement(By.id("member-first-name-native")).sendKeys("PERO");
	}

	@When("^When I write (\\d+)-(\\d+)-(\\d+) in the field Birthday$")
	public void When_I_write_in_the_field_Birthday(int arg1, int arg2, int arg3) throws Throwable {
	    driver.findElement(By.cssSelector("button.ui-datepicker-trigger")).click();
	    driver.findElement(By.linkText("21")).click();
	}

	@When("^When I write Bosnia Herzegovina \\[BIH\\] in the field Nationality$")
	public void When_I_write_Australia_AUS_in_the_field_Nationality() throws Throwable {
	    driver.findElement(By.id("member-nationality")).clear();
	    driver.findElement(By.id("member-nationality")).sendKeys("Bosnia & Herzegovina [BIH]");
	}

	@When("^When I select male for Gender$")
	public void When_I_select_male_for_Gender() throws Throwable {
	    driver.findElement(By.id("member-gender-m")).click();
	}

	@When("^When I write PERIC in the field Int Surname$")
	public void When_I_write_PERIC_in_the_field_Int_Surname() throws Throwable {
	    driver.findElement(By.id("member-first-name")).click();
	    driver.findElement(By.id("member-family-name")).clear();
	    driver.findElement(By.id("member-family-name")).sendKeys("PERIC");
	}

	@When("^When I write PERO in the field Int Name given$")
	public void When_I_write_PERO_in_the_field_Int_Name_given() throws Throwable {
	    driver.findElement(By.id("member-family-name-native")).click();
	    driver.findElement(By.id("member-first-name")).clear();
	    driver.findElement(By.id("member-first-name")).sendKeys("PERO");
	}

	@When("^When I select ACTIVE for Status$")
	public void When_I_select_ACTIVE_for_Status() throws Throwable {

	}

	@When("^When I click on the Save button$")
	public void When_I_click_on_the_Save_button() throws Throwable {
	    driver.findElement(By.cssSelector("#new-member > span.ui-button-text > span.button-content")).click();
	    driver.findElement(By.cssSelector("span.button-content")).click();
	}

	@Then("^the new member is added$")
	public void the_new_member_is_added() throws Throwable {
		junit.framework.Assert.assertTrue(driver.findElement(By.cssSelector("#content-inner > div:nth-child(1) > h1:nth-child(1)")).getText().startsWith("Member: PERIC PERO"));
	}
}
