package lt.aleksandras.f_1.pom.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenShot();
    }

    private void takeScreenShot() {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriver();
            File screenShotFile = screenshot.getScreenshotAs(OutputType.FILE);

            String directory = "./screenshots/";
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_SSS");

            File screenShotFinalFile = new File(
                    directory + dateTime.format(formatter) + "_screenshot" + UUID.randomUUID() + ".jpg"
            );

            FileUtils.copyFile(screenShotFile, screenShotFinalFile);
        } catch (IOException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
