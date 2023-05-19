package utility;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Hook {
    private static AndroidDriver driver;

    @Before("@appium")
    public void OpenSurviveMedApp() throws MalformedURLException, InterruptedException {
        startVideoRecording();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "R58RC21A4TN");
        cap.setCapability(MobileCapabilityType.APP, "C:\\\\Users\\\\Nourhene\\\\Documents\\\\ElsevierSurviveMedUK_prod.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        Thread.sleep(3000);


    }

    public static void doubleClick(AndroidDriver driver, WebElement element) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(ElementOption.element(element)).waitAction().tap(ElementOption.element(element)).perform();
    }

    @After
    public void tearDown()  {
        stopVideoRecording();
        driver.quit();
    }

    private void startVideoRecording() {
        ((CanRecordScreen) driver).startRecordingScreen();
    }

    private void stopVideoRecording() {
        String video = ((CanRecordScreen)driver).stopRecordingScreen();
        byte[] decodeVideo = Base64.getMimeDecoder().decode(video);
        try {
        Path testVideoDir = Paths.get(System.getProperty("user.dir") + "/videos");
        Files.createDirectories(testVideoDir);
        Path testVideoFileLocation =
                Paths.get(testVideoDir.toString(), String.format("%s-%d.%s", "test", System.currentTimeMillis(), "mp4"));
        Files.write(testVideoFileLocation, decodeVideo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

}
