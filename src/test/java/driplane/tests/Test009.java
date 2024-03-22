package driplane.tests;

import driplane.pages.DashboardUITest;
import driplane.pages.LoginUITest;
import driplane.utilities.Driver;
import org.openqa.selenium.By;

public class Test009 {
    public static void main(String[] args) throws InterruptedException {
        LoginUITest test = new LoginUITest();
        DashboardUITest dashboardUITest = new DashboardUITest();
        test.loginProcess();
        String string = Driver.getDriver().findElement(By.cssSelector("#main-content > app-project > ion-header > ion-toolbar > ion-title")).getShadowRoot()
                .findElement(By.cssSelector(".toolbar-title")).getText();
        System.out.println(string);
    }
}
