package lt.aleksandras.f_1.pom.pages;

import lt.aleksandras.f_1.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Common {

    public static void setDriver() {
        Driver.setDriver();
    }

    public static void openUrl(String url) {
        Driver.getDriver().get(url);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void selectOptionByValue(By locator, String number) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByValue(number);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public static boolean isElement(By locator) {
        try {
            getElement(locator);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public static void clickToClose(By locator) {
        try {
            clickElement(locator);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public static void waitForElementToBeClickable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static String getUrl() {
        return Driver.getDriver().getCurrentUrl();
    }

    public static void switchToChildWindow() {
        String mainWindow = Driver.getDriver().getWindowHandle();
        Set<String> s1 = Driver.getDriver().getWindowHandles();

        for (String actual : s1) {
            if (!actual.equalsIgnoreCase(mainWindow)) {
                Driver.getDriver().switchTo().window(actual);
            }
        }
    }

    public static void waitElementToBeReadable(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
