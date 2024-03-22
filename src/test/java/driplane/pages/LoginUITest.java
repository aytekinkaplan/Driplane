package driplane.pages;

import com.github.javafaker.Faker;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUITest {
    public LoginUITest() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // The expression for the "Driplane Text" element
    @FindBy(xpath = "//h1")
    public WebElement driplaneTextVisible;

    // The expression for the "Email Input" section
    @FindBy(xpath = "//input[@id='ion-input-0']")
    public WebElement emailInput;

    // The expression for the "Password Input" section
    @FindBy(xpath = "//input[@id='ion-input-1']")
    public WebElement passwordInput;

    // The expression for the "Forgot Password" section
    @FindBy(xpath = "//ion-button[@routerlink='/password-reset'][text()='Forgot password?']")
    public WebElement forgotPasswordLink;

    // The expression for the "Login" button
    @FindBy(xpath = "//ion-button[text()='Login']")
    public WebElement loginButton;

    // The expression for the "Create Account" button
    @FindBy(xpath = "//ion-button[@routerlink='/signup'][text()='Create Account']")
    public WebElement createAccountButton;

    // The expression for the "Default Project" title after successful login
    @FindBy(xpath = "//ion-title[text()='Default Project']")
    public WebElement defaultProjectTitle;

    // The expression for the text displayed on the "Create Account" page
    @FindBy(xpath = "//ion-title")
    public WebElement createAccountText;

    // Method: Login Process
    public void loginProcess() throws InterruptedException {
        // Entering the user email
        emailInput.sendKeys(ConfigurationReader.getProperty("userEmail"));

        // Entering the user password
        passwordInput.sendKeys(ConfigurationReader.getProperty("userPassword"));

        // Clicking on the login button
        loginButton.click();

        // Waiting: Waiting for a certain duration for the operation to complete
        Thread.sleep(10000);

        // Printing the current URL
        System.out.println(Driver.getDriver().getCurrentUrl());

        // Assertion: Checking if "Default Project" text is present in the title
        Assert.assertTrue("Default Project", defaultProjectTitle.getText().contains("Default Project"));

        // Printing the title text
        System.out.println(defaultProjectTitle.getText() + "\nIf visible, the user has definitely logged into the Dashboard...");

    }

    public void loginProcessTest(int repeatCount) throws Exception {
        Faker faker = new Faker();
        for (int i = 0; i < repeatCount; i++) {
            Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
            emailInput.sendKeys(faker.internet().emailAddress());
            passwordInput.sendKeys(faker.internet().password());
            loginButton.click();
            String actualUrl = Driver.getDriver().getCurrentUrl();
            System.out.println(actualUrl.contains("/projects/") ? "Login Successful" : "Login Failed");
        }
    }

}
