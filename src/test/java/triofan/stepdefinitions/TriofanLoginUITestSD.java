package triofan.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import triofan.pages.TriofanLoginUITest;
import triofan.utilities.ConfigurationReader;
import triofan.utilities.Driver;

public class TriofanLoginUITestSD {
    TriofanLoginUITest triofanLogin = new TriofanLoginUITest();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("triofanURL"));
    }

    @And("the user should see the text {string}")
    public void theUserShouldSeeTheTextDriplane(String expectedText) {
        Assert.assertEquals("Driplane", triofanLogin.driplaneText.getText());
    }

    @And("the user should see the Email input field")
    public void theUserShouldSeeTheEmailInputField() {
        Assert.assertTrue(triofanLogin.emailInputArea1.isDisplayed());
    }

    @And("the user should see the Password input field")
    public void theUserShouldSeeThePasswordInputField() {
        Assert.assertTrue(triofanLogin.passwordInputArea.isDisplayed());
    }

    @And("the user should see the LOGIN button")
    public void theUserShouldSeeTheLOGINButton() throws InterruptedException {
        Assert.assertTrue(triofanLogin.loginButton.isEnabled());
        Thread.sleep(5000);
        if (triofanLogin.loginButton.isEnabled()) {
            triofanLogin.loginButton.click();
            System.out.println("LOGIN button clicked successfully.");
        } else {
            System.out.println("LOGIN button is not clickable.");
        }

    }

    @And("the user should be able to click on the LOGIN button")
    public void theUserShouldBeAbleToClickOnTheLOGINButton() {
        Assert.assertTrue(triofanLogin.loginButton.isDisplayed());
    }

    @And("the user should see the RESET PASSWORD button")
    public void theUserShouldSeeTheRESETPASSWORDButton() throws InterruptedException {
        Assert.assertTrue(triofanLogin.resetPasswordButton.isEnabled());
        Thread.sleep(5000);
        if (triofanLogin.resetPasswordButton.isEnabled()) {
            triofanLogin.resetPasswordButton.click();
            System.out.println("RESET PASSWORD button clicked successfully.");
        } else {
            System.out.println("RESET PASSWORD button is not clickable.");
        }
    }

    @And("the user should be able to click on the RESET PASSWORD button")
    public void theUserShouldBeAbleToClickOnTheRESETPASSWORDButton() {
        Assert.assertTrue(triofanLogin.resetPasswordButton.isDisplayed());
    }

    @And("the user should see the CREATE ACCOUNT button")
    public void theUserShouldSeeTheCREATEACCOUNTButton() throws InterruptedException {
        Driver.getDriver().navigate().back();
        Assert.assertTrue(triofanLogin.createAccountButton.isEnabled());

        if (triofanLogin.createAccountButton.isEnabled()) {
            Thread.sleep(5000);
            triofanLogin.createAccountButton.click();
            System.out.println("CREATE ACCOUNT button clicked successfully.");
        } else {
            System.out.println("CREATE ACCOUNT button is not clickable.");
        }
    }

    @And("the user should be able to click on the CREATE ACCOUNT button")
    public void theUserShouldBeAbleToClickOnTheCREATEACCOUNTButton() {
        Assert.assertTrue(triofanLogin.createAccountButton.isDisplayed());
    }
}
