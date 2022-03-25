package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2_Execution {

	@Given("create new project in eclipse {string}, {string}")
	public void create_new_project_in_eclipse(String data1, String data2) {
			System.out.println(data1+" "+data2);
	}

	@When("Install cucumber plugin {string}")
	public void install_cucumber_plugin(String data2) {
		System.out.println(data2);
	}

	@When("Restart eclipse {string}")
	public void restart_eclipse(String data3) {
		System.out.println(data3);
	}

	@Then("Convert to cucumberprojects")
	public void convert_to_cucumberprojects() {
		System.out.println("Project converted to cucumber2");
	}

	@Then("Validate C symbols")
	public void validate_C_symbols() {
		 System.out.println("C sysmbol is shown2");
	}
}
