package driplane.tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import driplane.utilities.Driver;

import java.util.List;

public class Test001 {
    @Test
    public void test001() {
        Driver.getDriver().get("https://www.etsy.com/");
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().get("https://www.netflix.com/tr/");
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().navigate().back();
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().navigate().forward();
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().navigate().back();
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().navigate().forward();
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().navigate().back();
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().navigate().forward();
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().navigate().back();
        System.out.println(Driver.getDriver().getTitle());
        Driver.getDriver().navigate().forward();
        System.out.println(Driver.getDriver().getTitle());
    }

    @Test
    public void test002() {
        Driver.getDriver().get("https://www.etsy.com");
        WebElement webElement = Driver.getDriver().findElement(By.xpath("//li[1]//a[1]//div[1]//div[1]//img[1]"));
        webElement.click();
        List<WebElement> links = Driver.getDriver().findElements(By.tagName("div"));
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
    }
}
