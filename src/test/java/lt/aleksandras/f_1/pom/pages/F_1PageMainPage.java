package lt.aleksandras.f_1.pom.pages;

public class F_1PageMainPage {

    public static void open() {
        Common.openUrl("https://www.f-1.lt/");
    }

    public static void clickPrisijungtiButton() {
        Common.clickElement(
                Locator.F_1PageMain.buttonPrisijungti
        );
    }

    public static void clickCloseAdvertisment() {
        Common.clickElement(
                Locator.F_1PageMain.buttonCloseAdvertisment
        );
    }

    public static void clickSupratauCookiesButton() {
        Common.clickElement(
                Locator.F_1PageMain.buttonSupratauCookies
        );
    }

    public static void clickRegistruokitesButton() {
        Common.clickElement(
                Locator.F_1PageMain.buttonRegistruokites
        );
    }

    public static boolean isRegistrationForm() {
        return Common.isRegistrationFormPresent();
    }

    public static boolean isDraugasBanner() {
        return Common.isDraugasLtBanner();
    }

    public static void clickCloseOverlayElement() {
        Common.clickToCloseOverlayElement();
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
}
