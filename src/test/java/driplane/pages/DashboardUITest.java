package driplane.pages;

import driplane.utilities.Driver;
import driplane.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.*;

public class DashboardUITest {
    SoftAssert softAssert = new SoftAssert();

    public DashboardUITest() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //    @FindBy(id = "//ion-title[@class='ios title-default hydrated']")
//    public WebElement defaultProjectTitle;
    // Locator for the "Driplane Dashboard" element

    //This Element is inside single shadow DOM.
    public String driplaneTextVisible() throws InterruptedException {
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = "ion-list-header[class='ios hydrated']";
        ReusableMethods.waitFor(1);
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
        ReusableMethods.waitFor(1);
        return shadow.findElement(By.cssSelector(".ion-inherit-color.ios.hydrated")).getText();
    }

    // Locator for the "Driplane Dashboard" element
    @FindBy(xpath = "ion-list-header[class='ios hydrated']")
    public WebElement driplaneTextVisible;

    // Locator for the mail displaying area
    @FindBy(xpath = "//ion-note[@class='ios hydrated']")
    public WebElement mailDisplayingArea;

    // Locator for the "Dashboard" button
    @FindBy(xpath = "//ion-label[normalize-space()='Dashboard']")
    public WebElement dashboardButton;

    // Locator for the "Settings" label
    @FindBy(xpath = "//ion-label[normalize-space()='Settings']")
    public static WebElement settingsButton;

    @FindBy(css = "ion-card-title.ion-inherit-color.ios.hydrated")
    public WebElement noData;

    //--------------------------------------------------------------------//
    public void defaultProjectButton() throws InterruptedException {
//This Element is inside single shadow DOM.
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = ".ios.in-item.has-value.label-floating.has-placeholder.ion-focusable.select-ltr.select-label-placement-floating.hydrated";
        ReusableMethods.waitFor(1);
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
        ReusableMethods.waitFor(1);
        System.out.println(shadow.findElement(By.cssSelector(".select-text")).isDisplayed() ? "Default Project Button is visible" : "Default Project Button is not visible");
        System.out.println(shadow.findElement(By.cssSelector(".select-text")).isEnabled() ? "Default Project Button is clickable" : "Default Project Button is not clickable");

    }

    @FindBy(xpath = "//ion-label[normalize-space()='Project Info']")
    public WebElement projectInfo;
    @FindBy(xpath = "//h2[normalize-space()='Project Name:']")
    public WebElement projecName;

    @FindBy(xpath = "//p[normalize-space()='Default Project']")
    public WebElement defaultProjectLittleText;

    @FindBy(xpath = "//h2[normalize-space()='Project Client ID:']")
    public WebElement projectClientID;

    @FindBy(css = ".copy-button__button")
    public WebElement copyButton;

    @FindBy(xpath = "//h2[normalize-space()='Project Client Secret:']")
    public WebElement projectClientSecret;

    @FindBy(xpath = "//ion-label[normalize-space()='Project API Keys']")
    public WebElement projectAPIKeys;

    @FindBy(xpath = "//ion-label[normalize-space()='Create New Key']")
    public WebElement createNewKey;

    @FindBy(css = ".input-wrapper")
    public WebElement inputWrapperArea;
    //--------------------------------------------------------------------//
    @FindBy(xpath = "//ion-button[@class='ios button button-clear in-toolbar in-buttons ion-activatable ion-focusable hydrated']")
    public WebElement backButton;

    @FindBy(xpath = "//ion-buttons[@class='buttons-last-slot sc-ion-buttons-ios-h sc-ion-buttons-ios-s ios hydrated']")
    public WebElement saveButton;

    @FindBy(xpath = "//ion-title[normalize-space()='Create Project Key']")
    public WebElement createProjectKey;

    @FindBy(xpath = "//label[@for='ion-input-7']")
    public WebElement keyName;

    @FindBy(xpath = "//input[@id='ion-input-7']")
    public WebElement keyInput;

