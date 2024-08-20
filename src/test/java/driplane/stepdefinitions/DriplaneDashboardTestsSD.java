package driplane.stepdefinitions;

import driplane.pages.DashboardUITest;
import driplane.pages.LoginUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import driplane.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;


public class DriplaneDashboardTestsSD {
    public static LoginUITest loginUITest = new LoginUITest();
    public static DashboardUITest dashboardUITest = new DashboardUITest();
    public static SoftAssert softAssert = new SoftAssert();

    @Given("User is on the Driplane Dashboard page")
    public void user_is_on_the_driplane_dashboard_page() throws InterruptedException {
        // Write code here to navigate to the Driplane Dashboard page
        System.out.println("***** Navigating to Driplane Dashboard Page (Test Case 001) *****");
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
        loginUITest.loginProcess();
        System.out.println("***** Navigating to Driplane Dashboard Page (Test Case 001) *****");
        System.out.println("---------------------------------------------------------------------------");

    }

    @Then("User confirms being on the Driplane Dashboard page")
    public void user_confirms_being_on_the_driplane_dashboard_page() {
        // Write code here to confirm that the user is on the Driplane Dashboard page
        System.out.println("***** Confirming that the user is on the Driplane Dashboard Page (Test Case 002) *****");
        System.out.println(Driver.getDriver().getCurrentUrl().contains("/projects") ? "User is on the Driplane Dashboard Page" : "User is not on the Driplane Dashboard Page");
        System.out.println("***** Confirming that the user is on the Driplane Dashboard Page (Test Case 002) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @Then("User sees the Driplane title")
    public void user_sees_the_driplane_title() {
        // Write code here to confirm that the user sees the Driplane title
        System.out.println("***** Confirming that the user sees the Driplane title (Test Case 003) *****");
        System.out.println(Driver.getDriver().getTitle().contains("Driplane") ? "User sees the Driplane title" : "User does not see the Driplane title");
        System.out.println("***** Confirming that the user sees the Driplane title (Test Case 003) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @Then("User sees the email text on the Driplane Dashboard page")
    public void user_sees_the_email_text_on_the_driplane_dashboard_page() {
        // Write code here to confirm that the user sees the email text
        System.out.println("***** Confirming that the user sees the email text on the Driplane Dashboard page (Test Case 004) *****");
        System.out.println(dashboardUITest.mailDisplayingArea.getText().contains("@") ? "User sees the email text on the Driplane Dashboard page" : "User does not see the email text on the Driplane Dashboard page");
        System.out.println("Displaying email text: " + dashboardUITest.mailDisplayingArea.getText());
        System.out.println("***** Confirming that the user sees the email text on the Driplane Dashboard page (Test Case 004) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @Then("User sees the Dashboard button on the Driplane Dashboard page")
    public void user_sees_the_dashboard_button_on_the_driplane_dashboard_page() {
        // Write code here to confirm that the user sees the Dashboard button
        System.out.println("***** Confirming that the user sees the Dashboard button on the Driplane Dashboard page (Test Case 005) *****");
        System.out.println(dashboardUITest.dashboardButton.isDisplayed() ? "User sees the Dashboard button on the Driplane Dashboard page" : "User does not see the Dashboard button on the Driplane Dashboard page");
        System.out.println("***** Confirming that the user sees the Dashboard button on the Driplane Dashboard page (Test Case 005) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @When("User clicks on the Dashboard button")
    public void user_clicks_on_the_dashboard_button() {
        // Write code here for the action when the user clicks on the Dashboard button
        System.out.println("***** Clicking on the Dashboard button on the Driplane Dashboard page (Test Case 006) *****");
        softAssert.assertTrue(dashboardUITest.dashboardButton.isEnabled(), "User can not click on the Dashboard button");
        System.out.println(dashboardUITest.dashboardButton.isEnabled() ? "User clicks on the Dashboard button" : "User does not click on the Dashboard button");
        System.out.println("***** Clicking on the Dashboard button on the Driplane Dashboard page (Test Case 006) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @Then("User sees the Settings button on the Driplane Dashboard page")
    public void user_sees_the_settings_button_on_the_driplane_dashboard_page() throws InterruptedException {
        // Write code here to confirm that the user sees the Settings button
        System.out.println("***** Confirming that the user sees the Settings button on the Driplane Dashboard page (Test Case 007) *****");
        System.out.println(dashboardUITest.settingsButton.isDisplayed() ? "Settings button is displayed" : "Settings button is not displayed");
        System.out.println("***** Confirming that the user sees the Settings button on the Driplane Dashboard page (Test Case 007) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @When("User clicks on the Settings button")
    public void user_clicks_on_the_settings_button() {
        // Write code here for the action when the user clicks on the Settings button
        System.out.println("***** Clicking on the Settings button on the Driplane Dashboard page (Test Case 008) *****");
        System.out.println(dashboardUITest.settingsButton.isDisplayed() ? "Settings button is clickable" : "Settings button is not clickable");

        System.out.println("***** Clicking on the Settings button on the Driplane Dashboard page (Test Case 008) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @Then("User sees the Default Project text on the Driplane Dashboard page")
    public void user_sees_the_default_project_text_on_the_driplane_dashboard_page() {
        // Write code here to confirm that the user sees the Default Project text
        String cssSelectorForHost1 = ".ios.title-default.hydrated";
        System.out.println("***** Confirming that the user sees the Default Project text on the Driplane Dashboard page (Test Case 009) *****");
        System.out.println(DashboardUITest.defaultProjectTitle(cssSelectorForHost1).isDisplayed() ?
                "User sees the Default Project text on the Driplane Dashboard page"
                : "User does not see the Default Project text on the Driplane Dashboard page");
        System.out.println(DashboardUITest.defaultProjectTitle(cssSelectorForHost1).getText());
        System.out.println("***** Confirming that the user sees the Default Project text on the Driplane Dashboard page (Test Case 009) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @Then("User sees {string} on the Driplane Dashboard page")
    public void user_sees_specific_text_on_the_driplane_dashboard_page(String text) {
        // Write code here to confirm that the user sees specific text
        String string1 = dashboardUITest.didYouAddYourTrackerCodeToYourWebsite.getText();
        String string2 = dashboardUITest.youCanPutTheCodeBelow.getText();
        String string3 = dashboardUITest.thenYouWillStartToSeeYourVisitorInsights.getText();

        if (string1.contains(text)) {
            System.out.println("***** Confirming that the user sees specific text on the Driplane Dashboard page (Test Case 010) *****");
            System.out.println(string1.contains(text) ?
                    "User sees " + text + " on the Driplane Dashboard page" :
                    "User does not see " + text + " on the Driplane Dashboard page");
            System.out.println("***** Confirming that the user sees specific text on the Driplane Dashboard page (Test Case 010) *****");
            System.out.println("---------------------------------------------------------------------------");
        } else if (string2.contains(text)) {
            System.out.println("***** Confirming that the user sees specific text on the Driplane Dashboard page (Test Case 012) *****");
            System.out.println(string2.contains(text) ?
                    "User sees " + text + " on the Driplane Dashboard page" :
                    "User does not see " + text + " on the Driplane Dashboard page");
            System.out.println("***** Confirming that the user sees specific text on the Driplane Dashboard page (Test Case 012) *****");
            System.out.println("---------------------------------------------------------------------------");
        } else if (string3.contains(text)) {
            System.out.println("***** Confirming that the user sees specific text on the Driplane Dashboard page (Test Case 014) *****");
            System.out.println(string3.contains(text) ?
                    "User sees " + text + " on the Driplane Dashboard page" :
                    "User does not see " + text + " on the Driplane Dashboard page");
            System.out.println("***** Confirming that the user sees specific text on the Driplane Dashboard page (Test Case 014) *****");
            System.out.println("---------------------------------------------------------------------------");
        } else {
            System.out.println("User does not see specific text on the Driplane Dashboard page");
        }
    }

    @Then("User sees {string} text on the Driplane Dashboard page")
    public void user_sees_text_on_the_driplane_dashboard_page(String text) {
        // Write code here to confirm that the user sees specific text
        System.out.println("***** " + "Confirming that the user sees " + text + " text on the Driplane Dashboard page (Test Case 011) *****");
        System.out.println(dashboardUITest.noData.isDisplayed() ?
                "User sees " + dashboardUITest.noData.getText() + " on the Driplane Dashboard page" :
                "User does not see " + dashboardUITest.noData.getText() + " on the Driplane Dashboard page");
        System.out.println("***** " + "Confirming that the user sees " + text + " text on the Driplane Dashboard page (Test Case 011) *****");
        System.out.println("---------------------------------------------------------------------------");


    }

    @Then("User verifies the presence of the code area on the Driplane Dashboard page")
    public void user_verifies_the_presence_of_the_code_area_on_the_driplane_dashboard_page() {
        // Write code here to verify the presence of the code area
        System.out.println("***** Verifying the presence of the code area on the Driplane Dashboard page (Test Case 013) *****");
        System.out.println(dashboardUITest.codeBlockArea.isDisplayed() ?
                "User verifies the presence of the code area on the Driplane Dashboard page" :
                "User does not verify the presence of the code area on the Driplane Dashboard page");
        System.out.println("***** Verifying the presence of the code area on the Driplane Dashboard page (Test Case 013) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @Then("User sees the Default Project button on the Driplane Dashboard page")
    public void user_sees_the_default_project_button_on_the_driplane_dashboard_page() throws InterruptedException {
        // Write code here to confirm that the user sees the Default Project button
        System.out.println("***** Confirming that the user sees the Default Project button on the Driplane Dashboard page (Test Case 015) *****");
        dashboardUITest.defaultProjectButton();
        System.out.println("***** Confirming that the user sees the Default Project button on the Driplane Dashboard page (Test Case 015) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @When("User clicks on the Default Project button")
    public void user_clicks_on_the_default_project_button() throws InterruptedException {
        // Write code here for the action when the user clicks on the Default Project button
        System.out.println("***** Confirming that the user sees the Default Project button on the Driplane Dashboard page (Test Case 016) *****");
        dashboardUITest.defaultProjectButton();
        System.out.println("***** Confirming that the user sees the Default Project button on the Driplane Dashboard page (Test Case 016) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @Then("User sees the Account Settings button on the Driplane Dashboard page")
    public void user_sees_the_account_settings_button_on_the_driplane_dashboard_page() {
        // Write code here to confirm that the user sees the Account Settings button
        System.out.println("***** Confirming that the user sees the Account Settings button on the Driplane Dashboard page (Test Case 017) *****");
        System.out.println(dashboardUITest.accountSettingsButton.isDisplayed() ? "Account Settings button is displayed" : "Account Settings button is not displayed");
        System.out.println("***** Confirming that the user sees the Account Settings button on the Driplane Dashboard page (Test Case 017) *****");
        System.out.println("---------------------------------------------------------------------------");
    }

    @When("User clicks on the Account Settings button")
    public void user_clicks_on_the_account_settings_button() {
        // Write code here for the action when the user clicks on the Account Settings button
        System.out.println("***** Clicking on Account Settings Button on Driplane Dashboard Page (Test Case 018) *****");
        System.out.println(dashboardUITest.accountSettingsButton.isEnabled() ? "Account Settings button is clickable" : "Account Settings button is not clickable");
        System.out.println("***** Clicking on Account Settings Button on Driplane Dashboard Page (Test Case 018) *****");
        System.out.println("---------------------------------------------------------------------------");

    }

    @Then("User sees the {string} button on the Driplane Dashboard page")
    public void user_sees_specific_button_on_the_driplane_dashboard_page(String buttonName) {
        // Write code here to confirm that the user sees a specific button
        switch (buttonName) {
            case "Last Month":
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 019) *****");


                String cssSelectorForHost1 = ".ng-untouched.ng-pristine.ng-valid.ion-untouched.ion-pristine.ion-valid.ios.has-value.ion-focusable.select-ltr.select-justify-space-between.select-label-placement-start.hydrated";


                // Elementi al
                WebElement lastMonthElement = Driver.getDriver().findElement(By.cssSelector(cssSelectorForHost1));

// Elementin görünürlüğünü kontrol et
                boolean isDisplayed = lastMonthElement.isDisplayed();
                System.out.println(isDisplayed ? "Last Month button is displayed" : "Last Month button is not displayed");
                System.out.println(lastMonthElement.getText());

// Elemente tıklama
                lastMonthElement.click();
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 019) *****");
                System.out.println("---------------------------------------------------------------------------");


                break;


            case "Live":
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 021) *****");
                System.out.println(dashboardUITest.live.isDisplayed() ? "Live Button is displayed" : "Live Button is not displayed");
                System.out.println(dashboardUITest.live.getText());
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 021) *****");
                System.out.println("---------------------------------------------------------------------------");
                break;
            case "Today":
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 023) *****");
                System.out.println(dashboardUITest.today.isDisplayed() ? "Today button is displayed" : "Today button is not displayed");
                System.out.println(dashboardUITest.today.getText());
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 023) *****");
                System.out.println("---------------------------------------------------------------------------");
                break;
            case "Yesterday":
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 025) *****");
                System.out.println(dashboardUITest.yesterday.isDisplayed() ? "Yesterday button is displayed" : "Yesterday button is not displayed");
                System.out.println(dashboardUITest.yesterday.getText());
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 025) *****");
                System.out.println("---------------------------------------------------------------------------");
                break;
            case "Last Week":
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 027) *****");
                System.out.println(dashboardUITest.lastWeek.isDisplayed() ? "Last Week button is displayed" : "Last Week button is not displayed");
                System.out.println(dashboardUITest.lastWeek.getText());
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 027) *****");
                System.out.println("---------------------------------------------------------------------------");
                break;

            case "Sign Out":
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 029) *****");
                System.out.println(dashboardUITest.signOut.isDisplayed() ? "Sign Out button is displayed" : "Sign Out button is not displayed");
                System.out.println(dashboardUITest.signOut.getText());
                System.out.println("***** Confirming that the user sees the " + buttonName + " button on the Driplane Dashboard page (Test Case 029) *****");
                System.out.println("---------------------------------------------------------------------------");
                break;
            default:
                break;
        }
    }

    @When("User clicks on the {string} button")
    public void user_clicks_on_specific_button(String buttonName) {
        // Write code here for the action when the user clicks on a specific button
        switch (buttonName) {
            case "Last Month":
                System.out.println("***** Clicking on \"Last Month\" Button on Driplane Dashboard Page (Test Case 020) *****");
                String cssSelectorForHost1 = ".ng-untouched.ng-pristine.ng-valid.ion-untouched.ion-pristine.ion-valid.ios.has-value.ion-focusable.select-ltr.select-justify-space-between.select-label-placement-start.hydrated";


                // Elementi al
                WebElement lastMonthElement = Driver.getDriver().findElement(By.cssSelector(cssSelectorForHost1));

// Elementin görünürlüğünü kontrol et
                boolean isEnabled = lastMonthElement.isEnabled();
                System.out.println(isEnabled ? "Last Month button is clickable" : "Last Month button is not clickable");

                System.out.println("***** Clicking on \"Last Month\" Button on Driplane Dashboard Page (Test Case 020) *****");
                System.out.println("---------------------------------------------------------------------------");

                break;
            case "Live":
                System.out.println("***** Clicking on \"Live\" Button on Driplane Dashboard Page (Test Case 022) *****");
                System.out.println(dashboardUITest.live.isEnabled() ? "Live Button is clickable" : "Live Button is not clickable");
                System.out.println("***** Clicking on \"Live\" Button on Driplane Dashboard Page (Test Case 022) *****");
                System.out.println("---------------------------------------------------------------------------");
                break;
            case "Today":
                System.out.println("***** Clicking on \"Today\" Button on Driplane Dashboard Page (Test Case 024) *****");
                System.out.println(dashboardUITest.today.isEnabled() ? "Today button is clickable" : "Today button is not clickable");
                System.out.println("***** Clicking on \"Today\" Button on Driplane Dashboard Page (Test Case 024) *****");
                System.out.println("---------------------------------------------------------------------------");
                break;
            case "Yesterday":
                System.out.println("***** Clicking on \"Yesterday\" Button on Driplane Dashboard Page (Test Case 026) *****");
                System.out.println(dashboardUITest.yesterday.isEnabled() ? "Yesterday button is clickable" : "Yesterday button is not clickable");
                System.out.println("***** Clicking on \"Yesterday\" Button on Driplane Dashboard Page (Test Case 026) *****");
                System.out.println("---------------------------------------------------------------------------");
                break;
            case "Last Week":
                System.out.println("***** Clicking on \"Last Week\" Button on Driplane Dashboard Page (Test Case 028) *****");
                System.out.println(dashboardUITest.lastWeek.isEnabled() ? "Last Week button is clickable" : "Last Week button is not clickable");
                System.out.println("***** Clicking on \"Last Week\" Button on Driplane Dashboard Page (Test Case 028) *****");
                System.out.println("---------------------------------------------------------------------------");
                break;
            case "Sign Out":
                System.out.println("***** Clicking on \"Sign Out\" Button on Driplane Dashboard Page (Test Case 030) *****");
                System.out.println(dashboardUITest.signOut.isEnabled() ? "Sign Out button is clickable" : "Sign Out button is not clickable");
                System.out.println("***** Clicking on \"Sign Out\" Button on Driplane Dashboard Page (Test Case 030) *****");
                System.out.println("---------------------------------------------------------------------------");
                break;
            default:
                break;
        }
    }

    @When("User clicks on the Sign Out button")
    public void user_clicks_on_the_sign_out_button() {
        // Click on the Sign-Out button
        dashboardUITest.signOut.click();
        ReusableMethods.waitFor(2);
        Driver.getDriver().navigate().refresh();
    }

    @Then("User is redirected to the Driplane Login page and confirms being on the Login page, and User confirms {string}")
    public void user_is_redirected_to_the_driplane_login_page_and_confirms_being_on_the_login_page_and_user_confirms(String confirmationText) {
        // Write code here to confirm the redirection to the Driplane Login page and the presence of a specific confirmation text
        System.out.println("***** Confirming that the user is redirected to the Driplane Login page and confirms being on the Login page, and User confirms " + confirmationText + "(Test Case 031) *****");
        System.out.println(Driver.getDriver().getCurrentUrl().contains("/projects/") ? "Redirected is unsuccessful" : "Redirected is successful");
        System.out.println("***** Confirming that the user is redirected to the Driplane Login page and confirms being on the Login page, and User confirms " + confirmationText + "(Test Case 031) *****");
        System.out.println("---------------------------------------------------------------------------");
    }
}

