package features.steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utility.Hook;

public class registerSteps {
    private AndroidDriver driver;
    public registerSteps(){
        this.driver = Hook.getDriver();
    }

    @When("The user enter a valid email address and a valid password")
    public void the_user_enter_a_valid_email_address_and_a_valid_password() {
        driver.findElement(By.id("1-email")).click();
        driver.findElement(By.id("1-email")).sendKeys("soueidnourhene@gmail.com");
        driver.findElement(By.id("1-password")).sendKeys("Nouri1234");
    }

    @When("The user click on the Sign Up button")
    public void the_user_click_on_the_sign_up_button() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView")).click();
        driver.findElement(By.id("1-submit")).click();
    }

}
