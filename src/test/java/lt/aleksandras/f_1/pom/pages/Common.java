package lt.aleksandras.f_1.pom.pages;

import lt.aleksandras.f_1.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

    public static boolean isRegistrationFormPresent() {
        try {
            getElement(Locator.F_1PageMain.registrationForm);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public static boolean isDraugasLtBanner() {
        try {
            getElement(Locator.F_1PageMain.bannerDraugasLt);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public static void clickToCloseDraugasBanner() {
        try {
            clickElement(Locator.F_1PageMain.bannerDraugas);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
