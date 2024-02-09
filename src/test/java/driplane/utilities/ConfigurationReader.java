package driplane.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    /*
    The ConfigReader class facilitates communication between test methods
    and the Configuration.properties file.
    This class contains a static method for easy access from test classes.
    Since the method is static, the variable we call from within the method
    should also be static. We use a static block to assign the initial value
    to the static variable (instantiate).

    This class creates a Properties instance to hold the configuration properties.
    The path of the configuration file is defined, and the file is read using a
    FileInputStream within a static block. The data read from the file is loaded
    into the Properties instance, and the file is closed.

    The getProperty method retrieves the value associated with a given key from
    the Properties instance, allowing us to read the configuration file easily.
    */

    public static Properties properties;   // Create Properties instance

    static {
        String filePath = "configuration.properties";  // Path of the configuration file
        try {
            FileInputStream fis = new FileInputStream(filePath);
            // fis reads the file path defined in the configuration.properties file
            properties = new Properties();
            properties.load(fis); // Load the information read by fis into properties
            // Close the file
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        /*
        This method takes the string key value sent from the test method
        and uses the getProperty() method from the Properties class
        to retrieve the String data-type value associated with this key.
        We create this method to read the file.
        */
        return properties.getProperty(key);
    }
}
