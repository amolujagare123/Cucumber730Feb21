package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDummyCodeSD {



    @Given("^I am on stock login page$")
    public void i_am_on_stock_login_page() throws Throwable {
        System.out.println("I am on stock login page");
    }

    @When("^I enter valid username and valid password to the stock login page$")
    public void i_enter_valid_username_and_valid_password_to_the_stock_login_page() throws Throwable {
        System.out.println("I enter valid username and valid password to the stock login page");
    }

    @Then("^I should be redirected to the welcome page$")
    public void i_should_be_redirected_to_the_welcome_page() throws Throwable {
        System.out.println("I should be redirected to the welcome page");
    }

    @And("^I click on login button on stock login page$")
    public void i_click_on_login_button_on_stock_login_page() throws Throwable {
        System.out.println("I click on login button on stock login page");
    }



/*

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" to the stock login page$")
    public void i_enter_something_and_something_to_the_stock_login_page(String user, String pass)
            {
                System.out.println("Username:"+user);
                System.out.println("Password:"+pass);
    }
*/

    @When("I enter {string} and {string} to the stock login page")
    public void i_enter_and_to_the_stock_login_page(String user, String pass) {
        System.out.println("Username:"+user);
        System.out.println("Password:"+pass);
    }


    @Then("^I should get error message$")
    public void i_should_get_error_message() throws Throwable {
        System.out.println("I should get error message");
    }

    @Then("^I should another error message$")
    public void i_should_another_error_message() throws Throwable {

        System.out.println("I should get another error message");
    }
}
