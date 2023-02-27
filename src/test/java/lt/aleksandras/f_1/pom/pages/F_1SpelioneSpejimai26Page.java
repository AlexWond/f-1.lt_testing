package lt.aleksandras.f_1.pom.pages;

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
    }

    private static void clickCloseAdvertisment() {
        try {
            Common.clickElement(Locator.F_1PageMain.buttonCloseAdvertisment);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    private static void clickCloseDraugasBanner() {
        Common.clickToCloseDraugasBanner();
    }

    private static boolean isDraugasBanner() {
        return Common.isDraugasLtBanner();
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
