package lt.aleksandras.f_1.pom.pages;

import lt.aleksandras.f_1.pom.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;

public class F_1PageMainPage {

    public static void set() {
        Common.setDriver();
    }

    public static void open() {
        Common.openUrl("https://www.f-1.lt/");
    }

    public static void clickPrisijungtiButton() {
        Common.clickElement(
                Locator.F_1PageMain.buttonPrisijungti
        );
    }

    private static void clickCloseAdvertisment() {
        try {
            Common.clickElement(Locator.F_1PageMain.buttonCloseAdvertisment);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (ElementClickInterceptedException e) {
            e.printStackTrace();
        }
    }

    private static void clickSupratauCookiesButton() {
        try {
            Common.clickElement(Locator.F_1PageMain.buttonSupratauCookies);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (ElementClickInterceptedException e) {
            e.printStackTrace();
        } catch (ElementNotInteractableException e) {
            e.printStackTrace();
        }
    }

    public static void clickRegistruokitesButton() {
        Common.clickElement(
                Locator.F_1PageMain.buttonRegistruokites
        );
    }

    public static boolean isRegistrationForm() {
        return Common.isElement(Locator.F_1PageMain.registrationForm);
    }

    private static boolean isDraugasBanner() {
        return Common.isElement(Locator.F_1PageMain.bannerDraugasLt);
    }

    private static void clickCloseDraugasBanner() {
        Common.clickToClose(Locator.F_1PageMain.bannerDraugas);
    }

    public static void inputUserName(String userName) {
        Common.waitForElementToBeClickable(Locator.F_1PageMain.userNameInput);
        Common.sendKeysToElement(
                Locator.F_1PageMain.userNameInput,
                userName
        );
    }

    public static void inputEmail(String email) {
        Common.waitForElementToBeClickable(Locator.F_1PageMain.emailInput);
        Common.sendKeysToElement(
                Locator.F_1PageMain.emailInput,
                email
        );
    }

    public static void inputPassword(String password) {
        Common.waitForElementToBeClickable(Locator.F_1PageMain.passwordInput);
        Common.sendKeysToElement(
                Locator.F_1PageMain.passwordInput,
                password
        );
    }

    public static void inputConfirmPassword(String confirmPassword) {
        Common.waitForElementToBeClickable(Locator.F_1PageMain.passwordConfirmInput);
        Common.sendKeysToElement(
                Locator.F_1PageMain.passwordConfirmInput,
                confirmPassword
        );
    }

    public static void clickRegisterButton() {
        Common.clickElement(
                Locator.F_1PageMain.registerButton
        );
    }

    public static String readMessage() {
        Common.waitElementToBeReadable(Locator.F_1PageMain.registerMessage);
        return Common.getElementText(
                Locator.F_1PageMain.registerMessage
        );
    }

    public static void sleep(int millisec) {
        Common.sleep(millisec);
    }

    public static void inputLoginUserName(String userName) {
        Common.waitForElementToBeClickable(Locator.F_1PageMain.loginUserName);
        Common.sendKeysToElement(
                Locator.F_1PageMain.loginUserName,
                userName
        );
    }

    public static void inputLoginPassword(String password) {
        Common.waitForElementToBeClickable(Locator.F_1PageMain.loginPassword);
        Common.sendKeysToElement(
                Locator.F_1PageMain.loginPassword,
                password
        );
    }

    public static void clickLoginPrisijungti() {
        Common.waitForElementToBeClickable(Locator.F_1PageMain.loginPrisijungit);
        Common.clickElement(Locator.F_1PageMain.loginPrisijungit);
    }

    public static String readUserName() {
        Common.waitElementToBeReadable(Locator.F_1PageMain.loggedInUserName);
        return Common.getElementText(Locator.F_1PageMain.loggedInUserName);
    }

    public static void closeAdsAndCookies() {
        if (isDraugasBanner()) {
            clickCloseDraugasBanner();
        }
        clickCloseAdvertisment();
        clickSupratauCookiesButton();
        for (int j = 1; j < 8; j++) {
            if (j == 2 || j == 4) continue;
            Driver.getDriver().switchTo().frame("aswift_" + j);
            Common.isElement(Locator.F_1PageMain.buttonCloseAswift(1));
            Common.clickToClose(Locator.F_1PageMain.buttonCloseAswift(1));
            Driver.getDriver().switchTo().defaultContent();
        }
    }
}
