package triofan.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import triofan.pages.DefaultProjectDashboardUITest;
import triofan.pages.TriofanLoginUITest;
import triofan.utilities.ConfigurationReader;
import triofan.utilities.Driver;

public class UserLoginSteps {
    TriofanLoginUITest triofanLogin = new TriofanLoginUITest();
    DefaultProjectDashboardUITest defaultProjectDashboardUITest = new DefaultProjectDashboardUITest();

    @Given("User navigates to the login page")
    public void navigateToLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("triofanURL"));
    }

    @When("User enters {string} and {string}")
    public void enterCredentials(String email, String password) {
        triofanLogin.enterEmail(email);
        triofanLogin.enterPassword(password);
        triofanLogin.clickLoginButton();
    }

    @Then("User should see {string}")
    public void verifyOutcome(String outcome) {
        if (outcome.equals("passes")) {
            Assert.assertTrue(defaultProjectDashboardUITest.defaultProjectDashboardText.isDisplayed());
        } else if (outcome.equals("Please write a valid email address")) {
            Assert.assertTrue(triofanLogin.pleaseWriteAValidEmailAddressText.isDisplayed());
        } else {
            Assert.assertTrue(triofanLogin.pleaseWriteAValidEmailAddressText.isDisplayed());
        }
    }
}
