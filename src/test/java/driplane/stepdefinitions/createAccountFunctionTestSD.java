package driplane.stepdefinitions;

import driplane.pages.CreateAccountUITest;
import driplane.pages.LoginUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class createAccountFunctionTestSD {
    LoginUITest loginUITest = new LoginUITest();
    CreateAccountUITest createAccountUITest = new CreateAccountUITest();
    SoftAssert softAssert = new SoftAssert();

    @Given("I am on the Driplane signup page")
    public void iAmOnTheDriplaneSignupPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(Driver.getDriver().getCurrentUrl().contains("login") ?
                "I am on the Driplane login page" :
                "I am not on the Driplane login page");
    }

    @Then("I should be on the Driplane signup page")
    public void iShouldBeOnTheDriplaneSignupPage() {
        loginUITest.createAccountButton.click();
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(Driver.getDriver().getCurrentUrl().contains("signup") ?
                "I am on the Driplane signup page" :
                "I am not on the Driplane signup page");
    }

    @When("I enter a valid standard email")
    public void iEnterAValidStandardEmail() {

    }

    @And("I enter a valid standard password")
    public void iEnterAValidStandardPassword() {
    }

    @And("I confirm the password")
    public void iConfirmThePassword() {
    }

    @Then("the email, password, and confirm password fields should be filled with valid information")
    public void theEmailPasswordAndConfirmPasswordFieldsShouldBeFilledWithValidInformation() {
    }

    @When("I click on the Register Button")
    public void iClickOnTheRegisterButton() {
    }

    @Then("I should be directed to the account creation process")
    public void iShouldBeDirectedToTheAccountCreationProcess() {
    }

    @Given("I am on the account creation page")
    public void iAmOnTheAccountCreationPage() {
    }

    @When("I successfully fill out the required information")
    public void iSuccessfullyFillOutTheRequiredInformation() {
    }

    @And("I submit the form")
    public void iSubmitTheForm() {
    }

    @Then("my account should be created successfully")
    public void myAccountShouldBeCreatedSuccessfully() {
    }
}
