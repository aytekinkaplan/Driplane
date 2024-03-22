package driplane.pages;

import driplane.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUITestFormEmptyTest {
    public LoginUITestFormEmptyTest() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[text()='Please write a valid email address']")
    public WebElement pleaseWriteAValidEmailAddress;

    @FindBy(xpath = "//div[text()='Write your password']")
    public WebElement pleaseWriteAValidPasswordPassword;

    @FindBy(xpath = "//div[@class='error-text sc-ion-input-ios']")
    public WebElement loginFailedPleaseCheckYourEmailAddressAndPassword;

    // The expression for the "Login" button
    @FindBy(xpath = "//ion-button[text()='Login']")
    public WebElement loginButton;

}
