package driplane.tests;

import driplane.pages.DashboardUITest;
import driplane.pages.LoginUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;

public class Test005 {
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
        LoginUITest loginUITest = new LoginUITest();
        DashboardUITest dashboardUITest = new DashboardUITest();
        loginUITest.loginProcess();
        System.out.println(dashboardUITest.dashboardButton.isEnabled() ? "Dashboard Button is enabled" : "Dashboard Button is not enabled");
    }
}
