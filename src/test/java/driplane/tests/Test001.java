package driplane.tests;

import com.github.javafaker.Faker;
import driplane.pages.LoginUITest;
import driplane.utilities.ConfigurationReader;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import driplane.utilities.Driver;

import java.lang.module.Configuration;
import java.util.List;

public class Test001 {
    @Test
    public void test001() {
        Faker faker = new Faker();
        LoginUITest loginUITest = new LoginUITest();
        Driver.getDriver().get(ConfigurationReader.getProperty("driplaneURL"));
        for (int i = 0; i < 200; i++) {
            loginUITest.emailInput.sendKeys(faker.internet().emailAddress());
            loginUITest.passwordInput.sendKeys(faker.internet().password());
            loginUITest.loginButton.click();
            String actualUrl = Driver.getDriver().getCurrentUrl();
            if (actualUrl.contains("/projects")) {
                System.out.println("Giriş başarılı!");
            } else {
                System.out.println("Giriş başarısız!");
            }
        }
    }

}
