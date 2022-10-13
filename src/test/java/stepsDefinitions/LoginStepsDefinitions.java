package stepsDefinitions;



import io.cucumber.java.en.*;
import pageObjects.LandingPage;
import testBase.TestBase;


public class LoginStepsDefinitions extends TestBase{
	
	
	LandingPage landingpage = new LandingPage();
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws Throwable {
	
		TestBase.LuanchBrowser();
	}
	
		
	@When("User enters username")
	public void user_enters_username() throws Throwable {
		landingpage.NavigateToResource();
	}
	@When("User enters password")
	public void user_enters_password() {
	  
	}
	@When("Click on Login button")
	public void click_on_login_button() {
	    
	}
	@Then("User should be loggedin")
	public void user_should_be_loggedin() {
	   
	}

}
