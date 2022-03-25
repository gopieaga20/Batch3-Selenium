package stepDefinition;

import java.util.List;

import cucumber.api.java.en.Given;

public class Test3_Execution {
	
	@Given("create new project in eclipse <username>, <password>")
	public void create_new_project_in_eclipse_username_password(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> data = dataTable.asLists();
	    System.out.println(data.get(0).get(0));
	    System.out.println(data.get(0).get(1));
	    System.out.println(data.get(1).get(0));
	    System.out.println(data.get(1).get(1));
	    
	}
	
	@Given("create new project in eclipse {string} and  {string}")
	public void create_new_project_in_eclipse_and(String data1, String data2) {
	  System.out.println(data1+" "+data2);
	}

}
