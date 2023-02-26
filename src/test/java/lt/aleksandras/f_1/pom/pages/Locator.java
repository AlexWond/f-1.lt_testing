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
                        "//a[@style='position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px;" +
                                " z-index: 9999999999; cursor: pointer;']");
        public static By userNameInput = By.xpath("//input[@id='register-username']");
        public static By emailInput = By.xpath("//input[@id='register-email']");

        public static By passwordInput = By.xpath("//input[@id='register-password']");
        public static By passwordConfirmInput = By.xpath("//input[@id='register-confirm-password']");
        public static By registerButton = By.xpath("//button[@id='register-button']");
        public static By registerError = By.xpath("//div[@id='register-error']");
    }
}
