package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class basePage {
    private static AndroidDriver driver;
    public static void checkTerms() {
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability(MobileCapabilityType.APP, "C:\\\\Users\\\\Nourhene\\\\Downloads\\\\ElsevierSurviveMedUK_prod.apk");
        URL url;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver= new AndroidDriver(url,dc);
        driver .manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_use_without_account")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_terms_conditions")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_privacy_policy")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_continue_scroll")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/imageView2")).isDisplayed();
    }

    public static void doubleClick(AndroidDriver driver, WebElement element) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(ElementOption.element(element)).waitAction().tap(ElementOption.element(element)).perform();
    }

    public static AndroidDriver getDriver() {

        return driver;
    }
}
