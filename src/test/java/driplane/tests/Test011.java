package driplane.tests;

import driplane.pages.DashboardUITest;
import driplane.utilities.ConfigurationReader;
import driplane.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.function.Function;

public class Test011 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("driplaneURL"));

        // FluentWait örneği oluştur
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30)) // Maksimum bekleme süresi
                .pollingEvery(Duration.ofSeconds(5)) // Her döngüde bekleme süresi
                .ignoring(NoSuchElementException.class); // Belirtilen istisnaları yoksay

        // "Ayarlar" düğmesini bulmak için FluentWait kullan
        WebElement settingsButton = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if(DashboardUITest.settingsButton.isDisplayed()) {
                    return DashboardUITest.settingsButton;
                } else {
                    return null;
                }
            }
        });

        // "Ayarlar" düğmesine tıkla
        settingsButton.click();

        // WebDriver'ı kapat
        driver.quit();
    }
}
