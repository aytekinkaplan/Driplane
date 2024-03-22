package driplane.stepdefinitions;

import driplane.pages.CreateAccountUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import driplane.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateAccountUITestSD {
    public CreateAccountUITest createAccountUITest = new CreateAccountUITest();

    @Given("I am on the Driplane Create Account page")
    public void iAmOnTheDriplaneCreateAccountPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
        createAccountUITest.createAccountButton.click();
        System.out.println(Driver.getDriver().getCurrentUrl());
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String arg0) {
        System.out.println("------------------------------------------------");
        ReusableMethods.waitFor(2);
        Assert.assertEquals(arg0, createAccountUITest.driplaneTextVisible.getText());
        ReusableMethods.waitFor(2);
        createAccountUITest.driplaneTextVisible.isDisplayed();
        System.out.println(createAccountUITest.driplaneTextVisible.isEnabled());
        System.out.println("Visible of the driplane text: " + createAccountUITest.driplaneTextVisible.getText());
        System.out.println("------------------------------------------------");
    }

    @Then("User should see the text {string}")
    public void userShouldSeeTheText(String arg0) {
        System.out.println("------------------------------------------------");
        ReusableMethods.waitFor(2);
        Assert.assertEquals(arg0, createAccountUITest.createAccountTextVisible.getText());
        ReusableMethods.waitFor(2);
        createAccountUITest.createAccountTextVisible.isDisplayed();
        System.out.println("Visible of the \"Create Account\" text: " + createAccountUITest.createAccountTextVisible.getText());
        System.out.println("------------------------------------------------");
    }

    @Then("the E-mail input field should be enabled")
    public void theEMailInputFieldShouldBeEnabled() {
        createAccountUITest.emailInput.isEnabled();
        System.out.println(createAccountUITest.emailInput.isDisplayed());
    }

    @Then("the New Password input field should be enabled")
    public void theNewPasswordInputFieldShouldBeEnabled() {
        createAccountUITest.newPasswordInput.isEnabled();
        System.out.println(createAccountUITest.newPasswordInput.isDisplayed());
    }

    @Then("the Verify Password input field should be enabled")
    public void theVerifyPasswordInputFieldShouldBeEnabled() {
        createAccountUITest.verifyPasswordInput.isEnabled();
        System.out.println(createAccountUITest.verifyPasswordInput.isDisplayed());
    }

    @Then("I should see the Register button")
    public void iShouldSeeTheRegisterButton() {
        System.out.println("------------------------------------------------");
        Assert.assertTrue(createAccountUITest.registerButton.isDisplayed());
        System.out.println("Visible of the register button: " + createAccountUITest.registerButton.getText());
        System.out.println("------------------------------------------------");
    }


    @Then("I should be able to click on the Register button")
    public void iShouldBeAbleToClickOnTheRegisterButton() {
        System.out.println(createAccountUITest.registerButton.isEnabled() ? "The register button is clickable" : "The register button is not clickable");
    }

    @Then("All users should see the text {string}")
    public void allUsersShouldSeeTheText(String arg0) {
        System.out.println("------------------------------------------------");
        ReusableMethods.waitFor(2);
        Assert.assertEquals(arg0, createAccountUITest.doYouAlreadyHaveAccount.getText());
        ReusableMethods.waitFor(2);
        createAccountUITest.doYouAlreadyHaveAccount.isDisplayed();
        System.out.println("Visible of the \"Do you already have an account?\" text: " + createAccountUITest.doYouAlreadyHaveAccount.getText());
        System.out.println("------------------------------------------------");
    }


    @Then("I should see the Login button")
    public void iShouldSeeTheLoginButton() {
        System.out.println(createAccountUITest.loginButton.isEnabled() ? "The Login button is clickable" : "The Login button is not clickable");
    }


    @Then("I should be able to click on the Login button")
    public void iShouldBeAbleToClickOnTheLoginButton() {
        System.out.println(createAccountUITest.loginButton.isEnabled() ? "The Login button is clickable" : "The Login button is not clickable");
    }


    @When("I click the Login button")
    public void iClickTheLoginButton() {

        System.out.println("I am currently on the " + Driver.getDriver().getCurrentUrl() + " page.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue("This is not the Create Account Page.", Driver.getDriver().getCurrentUrl().contains("/signup"));
        createAccountUITest.loginButton.click();


    }

    @Then("I should be redirected to the login page")
    public void iShouldBeRedirectedToTheLoginPage() {
        System.out.println("I am currently on the " + Driver.getDriver().getCurrentUrl() + " page.");
        ReusableMethods.waitFor(2);
        Assert.assertTrue("This is not the Login Page.", Driver.getDriver().getCurrentUrl().contains("/login"));
    }
}
