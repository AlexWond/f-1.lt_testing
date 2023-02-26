package lt.aleksandras.f_1.pom.pages;

import lt.aleksandras.f_1.pom.utils.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

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

    private static List<WebElement> getElements(By locator) {
        return Driver.getDriver().findElements(locator);
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

    public static void selectOptionByValue(By locator, String day) {
        WebElement element = getElement(locator);
        Select select = new Select(element);
        select.selectByValue(day);
    }

    public static List<Boolean> getSelectedStatusOfAllCheckboxes(By locator) {
        List<WebElement> elements = getElements(locator);
        List<Boolean> elementStatuses = new ArrayList<>();

        for (WebElement element : elements) {
            elementStatuses.add(element.isSelected());
        }
        return elementStatuses;
    }

    public static String getElementAttributeOutcome(By locator, String attributeName) {
        return getElement(locator).getAttribute(attributeName);
    }

    public static void acceptAlert() {
        Driver.getDriver().switchTo().alert().accept();
    }

    public static void dismissAlert() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    public static boolean isAlertPresent() {
        try {
            Driver.getDriver().switchTo().alert();
        } catch (NoAlertPresentException e) {
            return false;
        }
        return true;
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

    public static boolean isAswift8Host() {
        try {
            getElement(Locator.F_1PageMain.bannerAswift8Host);
        } catch (NoSuchElementException e) {
            return false;
        } catch (ElementNotInteractableException e) {
            return false;
        }
        return true;
    }

    public static void clickToCloseAswift8Host() {
        try {
            clickElement(Locator.F_1PageMain.bannerAswift8Host);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (ElementNotInteractableException e) {
            e.printStackTrace();
        }
    }

    public static void switchToIFrame() {
        Driver.getDriver().switchTo().frame(Locator.F_1PageMain.aswift1);
    }

    public static void clickCloseAswift1Host() {
        clickElement(Locator.F_1PageMain.closeAswift1Host);
    }

    public static void returnToMainWindow() {
        Driver.getDriver().switchTo().defaultContent();
    }

}
