package driplane.stepdefinitions;

import driplane.pages.LoginUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class LoginTestWithJavaFakerSD {
    private final LoginUITest loginUITest = new LoginUITest();
    private final Faker faker = new Faker();
    private final SoftAssert softAssert = new SoftAssert();
    private int successCount = 0;
    private int failCount = 0;
    private int attemptCount = 20; // For repeating 20 times
    private int testCount = 0; // Counter for login attempts

    @Given("User is on the Driplane login page")
    public void user_is_on_the_driplane_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
    }

    @When("User enters random email and password")
    public void user_enters_random_email_and_password() {

        loginUITest.emailInput.sendKeys(faker.internet().emailAddress());
        loginUITest.passwordInput.sendKeys(faker.internet().password());
    }

    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginUITest.loginButton.click();
    }

    @Then("User should be redirected to the dashboard page")
    public void user_should_be_redirected_to_the_dashboard_page() {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        if (actualUrl.contains("/projects/")) {
            System.out.println("Attempt " + testCount + ": Login Successful");
            successCount++;
        } else {
            System.out.println("Attempt " + testCount + ": Login Failed");
            failCount++;
        }
        softAssert.assertTrue(actualUrl.contains("/projects/"));
    }

    @Then("Repeat the login process {int} times")
    public void repeat_the_login_process_times(int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            testCount++; // Increment the test counter
            user_is_on_the_driplane_login_page();
            user_enters_random_email_and_password();
            user_clicks_on_the_login_button();
            user_should_be_redirected_to_the_dashboard_page();
            System.out.println("Attempt " + testCount + " is completed.");
        }
        softAssert.assertAll(); // assertAll method checks all assertions
        printResult();
    }

    private void printResult() {
        System.out.println("Total login attempts: " + attemptCount);
        System.out.println("Successful logins: " + successCount);
        System.out.println("Failed logins: " + failCount);
    }
}
