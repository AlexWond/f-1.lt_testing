package lt.aleksandras.f_1.pom.pages;

public class F_1TvarkarastisPage {

    public static void set() {
        Common.setDriver();
    }

    public static void open() {
        Common.openUrl("https://www.f-1.lt/tvarkarastis");
    }

    public static void clickBahreinTicketsButton() {
        Common.clickElement(
                Locator.F_1Tvarkarastis.buttonBahreinTickets
        );
    }

    public static void waitTicketButtonsToBeClickable() {
        for (int i = 1; i <= 23; i++) {
            Common.waitForElementToBeClickable(
                    Locator.F_1Tvarkarastis.buttons(i)
            );
        }
    }

    public static String getPageUrl() {
        return Common.getUrl();
    }

    public static void switchToBahreinWindow() {
        Common.switchToChildWindow();
    }
}
