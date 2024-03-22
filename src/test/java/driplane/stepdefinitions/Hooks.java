package driplane.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static driplane.utilities.ReusableMethods.takeScreenshot;
import driplane.utilities.Driver;

public class Hooks {

    @BeforeMethod // her test metodu çalışmadan önce
    public void setUp() {
        System.out.println("Test başlıyor..");
        // Burada gerekirse test başlangıcı için yapılabilecek işlemler yapılabilir
    }

    @AfterMethod // her test metodu çalıştıktan sonra
    public void tearDown(ITestResult result) throws IOException {
        System.out.println("Test tamamlandı, temizlik yapılıyor..");
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Test başarısız oldu");
            // Senaryo başarısız olduğunda ekran görüntüsü al
            takeScreenshot(result.getName());
            // Senaryo başarısız olduğunda ekran görüntüsünü rapora ekle
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            System.out.println("Başarısız senaryo için ekran görüntüsü alındı: " + result.getName());
        }
        // Test sonunda browser kapat
        Driver.closeDriver();
    }
}
