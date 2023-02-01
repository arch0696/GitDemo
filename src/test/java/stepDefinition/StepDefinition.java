package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;


public class StepDefinition{ 
	
	@Given("^Validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("broser opened");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("browser");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
        System.out.println("browser started");
    }

	
	 @Given("^User is on banking landing page$")
	    public void user_is_on_banking_landing_page() throws Throwable {
	        System.out.println("user is in banking page");
	    }

	 @When("^User login in to application with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	    public void user_login_in_to_application_with_username_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        //home page validation
    	System.out.println("home page validated");
    }

   @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }
    
    @When("^User sign with following details$")
    public void user_sign_with_following_details(DataTable data) throws Throwable {
        List<List<String>> obj=data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }
    
    @When("^User login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }




}
