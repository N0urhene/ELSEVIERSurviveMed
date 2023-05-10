package utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
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
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.APP, "C:\\\\Users\\\\Nourhene\\\\Downloads\\\\ElsevierSurviveMedUK_prod.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void checkTerms() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_use_without_account")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_terms_conditions")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_privacy_policy")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_continue_scroll")).click();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    public static AndroidDriver getDriver() {

        return driver;
    }
}
