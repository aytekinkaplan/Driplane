package driplane.tests;

import driplane.pages.DashboardUITest;
import driplane.pages.LoginUITest;
import driplane.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class Test008 {
    public static void main(String[] args) throws InterruptedException {
        LoginUITest test = new LoginUITest();
        DashboardUITest dashboardUITest = new DashboardUITest();
        test.loginProcess();
        System.out.println(dashboardUITest.defaultProjectLittleText.getText());
    }
}
