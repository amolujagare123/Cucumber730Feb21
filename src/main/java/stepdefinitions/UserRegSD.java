package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegSD {

    @Given("I am on user registration page")
    public void i_am_on_user_registration_page() {
        System.out.println("I am on user registration page");
    }
    @When("I enter below data")
    public void i_enter_below_data(DataTable dataTable) {

      List<String> data =  dataTable.asList();

        System.out.println("First Name:"+data.get(0));
        System.out.println("Last Name:"+data.get(1));
        System.out.println("Phone :"+data.get(2));
        System.out.println("Email:"+data.get(3));

    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("I click on submit button");
    }
    @Then("user should be registred successfully")
    public void user_should_be_registred_successfully() {
        System.out.println("user should be registred successfully");
    }
}
