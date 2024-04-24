package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD {

/*    @Given("We should be on login page")
    public void myLoginPage()
    {
        System.out.println("some");
        System.out.println("1111some");
    }*/

    @Given("We should be on login page")
    public void we_should_be_on_login_page() {
        System.out.println("We should be on login page");
       }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("I enter correct username and password" );

    }
    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button" );
     }
    @Then("We should on home page")
    public void we_should_on_home_page() {

        System.out.println("We should on home page" );
    }

    @When("I enter incorrect username and password")
    public void iEnterIncorrectUsernameAndPassword() {
        System.out.println("I enter incorrect username and password" );
    }

    @When("I enter blank username and password")
    public void iEnterBlankUsernameAndPassword() {
    }
}
