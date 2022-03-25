package stepDefinition;

import org.test.testcases.Login_cases;

import cucumber.api.java.en.When;

public class LoginA {
	
	@When("Enter user credentials")
	public void enter_user_credentials() throws Exception {
		Login_cases login_tc = new Login_cases();
		login_tc.getExceldata();
	}
	


}
