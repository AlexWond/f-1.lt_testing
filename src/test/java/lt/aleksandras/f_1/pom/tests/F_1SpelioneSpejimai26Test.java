package lt.aleksandras.f_1.pom.tests;

import lt.aleksandras.f_1.pom.pages.F_1PageMainPage;
import lt.aleksandras.f_1.pom.pages.F_1SpelioneSpejimai26Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class F_1SpelioneSpejimai26Test extends BaseTest {

    @BeforeMethod
    @Override
    public void setup() {
        F_1SpelioneSpejimai26Page.set();
        F_1PageMainPage.open();
        logginIn("qwerty0001", "paswordas");
        F_1SpelioneSpejimai26Page.open();
    }

    private void logginIn(String userName, String password) {
        F_1PageMainPage.closeAdsAndCookies();
        F_1PageMainPage.clickPrisijungtiButton();
        F_1PageMainPage.inputLoginUserName(userName);
        F_1PageMainPage.inputLoginPassword(password);
        F_1PageMainPage.clickLoginPrisijungti();
        F_1PageMainPage.sleep(3000);
    }

    @DataProvider(name = "dataProviderTestFillGuessForm")
    public Object[][] dataProviderRacersSelected() {
        return new Object[][]{
                {"23", "16", "55", "63", "31", "14", "66", "18", "4", "44", "2", "44"}
        };
    }

    @Test(dataProvider = "dataProviderTestFillGuessForm")
    public void testPositiveFillGuessForm(String[] number) {
        String expectedResult = "Jūsų spėjimas";
        String actualResult;

        F_1SpelioneSpejimai26Page.closeAds();
        F_1SpelioneSpejimai26Page.selectRacerFromDropDownListPP(number[0]);
        for (int place = 1; place <= number.length-2; place++) {
            F_1SpelioneSpejimai26Page.selectRacerFromDropDownList(place, number[place]);
        }
        F_1SpelioneSpejimai26Page.selectRacerFromDropDownListFastest(number[number.length-1]);
        F_1SpelioneSpejimai26Page.clickButtonPatvirtinti();

        actualResult = F_1SpelioneSpejimai26Page.readMessage();

        F_1SpelioneSpejimai26Page.sleep(3000);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
