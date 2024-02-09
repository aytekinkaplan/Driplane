package driplane.stepdefinitions;

import driplane.pages.DriplaneLoginUITest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;

public class DriplaneLoginUITestSD {
    DriplaneLoginUITest driplaneLoginTest = new DriplaneLoginUITest();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
    }

    @And("the user should see the text {string}")
    public void theUserShouldSeeTheTextDriplane(String expectedText) {
        Assert.assertEquals("Driplane", driplaneLoginTest.driplaneText.getText());
    }

    @And("the user should see the Email input field")
    public void theUserShouldSeeTheEmailInputField() {
        Assert.assertTrue(driplaneLoginTest.emailInputArea1.isDisplayed());
    }

    @And("the user should see the Password input field")
    public void theUserShouldSeeThePasswordInputField() {
        Assert.assertTrue(driplaneLoginTest.passwordInputArea.isDisplayed());
    }

    @And("the user should see the LOGIN button")
    public void theUserShouldSeeTheLOGINButton() throws InterruptedException {
        Assert.assertTrue(driplaneLoginTest.loginButton.isEnabled());
        Thread.sleep(5000);
        if (driplaneLoginTest.loginButton.isEnabled()) {
            driplaneLoginTest.loginButton.click();
            System.out.println("LOGIN button clicked successfully.");
        } else {
            System.out.println("LOGIN button is not clickable.");
        }

    }

    @And("the user should be able to click on the LOGIN button")
    public void theUserShouldBeAbleToClickOnTheLOGINButton() {
        Assert.assertTrue(driplaneLoginTest.loginButton.isDisplayed());
    }

    @And("the user should see the RESET PASSWORD button")
    public void theUserShouldSeeTheRESETPASSWORDButton() throws InterruptedException {
        Assert.assertTrue(driplaneLoginTest.resetPasswordButton.isEnabled());
        Thread.sleep(5000);
        if (driplaneLoginTest.resetPasswordButton.isEnabled()) {
            driplaneLoginTest.resetPasswordButton.click();
            System.out.println("RESET PASSWORD button clicked successfully.");
        } else {
            System.out.println("RESET PASSWORD button is not clickable.");
        }
    }

    @And("the user should be able to click on the RESET PASSWORD button")
    public void theUserShouldBeAbleToClickOnTheRESETPASSWORDButton() {
        Assert.assertTrue(driplaneLoginTest.resetPasswordButton.isDisplayed());
    }

    @And("the user should see the CREATE ACCOUNT button")
    public void theUserShouldSeeTheCREATEACCOUNTButton() throws InterruptedException {
        Driver.getDriver().navigate().back();
        Assert.assertTrue(driplaneLoginTest.createAccountButton.isEnabled());

        if (driplaneLoginTest.createAccountButton.isEnabled()) {
            Thread.sleep(5000);
            driplaneLoginTest.createAccountButton.click();
            System.out.println("CREATE ACCOUNT button clicked successfully.");
        } else {
            System.out.println("CREATE ACCOUNT button is not clickable.");
        }
    }

    @And("the user should be able to click on the CREATE ACCOUNT button")
    public void theUserShouldBeAbleToClickOnTheCREATEACCOUNTButton() {
        Assert.assertTrue(driplaneLoginTest.createAccountButton.isDisplayed());
    }
}
