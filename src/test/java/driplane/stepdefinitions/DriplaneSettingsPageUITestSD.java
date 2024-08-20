package driplane.stepdefinitions;

import driplane.pages.DashboardUITest;
import driplane.pages.LoginUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class DriplaneSettingsPageUITestSD {
    LoginUITest loginUITest = new LoginUITest();
    DashboardUITest dashboardUITest = new DashboardUITest();

    SoftAssert softAssert = new SoftAssert();

    @Given("I am on the Driplane Settings page")
    public void iAmOnTheDriplaneSettingsPage() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
        System.out.println(Driver.getDriver().getCurrentUrl());
        System.out.println(Driver.getDriver().getCurrentUrl().contains("login") ?
                "I am on the Driplane login page" :
                "I am not on the Driplane login page");

        loginUITest.loginProcess();
        System.out.println(Driver.getDriver().getCurrentUrl().contains("/projects") ?
                "I am on the Driplane Dashboard page" :
                "I am not on the Driplane Dashboard page");
        System.out.println(" Current URL: " + Driver.getDriver().getCurrentUrl());
    }

    @Then("I should understand that I am on the Driplane Settings page")
    public void iShouldUnderstandThatIAmOnTheDriplaneSettingsPage() throws InterruptedException {
     dashboardUITest.settingsButton.click();
    }

    @Then("I should see the Driplane text")
    public void iShouldSeeTheDriplaneText() {
    }

    @Then("I should identify the mail field")
    public void iShouldIdentifyTheMailField() {
    }

    @Then("I should see the Dashboard")
    public void iShouldSeeTheDashboard() {
    }

    @Then("I should see the Default Project button")
    public void iShouldSeeTheDefaultProjectButton() {
    }

    @Then("I should see the Account Settings")
    public void iShouldSeeTheAccountSettings() {
    }

    @Then("I should see the Sign Out option")
    public void iShouldSeeTheSignOutOption() {
    }

    @Then("I should see the Project Info")
    public void iShouldSeeTheProjectInfo() {
    }

    @Then("I should see the Project Name")
    public void iShouldSeeTheProjectName() {
    }

    @Then("I should see the Project Client ID")
    public void iShouldSeeTheProjectClientID() {
    }

    @Then("I should see the Project Client Secret")
    public void iShouldSeeTheProjectClientSecret() {
    }

    @Then("I should see the Project API Keys")
    public void iShouldSeeTheProjectAPIKeys() {
    }

    @Then("I should see the option to Create a New Key")
    public void iShouldSeeTheOptionToCreateANewKey() {
    }

    @Then("I should see the Project Events")
    public void iShouldSeeTheProjectEvents() {
    }
}
