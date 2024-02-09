package driplane.stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import driplane.utilities.Driver;

import java.io.IOException;

import static driplane.utilities.ReusableMethods.takeScreenshot;


public class Hooks {
    @Before //her senaryodan once
    public void setUp(Scenario scenario) {
        System.out.println("senaryo basladi..");
        System.out.println("scenario id = " + scenario.getId());
        System.out.println("scenario name= " + scenario.getName());
    }

    @After //her senaryodan sonra
    public void tearDown(Scenario scenario) throws IOException {
        System.out.println("senaryodan sonra test ortami temizleniyor");
        if (scenario.isFailed()) {
            System.out.println("scenario failed");
            takeScreenshot(scenario.getName());
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "FailedScenarioScreenshot");
            System.out.println("Screenshot taken for failed scenario: " + scenario.getName());
        }
        // internet ortaminda raporlarinizi goruntulemek icin cucumber.properties dosyasi olustururz,
        // icine cucumber.publish.enabled = true yazariz.
        // Failed scenariolar icin console ciktisinda altta dikdortgen icersindeki rapor bilgileri cikar
        // ilk linke tiklayarak online ortamda raporunuzu goruntuleyebilirsnz
        // attach kismina tiklayarak da ekran goruntusunu gorebilirsnz

        Driver.closeDriver();
    }
}
