import org.junit.Assert;
import org.junit.Test;

import java.sql.Driver;

public class LoginTest extends Setup{
    @Test
    public void loginTest() throws InterruptedException {
        driver.get("http://localhost:4200/");
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals("http://localhost:4200/login",driver.getCurrentUrl());
    }
}
