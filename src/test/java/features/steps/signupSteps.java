package features.steps;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utility.Hook;

import java.util.concurrent.TimeUnit;

public class signupSteps {

    private AndroidDriver driver;

    public signupSteps() {
        this.driver = Hook.getDriver();
    }

    @Given("The user is in the main screen of the application")
    public void theUserIsInTheMainScreenOfTheApplication() {
        System.out.println("the user is in the main screen");
        boolean signUp = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_sign_in_welcome")).isDisplayed();
        boolean guest = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_use_without_account")).isDisplayed();

        Assert.assertTrue(signUp, "Register button is not displayed");
        Assert.assertTrue(guest, "Guest Register button is not displayed");
    }

    @When("The user click on the Register button")
    public void theUserClickOnTheRegisterButton() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_sign_in_welcome")).click();
    }

    @And("The user is redirected to the inscription web page")
    public void theUserIsRedirectedToTheInscriptionWebPage() {
        boolean urlBar = driver.findElement(By.id("com.android.chrome:id/url_bar")).isDisplayed();
        boolean login = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView")).isDisplayed();

        Assert.assertTrue(urlBar, "not displayed");
        Assert.assertTrue(login, "not displayed");

    }

    @And("The user switch to the Sign Up field")
    public void theUserSwitchToTheSignUpField() {
        driver.findElement(By.id("//android.view.View[@content-desc=\"Sign Up\"]/android.widget.TextView")).click();
    }

    @And("The user click on the Sign Up green button in the bottom of the page")
    public void theUserClickOnTheSignUpGreenButtonInTheBottomOfThePage() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
    }

    @And("The user receives an error messages under the fields with reddening of the field frame")
    public void theUserReceivesAnErrorMessagesUnderTheFieldsWithReddeningOfTheFieldFrame() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        boolean emailError = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.TextView")).isDisplayed();
        boolean passwordError = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView")).isDisplayed();

        Assert.assertTrue(emailError);
        Assert.assertTrue(passwordError);
    }

    @And("The user enter invalid email address in the address field")
    public void theUserEnterInvalidEmailAddressInTheAddressField() {
        driver.findElement(By.id("1-email")).sendKeys("nourhene@soueid");
    }

    @And("The user enter invalid password in the password field")
    public void theUserEnterInvalidPasswordInThePasswordField() {
        driver.findElement(By.id("1-password")).sendKeys("nourhenesoueid");
    }

    @And("The user enter a valid email address")
    public void theUserEnterAValidEmailAddress() {
        driver.findElement(By.id("1-email")).sendKeys("nourhenesoueid@gmail.com");
    }

    @And("The user enter a valid password")
    public void theUserEnterAValidPassword() {
        driver.findElement(By.id("1-password")).sendKeys("Nouri12345");
    }

    @Then("The user should see a successful message")
    public void theUserShouldSeeASuccessfulMessage() {
    }

    @And("The user should receive a verification email")
    public void theUserShouldReceiveAVerificationEmail() {
    }

    @Given("The user is in his mailbox")
    public void theUserIsInHisMailbox() {
    }

    @When("The user click on the validation email received in his mailbox")
    public void theUserClickOnTheValidationEmailReceivedInHisMailbox() {
    }

    @And("The user open the email")
    public void theUserOpenTheEmail() {
    }

    @And("The user click on the blue button confirm my account")
    public void theUserClickOnTheBlueButtonConfirmMyAccount() {
    }

    @And("The user should receive a welcome email")
    public void theUserShouldReceiveAWelcomeEmail() {
    }

    @And("The user should be redirected to the login web page")
    public void theUserShouldBeRedirectedToTheLoginWebPage() {
    }
}
