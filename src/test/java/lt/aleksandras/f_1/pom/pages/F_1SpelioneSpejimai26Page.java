package lt.aleksandras.f_1.pom.pages;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;

public class F_1SpelioneSpejimai26Page {

    public static void set() {
        Common.setDriver();
    }

    public static void open() {
        Common.openUrl("https://www.f-1.lt/spelione/spejimai/26");
    }

    public static void sleep(int millisec) {
        Common.sleep(millisec);
    }

    public static void closeAds() {
        if (isDraugasBanner()) {
            clickCloseDraugasBanner();
        }
        clickCloseAdvertisment();
        clickSupratauCookiesButton();
    }

    private static void clickSupratauCookiesButton() {
        try {
            Common.clickElement(Locator.F_1SpelioneSpejimai26.buttonSupratauCookies);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (ElementClickInterceptedException e) {
            e.printStackTrace();
        } catch (ElementNotInteractableException e) {
            e.printStackTrace();
        }
    }

    private static void clickCloseAdvertisment() {
        try {
            Common.clickElement(Locator.F_1SpelioneSpejimai26.buttonCloseAdvertisment);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    private static void clickCloseDraugasBanner() {
        Common.clickToClose(Locator.F_1SpelioneSpejimai26.bannerDraugas);
    }

    private static boolean isDraugasBanner() {
        return Common.isElement(Locator.F_1SpelioneSpejimai26.bannerDraugasLt);
    }

    public static void selectRacerFromDropDownListPP(String number) {
        Common.selectOptionByValue(
                Locator.F_1SpelioneSpejimai26.polePosition,
                number
        );
    }

    public static void selectRacerFromDropDownList(int place, String number) {
        Common.selectOptionByValue(
                Locator.F_1SpelioneSpejimai26.placePosition(place),
                number
        );
    }

    public static void selectRacerFromDropDownListFastest(String number) {
        Common.selectOptionByValue(
                Locator.F_1SpelioneSpejimai26.fastestLap,
                number
        );
    }

    public static void clickButtonPatvirtinti() {
        Common.clickElement(
                Locator.F_1SpelioneSpejimai26.buttonPatvirtinti
        );
    }

    public static String readMessage() {
        return Common.getElementText(
                Locator.F_1SpelioneSpejimai26.guessConfirmMessage
        );
    }

    public static String readMessageSelectedValuePP() {
        return Common.getElementText(
                Locator.F_1SpelioneSpejimai26.selectedValuePP
        );
    }
}
