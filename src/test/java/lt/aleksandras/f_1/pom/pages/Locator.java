package lt.aleksandras.f_1.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class F_1PageMain {

        public static By buttonPrisijungti = By.xpath("//a[@data-target='#login']");
        public static By buttonCloseAdvertisment = By.xpath("//img[@id]");
        public static By buttonSupratauCookies = By.xpath("//a[@aria-label='dismiss cookie message']");
        public static By buttonRegistruokites = By.xpath("//a[@id='register-modal-trigger']");
        public static By registrationForm = By.xpath("(//div[@class='modal-content'])[2]");
        public static By bannerDraugasLt = By.xpath("//iframe[@name='draugas']");
        public static
        By bannerOverlay
                = By.xpath(
                        "//a[@style='position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px; z-index: 9999999999; cursor: pointer;']");
    }
}
