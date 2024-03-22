package driplane.stepdefinitions;

import driplane.pages.LoginUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginUITestSD {
    public LoginUITest loginUITest = new LoginUITest();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
    }

    @Then("they should see the {string} logo")
    public void theyShouldSeeTheLogo(String arg0) {
        System.out.println("------------------------------------------------");
        Assert.assertEquals(arg0, loginUITest.driplaneTextVisible.getText());
        loginUITest.driplaneTextVisible.isDisplayed();
        System.out.println("Visible of the driplane text: " + loginUITest.driplaneTextVisible.getText());
        System.out.println("------------------------------------------------");

    }

    @And("they should see the {string} input")
    public void theyShouldSeeTheInput(String arg0) {
        System.out.println("------------------------------------------------");
        Assert.assertTrue(loginUITest.emailInput.isDisplayed());
        System.out.println("Visible of the email input: " + loginUITest.emailInput.getText());
        System.out.println("------------------------------------------------");
    }

    @And("they should see the {string} link")
    public void theyShouldSeeTheLink(String arg0) {
        System.out.println("------------------------------------------------");
        Assert.assertTrue(loginUITest.passwordInput.isDisplayed());
        System.out.println("Visible of the password input: " + loginUITest.passwordInput.getText());
        System.out.println("------------------------------------------------");
    }

    @And("they should see the {string} button")
    public void theyShouldSeeTheButton(String arg0) {
        System.out.println("------------------------------------------------");
        Assert.assertTrue(loginUITest.forgotPasswordLink.isDisplayed());
        System.out.println("Visible of the Forgot Password Link: " + loginUITest.forgotPasswordLink.getText());
        System.out.println(loginUITest.forgotPasswordLink.isEnabled() ? "Forgot Password Link is clickable" : "Forgot Password Link is unclickable");
        System.out.println("------------------------------------------------");
    }

    @When("they click the {string} button")
    public void theyClickTheButton(String arg0) {
        System.out.println("------------------------------------------------");
        Assert.assertTrue(loginUITest.loginButton.isDisplayed());
        System.out.println("Visible of the Login Button: " + loginUITest.loginButton.getText());
        System.out.println(loginUITest.loginButton.isEnabled() ? "Login Button is clickable" : "Login Button is unclickable");
        System.out.println("------------------------------------------------");

    }

    @Then("they should be able to proceed with the login process")
    public void theyShouldBeAbleToProceedWithTheLoginProcess() throws InterruptedException {
        System.out.println("------------------------------------------------");
        loginUITest.loginProcess();
        System.out.println("------------------------------------------------");

    }

    @Then("they should be redirected to the account creation page")
    public void theyShouldBeRedirectedToTheAccountCreationPage() {
        System.out.println("------------------------------------------------");
        System.out.println(loginUITest.createAccountButton.isEnabled() ? "Create Account Button is clickable" : "Create Account Button is unclickable");
        loginUITest.createAccountButton.click();
        System.out.println(Driver.getDriver().getCurrentUrl());
        Assert.assertEquals(loginUITest.createAccountButton.getText(), loginUITest.createAccountButton.getText());
        loginUITest.createAccountButton.isDisplayed();
        System.out.println(loginUITest.createAccountText.isDisplayed());
        System.out.println("Successfully verified the visibility of '" + loginUITest.createAccountText.getText() + "'.");
        System.out.println("------------------------------------------------");

    }
}
