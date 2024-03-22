package driplane.tests;

import driplane.pages.DashboardUITest;
import driplane.pages.LoginUITest;
import driplane.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class Test006 {
    public static void main(String[] args) throws InterruptedException {
        LoginUITest test = new LoginUITest();
        DashboardUITest dashboardUITest = new DashboardUITest();
        test.loginProcess();
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = ".ios.title-default.hydrated";
        Thread.sleep(1000);
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
        Thread.sleep(1000);
        System.out.println(shadow.findElement(By.cssSelector(".toolbar-title")).getText());
    }
}
