package driplane.pages;

import driplane.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountUITest {
    public CreateAccountUITest() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div.logo-container > h1")
    public WebElement driplaneTextVisible;

    @FindBy(xpath = "//ion-title[contains(text(),'Create account')]")
    public WebElement createAccountTextVisible;

    @FindBy(xpath = "//input[@id='ion-input-2']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='ion-input-3']")
    public WebElement newPasswordInput;

    @FindBy(xpath = "//input[@id='ion-input-4']")
    public WebElement verifyPasswordInput;

    @FindBy(xpath = "//ion-button[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//p[@slot='end']")
    public WebElement doYouAlreadyHaveAccount;
    @FindBy(xpath = "//a[@routerlink='/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//ion-button[text()='Create Account']")
    public WebElement createAccountButton;

}
