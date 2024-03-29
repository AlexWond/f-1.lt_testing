package lt.aleksandras.f_1.pom.tests;

import lt.aleksandras.f_1.pom.pages.F_1PageMainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class F_1PageMainTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        F_1PageMainPage.set();
        F_1PageMainPage.open();
        F_1PageMainPage.closeAdsAndCookies();
    }

    @DataProvider(name = "dataProviderTestNegativeRegistrationForm")
    public Object[][] dataProviderNegativeRegistrationForm() {
        return new Object[][]{
                {"gafgag", "asdfafd", "paswordas", "paswordas"},
                {"fsatav", "info@f-1.lt", "paswordas", "paswordas"},
                {" ", "info@jdghjd.lt", "paswordas", "paswordas"},
                {"xczvcz", "info@jdghjd.lt", "paswordas", "paswords"},
                {"Antanas", "info@fgzv.lt", "paswordas", "paswordas"},
        };
    }

    @DataProvider(name = "dataProviderTestPositiveRegistrationForm")
    public Object[][] dataProviderPositiveRegistrationForm() {
        return new Object[][]{
                {"Antanas113", "info@00013.lt", "paswordas", "paswordas"}
        };
    }

    @DataProvider(name = "dataProviderTestPositiveLogin")
    public Object[][] dataProviderPositiveLogin() {
        return new Object[][]{
                {"qwerty0001", "paswordas"}
        };
    }

    @Test
    public void testIsInstanceOfRegistrationForm() {

        boolean expectedResult = true;
        boolean actualResult;

        F_1PageMainPage.clickPrisijungtiButton();
        F_1PageMainPage.clickRegistruokitesButton();
        actualResult = F_1PageMainPage.isRegistrationForm();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(dataProvider = "dataProviderTestNegativeRegistrationForm")
    public void testNegativeRegistrationForm(String userName,
                                             String email,
                                             String password,
                                             String confirmPassword) {
        String negativeEmail = "Prašome įvesti tvarkingą el. pašto adresą";
        String existingEmail = "Vartotojas nurodytu el. pašto adresu jau egzistuoja";
        String blankInput = "Prašome užpildyti visus laukus";
        String differentConfirmPassword = "Nesutampa slaptažodis su pakartojimu";
        String existingUserName = "Vartotojas nurodytu vardu jau egzistuoja";

        String actualResult;

        F_1PageMainPage.clickPrisijungtiButton();
        F_1PageMainPage.clickRegistruokitesButton();
        F_1PageMainPage.inputUserName(userName);
        F_1PageMainPage.inputEmail(email);
        F_1PageMainPage.inputPassword(password);
        F_1PageMainPage.inputConfirmPassword(confirmPassword);
        F_1PageMainPage.clickRegisterButton();

        actualResult = F_1PageMainPage.readMessage();

        Assert.assertTrue(
                actualResult.equals(negativeEmail) ||
                        actualResult.equals(existingEmail) ||
                        actualResult.equals(blankInput) ||
                        actualResult.equals(differentConfirmPassword) ||
                        actualResult.equals((existingUserName))
        );
    }

    @Test(dataProvider = "dataProviderTestPositiveRegistrationForm")
    public void testPositiveRegistrationForm(String userName,
                                             String email,
                                             String password,
                                             String confirmPassword) {
        String expectedResult = "Vartotojas sukurtas";
        String actualResult;

        F_1PageMainPage.clickPrisijungtiButton();
        F_1PageMainPage.clickRegistruokitesButton();
        F_1PageMainPage.inputUserName(userName);
        F_1PageMainPage.inputEmail(email);
        F_1PageMainPage.inputPassword(password);
        F_1PageMainPage.inputConfirmPassword(confirmPassword);
        F_1PageMainPage.clickRegisterButton();

        actualResult = F_1PageMainPage.readMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s\nExpected: %s", actualResult, expectedResult));
    }

    @Test(dataProvider = "dataProviderTestPositiveLogin")
    public void testPositiveLogin(String userName, String password) {
        String expectedResult = userName;
        String actualResult;

        F_1PageMainPage.clickPrisijungtiButton();
        F_1PageMainPage.inputLoginUserName(userName);
        F_1PageMainPage.inputLoginPassword(password);
        F_1PageMainPage.clickLoginPrisijungti();

        actualResult = F_1PageMainPage.readUserName();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
