package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegistrationSD {


    @Given("We are on registration page")
    public void weAreOnRegistrationPage()
    {
        System.out.println("We are on registration page");
    }


    @When("I enter Below Data")
    public void iEnterBelowData(DataTable dataTable) {
        System.out.println("I enter Below Data");

        List<List<String>> data = dataTable.asLists();

        System.out.println("First name:"+data.get(0).get(0));
        System.out.println("Last name:"+data.get(0).get(1));
        System.out.println("Phone:"+data.get(0).get(2));
        System.out.println("Email:"+data.get(0).get(3));

        /*System.out.println("First name:"+data.get(0).get(0));
        System.out.println("Last name:"+data.get(0).get(1));
        System.out.println("Phone:"+data.get(0).get(2));
        System.out.println("Email:"+data.get(0).get(3));*/
    }

    @And("I click on submit")
    public void iClickOnSubmit() {
        System.out.println("I click on submit");
    }

    @Then("user should be added")
    public void userShouldBeAdded() {
        System.out.println("user should be added");
    }
}
