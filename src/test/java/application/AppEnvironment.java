package application;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class AppEnvironment {
    @Test
    public void OpenSurviveMedApp() throws MalformedURLException {
        DesiredCapabilities cap =  new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        DesiredCapabilities dc= new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"13");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "R58RC21A4TN");
        dc.setCapability(MobileCapabilityType.APP, "C:\\\\Users\\\\Nourhene\\\\Downloads\\\\ElsevierSurviveMedUK_prod.apk");
        URL url =new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver= new AndroidDriver(url,dc);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_use_without_account")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
    }
}
