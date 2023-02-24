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
        Common.clickToCloseElement();
    }

}
