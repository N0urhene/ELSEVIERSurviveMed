package utility;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.screenrecording.CanRecordScreen;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofSeconds;

public class Hook {
    private static AndroidDriver driver;

    @Before("@appium")
    public void OpenSurviveMedApp() throws MalformedURLException, InterruptedException {
        //System.out.println("INSIDE OPEN SERVICE APP");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "R58RC21A4TN");
       // cap.setCapability("unicodeKeyboard", true);
       // cap.setCapability("resetKeyboard", true);
        cap.setCapability(MobileCapabilityType.APP, "C:\\\\Users\\\\Nourhene\\\\Documents\\\\ElsevierSurviveMedUK_prod.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        //System.out.println("Hook line 41; driver " + driver);
        driver .manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        startVideoRecording();
    }

    public static void doubleClick(AndroidDriver driver, WebElement element) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(ElementOption.element(element))
                .waitAction().tap(ElementOption.element(element))
                .perform();
    }

    public static void scroll() {
        int screenWidth = driver.manage().window().getSize().getWidth();
        int screenHeight = driver.manage().window().getSize().getHeight();

        int startX = screenWidth / 2;            // Horizontal position remains the same
        int startY = (int) (screenHeight * 0.8);  // 80% of the screen height
        int endY = (int) (screenHeight * 0.2);    // 20% of the screen height

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(startX, startY))
                .waitAction()
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
    }

    public static void swipeHorizontal(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
        Dimension screenSize = driver.manage().window().getSize();
        int screenWidth = screenSize.getWidth();
        int screenHeight = screenSize.getHeight();

        int startX = (int) (screenWidth * 0.8);  // 80% of screen width
        int endX = (int) (screenWidth * 0.2);    // 20% of screen width
        int y = screenHeight / 2;                // Vertical center of screen

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(startX, y))
                .waitAction()
                .moveTo(PointOption.point(endX, y))
                .release()
                .perform();
    }

    public static void longClick(WebElement element) {
        TouchAction touchAction = new TouchAction(driver);

        touchAction.longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(element))
                        .withDuration(ofSeconds(2)))  // Specify the duration of the long-press (in seconds)
                .release()
                .perform();
    }

    public static void dictionarySwipe (WebElement element) {

        Dimension dimensions = element.getSize();
        int startX = dimensions.getWidth() / 2;
        int startY = dimensions.getHeight() / 2;

        int endX = startX;
        int endY = (int) (startY * 0.2); // Scroll up by 20% of the element's height

        TouchAction touchAction = new TouchAction(driver);

        touchAction.longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(element, startX, startY)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
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
        System.out.println("get driver called inside hook " + driver);
        return driver;
    }

}