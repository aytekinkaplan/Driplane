package driplane.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtils {

    protected static WebDriver webDriver;

    //This method will take two parameters: WebElement, and WebDriver
    //When you pass the element, JS will click on that element
    public static void clickElementByJS(WebElement element) {
        if (webDriver != null) {
            JavascriptExecutor jsexecutor = ((JavascriptExecutor) webDriver);
            jsexecutor.executeScript("arguments[0].click();", element);
        } else {
            System.out.println("WebDriver is not initialized!");
        }
    }

    //to get the page title with JS
    public static String getTitleByJS() {
        if (webDriver != null) {
            JavascriptExecutor jsexecutor = ((JavascriptExecutor) webDriver);
            return jsexecutor.executeScript("return document.title;").toString();
        } else {
            return null;
        }
    }

    //Scrolling all the way down
    public static void scrollDownByJS() {
        if (webDriver != null) {
            JavascriptExecutor jsexecutor = ((JavascriptExecutor) webDriver);
            jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        } else {
            System.out.println("WebDriver is not initialized!");
        }
    }

    //Scroll all the way up of a page
    public static void scrollAllUpByJS() {
        if (webDriver != null) {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        } else {
            System.out.println("WebDriver is not initialized!");
        }
    }

    //Scroll into view with JS. THIS IS VERY USEFUL
    public static void scrollIntoViewJS(WebElement element) {
        if (webDriver != null) {
            JavascriptExecutor jsexecutor = (JavascriptExecutor) webDriver;
            jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        } else {
            System.out.println("WebDriver is not initialized!");
        }
    }

    public static void changeBackgroundColorByJS(String color, WebElement element) {
        if (webDriver != null) {
            JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) webDriver);
            javascriptExecutor.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("WebDriver is not initialized!");
        }
    }

    //Flashing the background color
    // https://www.rapidtables.org/tr/web/color/RGB_Color.html  bu siteden renk ayari yapilablir..Kirmizi- Yesil -Mavi
    public static void flash(WebElement element) {
        String bgColor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 5; i++) {
            changeBackgroundColorByJS("rgb(0,200,0)", element);
            changeBackgroundColorByJS(bgColor, element);
        }
    }

    //this will generate an alert when needed
    public static void generateAlert(String message) throws InterruptedException {
        if (webDriver != null) {
            JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) webDriver);
            javascriptExecutor.executeScript("alert('" + message + "')");
            Thread.sleep(3000);
        } else {
            System.out.println("WebDriver is not initialized!");
        }
    }

    /*
     * executes the given JavaScript command on a given web element
     */
    public static void executeJScommand(WebElement element, String command) {
        if (webDriver != null) {
            JavascriptExecutor jse = (JavascriptExecutor) webDriver;
            jse.executeScript(command, element);
        } else {
            System.out.println("WebDriver is not initialized!");
        }
    }

    /*
     * executes the given JavaScript command on given web element
     */
    public static void executeJScommand(String command) {
        if (webDriver != null) {
            JavascriptExecutor jse = (JavascriptExecutor) webDriver;
            jse.executeScript(command);
        } else {
            System.out.println("WebDriver is not initialized!");
        }
    }

    //    Set the value of an input using js executor. Params: WebElement element, String text
//    This method changes the value attribute of an element.
//    It changes the input text
    public static void setValueByJS(WebElement element, String text) {
        if (webDriver != null) {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
        } else {
            System.out.println("WebDriver is not initialized!");
        }
    }

    //    get the value of an input. param: idOfElement
    public static String getValueByJS(String idOfElement) {
        if (webDriver != null) {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            return js.executeScript("return document.getElementById('" + idOfElement + "').value").toString();
        } else {
            System.out.println("WebDriver is not initialized!");
            return null;
        }
    }

    public static void addBorderWithJS(WebElement element, String borderStyle) {
        if (webDriver != null) {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            js.executeScript("arguments[0].style.border='" + borderStyle + "'", element);
        } else {
            System.out.println("WebDriver is not initialized!");
        }
    }
}
