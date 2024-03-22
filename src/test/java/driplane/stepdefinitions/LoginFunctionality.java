package driplane.stepdefinitions;

import driplane.pages.DashboardUITest;
import driplane.pages.LoginUITest;
import driplane.pages.LoginUITestFormEmptyTest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import driplane.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginFunctionality {
    LoginUITest loginUITest = new LoginUITest();
    DashboardUITest dashboardUITest = new DashboardUITest();
    LoginUITestFormEmptyTest loginUITestFormEmptyTest = new LoginUITestFormEmptyTest();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
    }

    @When("I enter {string} and {string} and click the login button")
    public void iEnterAndAndClickTheLoginButton(String arg0, String arg1) {
        System.out.println("---------------------------------LEVEL 1---------------------------------");
        loginUITest.emailInput.sendKeys(arg0);
        loginUITest.passwordInput.sendKeys(arg1);
        loginUITest.loginButton.click();
        ReusableMethods.waitFor(5);
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println("---------------------------------LEVEL 1---------------------------------");
    }

    @Then("I should see an outcome message")
    public void iShouldSeeAnOutcomeMessage() {
        System.out.println("---------------------------------LEVEL 2---------------------------------");
        System.out.println(Driver.getDriver().getCurrentUrl().contains("/projects") ? "\"Driplane Login success\"" : "\"Driplane Login failed\"");
        System.out.println("---------------------------------LEVEL 2---------------------------------");
    }

    @When("I enter an email with {string} characters and valid password and click the login button")
    public void iEnterAnEmailWithCharactersAndValidPasswordAndClickTheLoginButton(String arg0) {
        System.out.println("---------------------------------LEVEL 3---------------------------------");
        System.out.println("Enter an email with " + arg0 + " characters and valid password and click the login button");
        loginUITest.emailInput.sendKeys(arg0);
        loginUITest.passwordInput.sendKeys(ConfigurationReader.getProperty("userPassword"));
        loginUITest.loginButton.click();
        ReusableMethods.waitFor(5);
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(loginUITestFormEmptyTest.loginFailedPleaseCheckYourEmailAddressAndPassword.getText());
        System.out.println("---------------------------------LEVEL 3---------------------------------");
    }

    @When("I enter valid email and a password with {string} characters and click the login button")
    public void iEnterValidEmailAndAPasswordWithCharactersAndClickTheLoginButton(String arg0) {
        System.out.println("---------------------------------LEVEL 4---------------------------------");
        System.out.println("Enter a password with " + arg0 + " characters and valid email and click the login button");
        loginUITest.emailInput.sendKeys(ConfigurationReader.getProperty("userEmail"));
        loginUITest.passwordInput.sendKeys(arg0);
        loginUITest.loginButton.click();
        ReusableMethods.waitFor(5);
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(loginUITestFormEmptyTest.loginFailedPleaseCheckYourEmailAddressAndPassword.getText());
        System.out.println("---------------------------------LEVEL 4---------------------------------");
    }

    @When("I enter an email with special characters {string} and valid password and click the login button")
    public void iEnterAnEmailWithSpecialCharactersAndValidPasswordAndClickTheLoginButton(String arg0) {
        System.out.println("---------------------------------LEVEL 5---------------------------------");
        System.out.println("Enter an email with " + arg0 + " characters and valid password and click the login button");
        loginUITest.emailInput.sendKeys(arg0);
        loginUITest.passwordInput.sendKeys(ConfigurationReader.getProperty("userPassword"));
        loginUITest.loginButton.click();
        ReusableMethods.waitFor(5);
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(loginUITestFormEmptyTest.loginFailedPleaseCheckYourEmailAddressAndPassword.getText());
        System.out.println("---------------------------------LEVEL 5---------------------------------");
    }

    @When("I enter valid email and a password with special characters {string} and click the login button")
    public void iEnterValidEmailAndAPasswordWithSpecialCharactersAndClickTheLoginButton(String arg0) {
        System.out.println("---------------------------------LEVEL 6---------------------------------");
        System.out.println("Enter a password with " + arg0 + " characters and valid email and click the login button");
        loginUITest.emailInput.sendKeys(ConfigurationReader.getProperty("userEmail"));
        loginUITest.passwordInput.sendKeys(arg0);
        loginUITest.loginButton.click();
        ReusableMethods.waitFor(5);
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(loginUITestFormEmptyTest.loginFailedPleaseCheckYourEmailAddressAndPassword.getText());
        System.out.println("---------------------------------LEVEL 6---------------------------------");
    }

    @When("I leave login fields empty and click the login button")
    public void iLeaveLoginFieldsEmptyAndClickTheLoginButton() {
        System.out.println("---------------------------------LEVEL 7---------------------------------");
        loginUITest.loginButton.click();
        System.out.println("---------------------------------LEVEL 7---------------------------------");
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        System.out.println("---------------------------------LEVEL 8---------------------------------");
        ReusableMethods.waitFor(5);
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(loginUITestFormEmptyTest.loginFailedPleaseCheckYourEmailAddressAndPassword.getText());
        System.out.println("---------------------------------LEVEL 8---------------------------------");
    }


}
