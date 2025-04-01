package StepDefination;

import PageClass.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination
{
LoginPage lp = new LoginPage();
	
	@Given("I am the user of an application")
	public void i_am_the_user_of_an_application() {
	   lp.OpenUrl();
	}

	@When(": User enter invalid username")
	public void user_enter_invalid_username() {
	    lp.enterUserName();
	}

	@When(": User enter invalid password")
	public void user_enter_invalid_password() {
	   lp.enterPassword();
	}

	@When(": User click on login button")
	public void user_click_on_login_button() {
	    lp.clickLoginButton();
	}

	@Then(": User should not be able to login successfully")
	public void user_should_not_be_able_to_login_successfully() {
	   lp.verifyLogin();
	}

}
