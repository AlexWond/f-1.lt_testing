package lt.aleksandras.f_1.pom.tests;

import lt.aleksandras.f_1.pom.pages.Common;
import lt.aleksandras.f_1.pom.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class BaseTest {
    @BeforeMethod
    public abstract void setup();

    @AfterMethod
    public void teardown(){
        Common.closeDriver();
    }
}
