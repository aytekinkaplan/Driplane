package triofan.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

/*
   In the Page Object Model (POM), instead of extending the TestBase class for Driver,
   static methods from the Driver class are used to create and configure the driver,
   and finally, close the driver at the end. To prevent the instantiation of the Driver
   class through object creation, the Singleton pattern is implemented.
   Singleton Pattern: Used to ensure that a class has only one instance,
   and it provides a global point to this instance.
   To achieve this, we simply make the constructor private,
   preventing object creation from outside classes. Driver instances are created
   using the getDriver() method.
*/

public class Driver {
    // Create a private static WebDriver object
    private static WebDriver driver;

    // Private constructor to enforce Singleton pattern
    private Driver() {
        // Constructor of Driver - private to prevent instantiation
    }

    // Create the getDriver method to create and initiate the driver instance
    public static WebDriver getDriver() {
        if (driver == null) {
            // Ensure only one driver instance is created
            switch (ConfigurationReader.getProperty("browser")) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
            }
        }

        // Configure driver settings (implicit wait, maximize window, etc.)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }

    // Create a closeDriver method to close the driver
    public static void closeDriver() {
        // Quit the driver if it is not null (pointing to chromedriver, firefoxdriver, etc.)
        if (driver != null) {
            driver.quit();
            driver = null; // Set driver to null after quitting
        }
    }
}
