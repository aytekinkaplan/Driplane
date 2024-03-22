package driplane.tests;

import driplane.pages.LoginUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class Test004 {
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
        LoginUITest test = new LoginUITest();
        test.loginProcess();
        String cssSelectorForHost1 = ".ng-untouched.ng-pristine.ng-valid.ion-untouched.ion-pristine.ion-valid.ios.has-value.ion-focusable.select-ltr.select-justify-space-between.select-label-placement-start.hydrated";
        Thread.sleep(1000);
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector(".select-text"));
        System.out.println(shadow.findElement(By.cssSelector(".select-text")).getText());
    }
}

