package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Execution {
	
	@Given("create new project in eclipse")
	public void create_new_project_in_eclipse() {
	    System.out.println("Project created");
	}

	@When("Install cucumber plugin")
	public void install_cucumber_plugin() {
		System.out.println("Cucumber Installed");
	}

	@When("Restart eclipse")
	public void restart_eclipse() {
	   System.out.println("Eclipse Restarted");
	}

	@Then("Convert to cucumberproject")
	public void convert_to_cucumberproject() {
	    System.out.println("Project converted to cucumber");
	}

	@Then("Validate C symbol")
	public void validate_C_symbol() {
	    System.out.println("C sysmbol is shown");
	    
	}

}
