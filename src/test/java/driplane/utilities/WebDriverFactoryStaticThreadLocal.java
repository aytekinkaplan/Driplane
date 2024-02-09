package driplane.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactoryStaticThreadLocal {
    // ThreadLocal variable to hold the WebDriver instances for each thread
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Method to set up the WebDriver for the current thread
    public static void setDriver() {
        // Configures and sets the ChromeDriver for the current thread
        driver.set(new ChromeDriver());
    }

    // Method to get the WebDriver for the current thread
    public static WebDriver getDriver() {
        // Creates and sets a new ChromeDriver for the current thread if it does not exist
        driver.set(new ChromeDriver());
        // Returns the WebDriver instance for the current thread
        return driver.get();
    }

    // Method to close the browser for the current thread
    public static void closeBrowser() {
        // Closes the browser for the current thread
        driver.get().close();
        // Removes the ThreadLocal variable to avoid memory leaks
        driver.remove();
    }

    /*
       This code allows the usage of multiple threads.
       ThreadLocal is used to manage the WebDriver object.
       Each thread has its own WebDriver object, and the ThreadLocal variable stores each object independently.

       setDriver(): Configures and sets up the ChromeDriver for the current thread.
                    This method creates a WebDriver object specific to each thread.

       getDriver(): Gets the WebDriver object for the current thread.
                    If the object does not exist, it creates a new ChromeDriver and sets it.
                    This ensures each thread has its own WebDriver object.

       closeBrowser(): Closes the browser for the current thread and removes the ThreadLocal variable.
                       This ensures proper cleanup and prevents memory leaks.
    */
}
