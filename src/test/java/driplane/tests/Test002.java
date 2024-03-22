package driplane.tests;

import driplane.pages.LoginUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import driplane.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;

public class Test002 {
    public static void main(String[] args) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
        LoginUITest test = new LoginUITest();
        test.loginProcess();
        //This Element is inside single shadow DOM.
        String cssSelectorForHost1 = ".ios.in-item.has-value.label-floating.has-placeholder.ion-focusable.select-ltr.select-label-placement-floating.hydrated";
        Thread.sleep(1000);
        SearchContext shadow = Driver.getDriver().findElement(By.cssSelector(".ios.in-item.has-value.label-floating.has-placeholder.ion-focusable.select-ltr.select-label-placement-floating.hydrated")).getShadowRoot();
        Thread.sleep(1000);
        System.out.println(shadow.findElement(By.cssSelector(".select-text")).getText());
    }
}

