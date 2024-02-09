package driplane.stepdefinitions;

import driplane.pages.DriplaneLoginUITest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import driplane.pages.DefaultProjectDashboardUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;

public class UserLoginSteps {
    DriplaneLoginUITest driplaneLogin = new DriplaneLoginUITest();
    DefaultProjectDashboardUITest defaultProjectDashboardUITest = new DefaultProjectDashboardUITest();

    @Given("User navigates to the login page")
    public void navigateToLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
    }

    @When("User enters {string} and {string}")
    public void enterCredentials(String email, String password) {
        driplaneLogin.enterEmail(email);
        driplaneLogin.enterPassword(password);
        driplaneLogin.clickLoginButton();
    }

    @Then("User should see {string}")
    public void verifyOutcome(String outcome) {
        if (outcome.equals("passes")) {
            Assert.assertTrue(defaultProjectDashboardUITest.defaultProjectDashboardText.isDisplayed());
        } else if (outcome.equals("Please write a valid email address")) {
            Assert.assertTrue(driplaneLogin.pleaseWriteAValidEmailAddressText.isDisplayed());
        } else {
            Assert.assertTrue(driplaneLogin.pleaseWriteAValidEmailAddressText.isDisplayed());
        }
    }
}
