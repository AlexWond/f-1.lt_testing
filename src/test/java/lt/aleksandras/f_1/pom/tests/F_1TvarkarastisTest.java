package lt.aleksandras.f_1.pom.tests;

import lt.aleksandras.f_1.pom.pages.F_1TvarkarastisPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class F_1TvarkarastisTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        F_1TvarkarastisPage.set();
        F_1TvarkarastisPage.open();
    }

    @Test
    public void testGoToTicketsBuyWebPage() {
        String expectedResult = "https://www.gootickets.com/en/7-formula-1/2802-bahrain/?affid=891&pgs=91";
        String actualResult;

        F_1TvarkarastisPage.waitTicketButtonsToBeClickable();
        F_1TvarkarastisPage.clickBahreinTicketsButton();
        F_1TvarkarastisPage.switchToBahreinWindow();

        actualResult = F_1TvarkarastisPage.getPageUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
