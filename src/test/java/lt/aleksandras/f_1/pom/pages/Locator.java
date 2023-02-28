package lt.aleksandras.f_1.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class F_1PageMain {

        public static By buttonPrisijungti = By.xpath("//a[@data-target='#login']");
        public static By buttonCloseAdvertisment = By.xpath("(//img[@id])[1]");
        public static By buttonSupratauCookies = By.xpath("//a[@aria-label='dismiss cookie message']");
        public static By buttonRegistruokites = By.xpath("//a[@id='register-modal-trigger']");
        public static By registrationForm = By.xpath("(//div[@class='modal-content'])[2]");
        public static By bannerDraugasLt = By.xpath("//iframe[@name='draugas']");
        public static
        By bannerDraugas
                = By.xpath(
                "//a[@style='position: absolute; top: 0px; left: 0px; bottom: 0px; right: 0px;" +
                        " z-index: 9999999999; cursor: pointer;']");
        public static By userNameInput = By.xpath("//input[@id='register-username']");
        public static By emailInput = By.xpath("//input[@id='register-email']");

        public static By passwordInput = By.xpath("//input[@id='register-password']");
        public static By passwordConfirmInput = By.xpath("//input[@id='register-confirm-password']");
        public static By registerButton = By.xpath("//button[@id='register-button']");
        public static By registerMessage = By.xpath("//div[@id='register-error']");
        public static By loginUserName = By.xpath("//input[@id='login-username']");
        public static By loginPassword = By.xpath("//input[@id='login-password']");
        public static By loginPrisijungit = By.xpath("//button[@id='login-button']");
        public static By loggedInUserName = By.xpath("//li[@class='hidden-mobile login-user-username']");
    }

    public static class F_1SpelioneSpejimai26 {

        public static By polePosition = By.xpath("//select[@name='pp']");
        public static By fastestLap = By.xpath("//select[@name='fl']");
        public static By buttonPatvirtinti = By.xpath("//button[@type='submit']");
        public static By guessConfirmMessage = By.xpath("//div[@class='alert alert-success']");
        public static By selectedValuePP = By.xpath("(//select[@name='pp']//option[@selected])[2]");
        public static By bannerDraugasLt = By.xpath("//iframe[@name='draugas']");
        public static By bannerDraugas = By.xpath("//a[@style='position: absolute; top: 0px; left: 0px;" +
                " bottom: 0px; right: 0px; z-index: 9999999999; cursor: pointer;']");
        public static By buttonCloseAdvertisment = By.xpath("(//img[@id])[1]");
        public static By buttonSupratauCookies = By.xpath("//a[@aria-label='dismiss cookie message']");


        public static By placePosition(int place) {
            return By.xpath("//select[@name='" + place + "']");
        }
    }

    public static class F_1Tvarkarastis {

        public static By buttonBahreinTickets = By.xpath("//td[@title='Sakhiro']/a");

        public static By buttons(int i) {
            return By.xpath("(//td[@title]/a)[" + i + "]");
        }
    }
}
