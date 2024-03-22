package driplane.tests;

import driplane.pages.DashboardUITest;
import driplane.pages.LoginUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Test003 {
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
        LoginUITest test = new LoginUITest();
        DashboardUITest dashboardUITest = new DashboardUITest();
        test.loginProcess();

        dashboardUITest.driplaneTextVisible();


    }
}
