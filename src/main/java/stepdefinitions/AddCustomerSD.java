package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomerSD {

    WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {

        System.out.println("We should be on login page");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

    }
    @When("I login with correct user details")
    public void i_login_with_correct_user_details() {
        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();

    }
    @When("I click on add customer link")
    public void i_click_on_add_customer_link() {
        driver.findElement(By.partialLinkText("Add Cus")).click();
    }
    @When("^I enter (.+) , (.+) , (.+) , (.+)$")
    public void i_enter_name_address_contact1_contact2(String name,String address , String contact1, String contact2) {

     /*   System.out.println("name="+name);
        System.out.println("address="+address);
        System.out.println("contact1="+contact1);
        System.out.println("contact2="+contact2);*/



        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("contact1")).sendKeys(contact1);
        driver.findElement(By.name("contact2")).sendKeys(contact2);





    }
    @When("I clcik on submit button")
    public void i_clcik_on_submit_button() {
        driver.findElement(By.name("Submit")).click();
    }
    @Then("Customer should be added")
    public void customer_should_be_added() {

    }
}
