import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Setup {
    // WebDriver'ı sınıf seviyesinde tanımla
    static WebDriver driver;

    @BeforeClass
    public static void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        // WebDriver'ı initialize et
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        // WebDriver'ı kapat
        if (driver != null) {
            driver.quit();
        }
    }
}
