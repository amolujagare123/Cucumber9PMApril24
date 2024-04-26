package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {

/*    @Given("We should be on login page")
    public void myLoginPage()
    {
        System.out.println("some");
        System.out.println("1111some");
    }*/
     WebDriver driver;
    @Given("We should be on login page")
    public void we_should_be_on_login_page() {
        System.out.println("We should be on login page");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

       }
    @When("I enter correct username and password")
    public void i_enter_correct_username_and_password() {
        System.out.println("I enter correct username and password" );

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");

    }
    /*@When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button" );
        driver.findElement(By.name("submit")).click();
     }*/
    @Then("We should on home page")
    public void we_should_on_home_page() {

        System.out.println("We should on home page" );

        Assert.assertEquals("This is not a Dashboard",
                "POSNIC - Dashboard"
                ,driver.getTitle());
    }

    @When("I enter incorrect username and password")
    public void iEnterIncorrectUsernameAndPassword() {
        System.out.println("I enter incorrect username and password" );

        driver.findElement(By.id("login-username")).sendKeys("sdsd");
        driver.findElement(By.id("login-password")).sendKeys("dsds");
    }

    @When("I enter blank username and password")
    public void iEnterBlankUsernameAndPassword() {
        driver.findElement(By.id("login-username")).sendKeys("");
        driver.findElement(By.id("login-password")).sendKeys("");
    }

    @Then("We should get an error")
    public void weShouldGetAnError() {

        Assert.assertEquals("incorrect or no error message",
                "POSNIC - Login to Control Panel"
                ,driver.getTitle());

    }

    @Then("We should get another error")
    public void weShouldGetAnotherError() {
        Assert.assertEquals("incorrect or no error message",
                "POSNIC - Login to Control Panel"
                ,driver.getTitle());
    }

    @When("I enter {string} as username and {string} as password")
    public void iEnterAsUsernameAndAsPassword(String username, String password) {

        driver.findElement(By.id("login-username")).sendKeys(username);
        driver.findElement(By.id("login-password")).sendKeys(password);
    }


}