    @FindBy(xpath = "//ion-note[@class='list-note ion-margin-horizontal ion-color ion-color-medium ios hydrated']")
    public WebElement giveYourKeyANameThatExplainsThePurposeOfTheKey;

    @FindBy(xpath = "//ion-checkbox[normalize-space()='Write Access']")
    public WebElement writeAccess;

    @FindBy(xpath = "//ion-checkbox[normalize-space()='Read Access']")
    public WebElement readAccess;
    //--------------------------------------------------------------------//

    @FindBy(xpath = "//ion-note[@class='list-note ion-margin ion-color ion-color-medium ios hydrated']")
    public WebElement projectKeysAreNonExpiringAPITokens;
    //--------------------------------------------------------------------//
    // Locator for the default project in the left bottom corner
    @FindBy(css = ".select-text")
    public WebElement defaultProjectLeftBottomCorner;

    // Locator for the "Account Settings" label
    @FindBy(xpath = "//ion-label[normalize-space()='Account Settings']")
    public WebElement accountSettingsButton;
    //--------------------------------------------------------------------//
    @FindBy(xpath = "//ion-title[@class='ios title-default hydrated']")
    public WebElement accountSettingsTitle;

    @FindBy(xpath = "//ion-label[normalize-space()='Project Management']")
    public WebElement projectManagement;


    @FindBy(xpath = "//ion-button[@class='ios button button-clear ion-activatable ion-focusable hydrated']")
    public WebElement addNewProject;

    @FindBy(xpath = "//ion-note[@class='list-note ion-margin ion-color ion-color-medium ios hydrated']")
    public WebElement swipeItemLeftToDeleteAProject;

    //--------------------------------------------------------------------//

    // Locator for the "Sign out" label
    @FindBy(xpath = "//ion-label[normalize-space()='Sign out']")
    public WebElement signOut;

    // Locator for the subtitle of a card
    @FindBy(xpath = "//ion-card-subtitle[@role='heading']")
    public WebElement didYouAddYourTrackerCodeToYourWebsite;

    // Locator for the paragraph mentioning code placement
    @FindBy(xpath = "//p[contains(text(),'You can put the code below before')]")
    public WebElement youCanPutTheCodeBelow;

    // Locator for the code block
    @FindBy(xpath = "//pre[@class='hljs']")
    public WebElement codeBlockArea;

    // Locator for the paragraph mentioning visitor insights
    @FindBy(xpath = "//p[contains(text(),'Then you will start to see your visitor insights i')]")
    public WebElement thenYouWillStartToSeeYourVisitorInsights;

    // Locator for the title of the default project
    public static WebElement defaultProjectTitle(String cssSelectorForHost1) {
        //This Element is inside single shadow DOM.
//        String cssSelectorForHost1 = ".ios.title-default.hydrated";
        ReusableMethods.waitFor(1);
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
        ReusableMethods.waitFor(1);
        return shadow.findElement(By.cssSelector(".toolbar-title"));
    }

    // Locator for the "Last Month" element
    public static WebElement lastMonth(String cssSelectorForHost) {
        ReusableMethods.waitFor(1);
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector(cssSelectorForHost)).getShadowRoot();
        ReusableMethods.waitFor(1);
        return shadow.findElement(By.cssSelector(".select-text"));
    }


    // Locator for the "Last Week" element
    @FindBy(xpath = "//ion-radio[normalize-space()='Last week']")
    public WebElement lastWeek;

    // Locator for the "Today" element
    @FindBy(xpath = "//ion-radio[normalize-space()='Today']")
    public WebElement today;

    // Locator for the "Live" element
    @FindBy(xpath = "//ion-radio[normalize-space()='Live']")
    public WebElement live;

    @FindBy(xpath = "//ion-radio[normalize-space()='Yesterday']")
    public WebElement yesterday;


    //--------------------------------------------------------------------//
    //METHODS

}
