package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.test.testcases.BaseClass;
import org.test.testcases.Login_cases;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Execution extends BaseClass {
	
			public Login_Execution() {
				driver = Hooks.driver;
				
			}
			
	@Given("Launch the url {string}")
	public void launch_the_url(String url) {
	    driver.get(url);
	   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Enter user credential {string} , {string}")
	public void enter_user_credential(String username, String password) {
		Login_cases login_tc = new Login_cases();
		login_tc.credentials(username,password);
	}

	@When("Login into application")
	public void login_into_application() throws Exception {
		Login_cases login_tc = new Login_cases();
		login_tc.login();
		
	}

	@Then("Validate the homepage")
	public void validate_the_homepage() {
		Login_cases login_tc = new Login_cases();
		login_tc.validate_login();
	}

}
