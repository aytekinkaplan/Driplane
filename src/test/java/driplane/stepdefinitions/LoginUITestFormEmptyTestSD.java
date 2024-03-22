package driplane.stepdefinitions;

import com.github.javafaker.Faker;
import driplane.pages.LoginUITest;
import driplane.pages.LoginUITestFormEmptyTest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import driplane.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginUITestFormEmptyTestSD {
    LoginUITestFormEmptyTest loginUITestFormEmptyTest = new LoginUITestFormEmptyTest();
    LoginUITest form = new LoginUITest();
    static Faker faker = new Faker();

    @Given("I am on the Login Page")
    public void iAmOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
        System.out.println(Driver.getDriver().getCurrentUrl());
    }

    @Then("the warning message {string} should be displayed for the email field")
    public void theWarningMessageShouldBeDisplayedForTheEmailField(String arg0) {
        System.out.println(form.passwordInput.isDisplayed());


    }

    @Then("the warning message {string} should be displayed for the password field")
    public void theWarningMessageShouldBeDisplayedForThePasswordField(String arg0) {
    }

    @Then("the warning messages {string} and {string} should be displayed for both fields")
    public void theWarningMessagesAndShouldBeDisplayedForBothFields(String arg0, String arg1) {
    }
}
