import org.junit.Test;
import org.openqa.selenium.By;

public class LoginUITest extends Setup {
    @Test
    public void loginUITestBefore() throws InterruptedException {
        driver.get("http://localhost:4200/login");

        System.out.println("Visibility of the \"Driplane:\" " +
                driver.findElement(By.xpath("//h1[normalize-space()='Driplane']")).isDisplayed());

        System.out.println("Visibility of the email input: " +
                driver.findElement(By.xpath("//input[@id='ion-input-0']")).isDisplayed());

        System.out.println("Visibility of the password input field: " +
                driver.findElement(By.xpath("//input[@id='ion-input-1']")).isDisplayed());

        System.out.println("Visibility of the login button: " +
                driver.findElement(By.xpath("//form/ion-button")).isDisplayed());

        System.out.println("\"RESET PASSWORD\" visibility: " +
                driver.findElement(By.xpath("//ion-item//ion-button[contains(@class, 'md') and contains(@class, 'button') and contains(@class, 'button-small') and contains(@class, 'button-clear') and contains(@class, 'ion-activatable') and contains(@class, 'ion-focusable') and contains(@class, 'hydrated')]")).isDisplayed());

        System.out.println("Visibility of the \"CREATE ACCOUNT\": " +
                driver.findElement(By.cssSelector("ion-item > ion-button.md.button.button-small.button-clear.ion-activatable.ion-focusable.hydrated")).isDisplayed());

    }

    @Test
    public void loginUITestAfter() throws InterruptedException {
        driver.get("http://localhost:4200/login");
        driver.findElement(By.xpath("//form/ion-button")).click();
        Thread.sleep(3000);

        System.out.println("Visibility of the validation message 'Please write a valid email address':" +
                driver.findElement(By.xpath("//p[normalize-space()='Please write a valid email address']")));

        System.out.println("Visibility of the form element with the label 'Write your password'" +
                driver.findElement(By.xpath("//p[normalize-space()='Write your password']")));
    }
}
