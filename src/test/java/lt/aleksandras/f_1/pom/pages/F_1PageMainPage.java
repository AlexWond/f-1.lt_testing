package lt.aleksandras.f_1.pom.pages;

import org.openqa.selenium.ElementClickInterceptedException;
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
        }
    }

    public static void clickRegistruokitesButton() {
        Common.clickElement(
                Locator.F_1PageMain.buttonRegistruokites
        );
    }

    public static boolean isRegistrationForm() {
        return Common.isRegistrationFormPresent();
    }

    private static boolean isDraugasBanner() {
        return Common.isDraugasLtBanner();
    }

    private static void clickCloseDraugasBanner() {
        Common.clickToCloseDraugasBanner();
    }

    public static void inputUserName(String userName) {
        Common.sendKeysToElement(
                Locator.F_1PageMain.userNameInput,
                userName
        );
    }

    public static void inputEmail(String email) {
        Common.sendKeysToElement(
                Locator.F_1PageMain.emailInput,
                email
        );
    }

    public static void inputPassword(String password) {
        Common.sendKeysToElement(
                Locator.F_1PageMain.passwordInput,
                password
        );
    }

    public static void inputConfirmPassword(String confirmPassword) {
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
        return Common.getElementText(
                Locator.F_1PageMain.registerError
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
        Common.sendKeysToElement(
                Locator.F_1PageMain.loginPassword,
                password
        );
    }

    public static void clickLoginPrisijungti() {
        Common.clickElement(Locator.F_1PageMain.loginPrisijungit);
    }

    public static String readUserName() {
        return Common.getElementText(Locator.F_1PageMain.loggedInUserName);
    }

    public static void closeAdsAndCookies() {
        if (isDraugasBanner()) {
            clickCloseDraugasBanner();
        }
        clickCloseAdvertisment();
        clickSupratauCookiesButton();
    }
}
