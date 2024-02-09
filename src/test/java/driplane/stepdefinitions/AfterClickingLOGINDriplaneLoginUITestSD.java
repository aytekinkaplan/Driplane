package driplane.stepdefinitions;

import driplane.pages.DriplaneLoginUITest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;

public class AfterClickingLOGINDriplaneLoginUITestSD {
    DriplaneLoginUITest driplaneLoginUITest = new DriplaneLoginUITest();

    @Given("the user is on the LOGIN page")
    public void theUserIsOnTheLOGINPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
    }

    @When("the user clicks the LOGIN button with empty Email and Password")
    public void theUserClicksTheLOGINButtonWithEmptyEmailAndPassword() {
        driplaneLoginUITest.loginButton.click();
    }

    @Then("the user should see a validation message {string}")
    public void theUserShouldSeeAValidationMessage(String arg0) {
        Assert.assertEquals(arg0, driplaneLoginUITest.pleaseWriteAValidEmailAddressText.getText());
    }

    @Then("the user should see the message {string}")
    public void theUserShouldSeeTheMessage(String writeYourPassword) {
        Assert.assertEquals(writeYourPassword, driplaneLoginUITest.writeYourPassword.getText());
    }

    @When("the user attempts to click the LOGIN button")
    public void theUserAttemptsToClickTheLOGINButton() throws InterruptedException {
        Assert.assertTrue(driplaneLoginUITest.loginButton.isEnabled());
        Thread.sleep(5000);
        if (driplaneLoginUITest.loginButton.isEnabled()) {
            driplaneLoginUITest.loginButton.click();
            System.out.println("LOGIN button clicked successfully.");
        } else {
            System.out.println("LOGIN button is not clickable.");
        }
    }

    @Then("the LOGIN button should be clickable")
    public void theLOGINButtonShouldBeClickable() throws InterruptedException {
        Assert.assertTrue(driplaneLoginUITest.loginButton.isEnabled());
        Thread.sleep(5000);
        if (driplaneLoginUITest.loginButton.isEnabled()) {
            driplaneLoginUITest.loginButton.click();
            System.out.println("LOGIN button clicked successfully.");
        } else {
            System.out.println("LOGIN button is not clickable.");
        }
    }

    @When("the user attempts to click the RESET PASSWORD button")
    public void theUserAttemptsToClickTheRESETPASSWORDButton() throws InterruptedException {
        Assert.assertTrue(driplaneLoginUITest.resetPasswordButton.isEnabled());
        Driver.getDriver().navigate().back();
        Thread.sleep(5000);
        if (driplaneLoginUITest.resetPasswordButton.isEnabled()) {
            driplaneLoginUITest.resetPasswordButton.click();
            System.out.println("RESET PASSWORD button clicked successfully.");
        } else {
            System.out.println("RESET PASSWORD button is not clickable.");
        }
    }

    @Then("the RESET PASSWORD button should be clickable")
    public void theRESETPASSWORDButtonShouldBeClickable() throws InterruptedException {
        Driver.getDriver().navigate().back();
        Assert.assertTrue(driplaneLoginUITest.resetPasswordButton.isEnabled());
        Thread.sleep(5000);
        if (driplaneLoginUITest.resetPasswordButton.isEnabled()) {
            driplaneLoginUITest.resetPasswordButton.click();
            System.out.println("RESET PASSWORD button clicked successfully.");
        } else {
            System.out.println("RESET PASSWORD button is not clickable.");
        }
    }

    @When("the user attempts to click the CREATE ACCOUNT button")
    public void theUserAttemptsToClickTheCREATEACCOUNTButton() throws InterruptedException {
        Driver.getDriver().navigate().back();
        Assert.assertTrue(driplaneLoginUITest.createAccountButton.isEnabled());

        if (driplaneLoginUITest.createAccountButton.isEnabled()) {
            Thread.sleep(5000);
            driplaneLoginUITest.createAccountButton.click();
            System.out.println("CREATE ACCOUNT button clicked successfully.");
        } else {
            System.out.println("CREATE ACCOUNT button is not clickable.");
        }

    }

    @Then("the CREATE ACCOUNT button should be clickable")
    public void theCREATEACCOUNTButtonShouldBeClickable() {
    }
}
