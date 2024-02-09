package driplane.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driplane.utilities.Driver;

public class DefaultProjectDashboardUITest {
    public DefaultProjectDashboardUITest() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    //LOGIN PAGE ATTEMPTING TO LOGIN
    @FindBy(xpath = "//*[@id=\"ion-input-2\"]")
    public WebElement emailInputArea;

    @FindBy(xpath = "//input[@id='ion-input-3']")
    public WebElement passwordArea;

    @FindBy(xpath = "//app-login//ion-button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/app-project/ion-header/ion-toolbar[1]/ion-title")

    public WebElement defaultProjectDashboardText;


    @FindBy(xpath = "//*[@id=\"main-content\"]/app-project/ion-header/ion-toolbar[2]/ion-segment/ion-segment-button[1]")

    public WebElement LIVE;
    @FindBy(xpath = "//*[@id=\"main-content\"]/app-project/ion-header/ion-toolbar[2]/ion-segment/ion-segment-button[2]")

    public WebElement TODAY;

    @FindBy(xpath = "//*[@id=\"main-content\"]/app-project/ion-header/ion-toolbar[2]/ion-segment/ion-segment-button[3]")

    public WebElement YESTERDAY;

    @FindBy(xpath = "//*[@id=\"main-content\"]/app-project/ion-header/ion-toolbar[2]/ion-segment/ion-segment-button[4]")

    public WebElement LASTWEEK;
    @FindBy(xpath = "//*[@id=\"main-content\"]/app-project/ion-header/ion-toolbar[2]/ion-segment/ion-segment-button[5]")

    public WebElement LASTMONTH;

    @FindBy(xpath = "//*[@id=\"inbox-list\"]/ion-list-header")
    public WebElement inboxListHeader;

    @FindBy(xpath = "//ion-split-pane/ion-menu/ion-content/ion-list/ion-note")
    public WebElement userDomainCom;

    @FindBy(xpath = "//*[@id=\"inbox-list\"]/ion-menu-toggle/ion-item[1]/ion-label")
    public WebElement dashboard;

    @FindBy(xpath = "//*[@id=\"inbox-list\"]/ion-menu-toggle/ion-item[2]/ion-label")
    public WebElement settings;

    @FindBy(xpath = "//ion-footer/ion-list/ion-item/ion-label")
    public WebElement signOut;

    @FindBy(xpath = "//*[@id=\"main-content\"]//ion-card/ion-card-header/ion-card-title")
    public WebElement noData;

    @FindBy(xpath = "//*[@id=\"main-content\"]//ion-card-content/p")
    public WebElement didYouAddYourTrackerCodeToYourWebsite;

    @FindBy(xpath = "//*[@id=\"main-content\"]//ion-button")
    public WebElement addNowButton;

    @FindBy(xpath = "//*[@id=\"main-content\"]/app-settings/ion-content/ion-card[1]/ion-card-header/ion-card-title")
    public WebElement projectInfo;

    @FindBy(xpath = "//*[@id=\"main-content\"]/app-settings/ion-content/ion-card[1]/ion-list/ion-item[1]/ion-label/h2")
    public WebElement projectName;
    @FindBy(xpath = "//*[@id=\"main-content\"]/app-settings/ion-content/ion-card[1]/ion-list/ion-item[1]/ion-label/p")
    public WebElement defaultProject;

    @FindBy(xpath = "//*[@id=\"main-content\"]//ion-card[1]//ion-item[2]//h2")
    public WebElement projectClientID;

    @FindBy(xpath = "//*[@id=\"main-content\"]//ion-card[1]//ion-item[2]//p")
    public WebElement iDText;

    @FindBy(xpath = "//*[@id=\"main-content\"]//ion-card[1]//ion-item[3]//h2")
    public WebElement projectClientSecret;

    @FindBy(xpath = "//*[@id=\"main-content\"]//ion-card[1]//ion-item[3]//p")
    public WebElement PCSLongText;


    @FindBy(xpath = "//*[@id=\"main-content\"]//ion-card[2]//ion-card-title")
    public WebElement projectKeys;
}
