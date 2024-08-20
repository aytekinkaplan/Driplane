package driplane.tests;

import driplane.pages.DashboardUITest;
import driplane.pages.LoginUITest;
import driplane.utilities.Driver;

public class Test011 {
    public static void main(String[] args) throws InterruptedException {
        LoginUITest test = new LoginUITest();
        DashboardUITest dashboardUITest = new DashboardUITest();
        test.loginProcess();
        // settingsButton();
        dashboardUITest.settingsButton.click();

       System.out.println(Driver.getDriver().getCurrentUrl());

    }

}
