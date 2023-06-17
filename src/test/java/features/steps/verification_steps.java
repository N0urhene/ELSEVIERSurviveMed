package features.steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import utility.Hook;

public class verification_steps {
    private AndroidDriver gmailDriver;

    @Given("The user is in his mailbox")
    public void theUserIsInHisMailbox() throws MalformedURLException {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "R58RC21A4TN");
            cap.setCapability(MobileCapabilityType.APP, "C:\\\\Users\\\\Nourhene\\\\Documents\\\\com.google.android.gm.apk");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
        gmailDriver = new AndroidDriver(url, cap);
        gmailDriver .manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Hook.startVideoRecording();

        gmailDriver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
        gmailDriver.findElement(By.id("com.google.android.gm:id/dismiss_button")).click();
    }

    @When("The user click to open the validation email received in his mailbox")
    public void theUserClickToOpenTheValidationEmailReceivedInHisMailbox() {
        gmailDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]")).click();
    }

    @And("The user read the email")
    public void theUserReadTheEmail() {
        Assert.assertTrue(gmailDriver.findElement(By.xpath("//android.view.View[@content-desc=\"Elsevier\"]/android.widget.Image")).isDisplayed());
    }

    @And("The user click on the blue button confirm my account")
    public void theUserClickOnTheBlueButtonConfirmMyAccount() throws InterruptedException {
        Thread.sleep(2000);
        gmailDriver.findElement(By.xpath("//android.view.View[@content-desc=\"Confirm my account\"]")).click();
    }

    @And("The user should receive a successful message")
    public void theUserShouldReceiveASuccessfulMessage() {
    }

    @And("The user should receive a welcome email")
    public void theUserShouldReceiveAWelcomeEmail() {
    }

    @Then("The user should be redirected to the login web page")
    public void theUserShouldBeRedirectedToTheLoginWebPage() {
    }

    @When("The user click to open the received email")
    public void theUserClickToOpenTheReceivedEmail() {
    }

    @And("The user click on the Set password blue button")
    public void theUserClickOnTheSetPasswordBlueButton() {
    }

    @And("The user is redirected to the Set password web page")
    public void theUserIsRedirectedToTheSetPasswordWebPage() {
    }

    @And("The user click on the Submit button")
    public void theUserClickOnTheSubmitButton() {
    }

    @And("The cursor shifted to the first field")
    public void theCursorShiftedToTheFirstField() {
    }

    @And("The user enter a new invalid password")
    public void theUserEnterANewInvalidPassword() {
    }

    @And("The cursor shifted to the first field and the list of password rules should be displayed")
    public void theCursorShiftedToTheFirstFieldAndTheListOfPasswordRulesShouldBeDisplayed() {
    }

    @And("The user enter a new valid password")
    public void theUserEnterANewValidPassword() {
    }

    @And("The cusor shifted to the next field")
    public void theCusorShiftedToTheNextField() {
    }

    @And("The user re-enter the password to confirm it")
    public void theUserReEnterThePasswordToConfirmIt() {
    }

    @Then("The user should receive a successfull message")
    public void theUserShouldReceiveASuccessfullMessage() {
    }
}
