package triofan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import triofan.utilities.Driver;

public class TriofanLoginUITest {
    public TriofanLoginUITest() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    DefaultProjectDashboardUITest testElements = new DefaultProjectDashboardUITest();
    // First Appearance upon Entering the Login Page
    // Driplane Text
    @FindBy(xpath = "//h1[normalize-space()='Driplane']")
    public WebElement driplaneText;

    // Email Input Area
    @FindBy(xpath = "//input[@id='ion-input-0']")
    public WebElement emailInputArea1;

    // Password Input Area
    @FindBy(xpath = "//input[@id='ion-input-1']")
    public WebElement passwordInputArea;

    // Login Button
    @FindBy(xpath = "//*[@data-testid='loginButton']")
    public WebElement loginButton;

    // Reset Password Button
    @FindBy(xpath = "//ion-button[@data-testid='resetPasswordButton']")
    public WebElement resetPasswordButton;

    // Create Account Button
    @FindBy(xpath = "//ion-button[@data-testid='signupButton']")
    public WebElement createAccountButton;

    /*************************************************************************************/

    // Reacted view when there is a wrong email and password input

    // The appearance of the warning message "Login failed. Please check your e-mail address and password."
    @FindBy(xpath = "//p[contains(text(),'Login failed. Please check your e-mail address and password')]")
    public WebElement loginFailedAlertText;

    /*************************************************************************************/

    /* The resulting view after clicking the Login Button without entering
       data into the Email and Password input fields on the Login page. */

    // Appearance of "Please write a valid email address" text
    @FindBy(xpath = "//form/ion-list/ion-text[1]/p")
    public WebElement pleaseWriteAValidEmailAddressText;

    // Appearance of "Write your password" text
    @FindBy(xpath = "//p[normalize-space()='Write your password']")
    public WebElement writeYourPassword;

    /*************************************************************************************/

    /* The view on the page resulting from the reaction after clicking
       the Reset Password Button on the Login page. */

    // Visibility of the text 'Driplane Reset Password'
    @FindBy(xpath = "//ion-title[@class='md title-default hydrated']")
    public WebElement driplaneResetPassword;

    // Email Input Area
    @FindBy(xpath = "//input[@id='ion-input-3']")
    public WebElement emailInputArea2;

    // Appearance of the text "Your password reset mail sent! Please click the link in email to change your password."
    @FindBy(xpath = "//*[@data-testid='mailSentMessage']")
    public WebElement resetMailAlertSentText;

    // "RESET MY PASSWORD" button
    @FindBy(xpath = "//ion-button[@data-testid='resetPasswordButton']")
    public WebElement resetPasswordButton2;

    /*************************************************************************************/

    public void enterEmail(String email) {
        emailInputArea1.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInputArea.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean isUserLoggedIn() {
        // Implement logic to check if user is logged in
        return testElements.defaultProjectDashboardText.isDisplayed(); // Example: Assuming user panel is displayed when user is logged in
    }

    public boolean isLoginFailed1() {
        // Implement logic to check if login failed
        return pleaseWriteAValidEmailAddressText.isDisplayed(); // Example: Assuming error message is displayed when login fails
    }

    public boolean isLoginFailed2() {
        // Implement logic to check if login failed
        return writeYourPassword.isDisplayed(); // Example: Assuming error message is displayed when login fails
    }
}
