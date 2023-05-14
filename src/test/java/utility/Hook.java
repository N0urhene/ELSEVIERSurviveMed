package utility;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hook {
    private static AndroidDriver driver;

    @Before("@appium")
    public void OpenSurviveMedApp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "R58RC21A4TN");
        cap.setCapability(MobileCapabilityType.APP, "C:\\\\Users\\\\Nourhene\\\\Documents\\\\ElsevierSurviveMedUK_prod.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {driver.quit();}

    public static void doubleClick(AndroidDriver driver, WebElement element) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(ElementOption.element(element)).waitAction().tap(ElementOption.element(element)).perform();
    }

    public static AndroidDriver getDriver() {
        return driver;
    }
}
