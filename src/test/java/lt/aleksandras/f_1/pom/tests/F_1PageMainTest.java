package lt.aleksandras.f_1.pom.tests;

import lt.aleksandras.f_1.pom.pages.F_1PageMainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class F_1PageMainTest extends BaseTest{
    @BeforeMethod
    @Override
    public void setup() {
        F_1PageMainPage.open();
    }

    @Test
    public void testIsInstanceOfRegistrationForm() {

        boolean expectedResult = true;
        boolean actualResult;

        closeAdsAndCookies();
        F_1PageMainPage.clickPrisijungtiButton();
        F_1PageMainPage.clickRegistruokitesButton();
        actualResult = F_1PageMainPage.isRegistrationForm();

        Assert.assertEquals(actualResult, expectedResult);
    }

    public void closeAdsAndCookies(){
        if (F_1PageMainPage.isDraugasBanner()) {
            F_1PageMainPage.clickCloseOverlayElement();
        }

        F_1PageMainPage.clickCloseAdvertisment();
        F_1PageMainPage.clickSupratauCookiesButton();
    }

}
