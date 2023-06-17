package features.steps;

import io.appium.java_client.AppiumBy;
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

    @When("The user click on the Register button")
    public void theUserClickOnTheRegisterButton() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_signin_welcome")).click();
    }

    @And("The user is redirected to the inscription web page")
    public void theUserIsRedirectedToTheInscriptionWebPage() {
        boolean urlBar = driver.findElement(By.id("com.android.chrome:id/url_bar")).isDisplayed();
        boolean login = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView")).isDisplayed();

        Assert.assertTrue(urlBar, "not displayed");
        Assert.assertTrue(login, "not displayed");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @And("The user switch to the Sign Up field")
    public void theUserSwitchToTheSignUpField() throws InterruptedException {
        driver.findElement(By.xpath("//android.view.View[@content-desc=\"Sign Up\"]")).click();
        Thread.sleep(2000);
    }

    @And("The user click on the Sign Up blue button in the bottom of the page")
    public void theUserClickOnTheSignUpBlueButtonInTheBottomOfThePage() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
    }

    @And("The user receives an error messages under the fields with reddening of the field frame")
    public void theUserReceivesAnErrorMessagesUnderTheFieldsWithReddeningOfTheFieldFrame() {
        boolean emailError = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.TextView")).isDisplayed();
        boolean passwordError = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView")).isDisplayed();

        Assert.assertTrue(emailError);
        Assert.assertTrue(passwordError);
    }

    @And("The user enter invalid email address in the address field {string}")
    public void theUserEnterInvalidEmailAddressInTheAddressField(String nourhenesoueid) {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")).sendKeys(nourhenesoueid);

    }

    @And("The user enter in invalid email {string} and in the password field {string}")
    public void theUserEnterInInvalidEmailAndInThePasswordField(String email, String pwd) {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")).sendKeys(email);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText")).sendKeys(pwd);
    }


    @And("The use enter in invalid email {string} and in the password field {string}")
    public void theUseEnterInInvalidEmailAndInThePasswordField(String arg0, String arg1) {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")).sendKeys(arg0);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText")).sendKeys(arg1);
    }

    @And("The user receives a red error message")
    public void theUserReceivesARedErrorMessage() {
        Assert.assertTrue(driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"We're sorry, something went wrong when attempting to sign up.\")")).isDisplayed());
    }

    @And("The user enter a valid email address {string} and a valid password {string}")
    public void theUserEnterAValidPassword(String n, String b) {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")).sendKeys(n);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText")).sendKeys(b);
    }

    @And("The cursor has shifted to the next input field")
    public void theCursorHasShiftedToTheNextInputField() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.EditText")).click();
    }

    @And("The user enter his First Name")
    public void theUserEnterHisFirstName() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.EditText")).sendKeys("nourhene");
    }

    @And("The user click on the Sign Up blue button")
    public void theUserClickOnTheSignUpBlueButton() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
    }

    @And("The cursor has shifted to the last field")
    public void theCursorHasShiftedToTheLastField() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.widget.EditText")).click();
    }

    @And("The user enter his Family Name")
    public void theUserEnterHisFamilyName() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.widget.EditText")).sendKeys("soueid");
    }

    @And("The user receives an error message The user already exists")
    public void theUserReceivesAnErrorMessageTheUserAlreadyExists() {
        Assert.assertTrue(driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"The user already exists.\")")).isDisplayed());
    }

    @And("The user should see a successful message and receive a verification email")
    public void theUserShouldSeeASuccessfulMessageAndReceiveAVerificationEmail() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/img_validation_signin_ul")).isDisplayed());
    }

    @Then("The user click on the Login button to be redirected to the login webpage")
    public void theUserClickOnTheLoginButtonToBeRedirectedToTheLoginWebpage() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_btn_signin_ul")).click();
    }

    @And("The user enter his credentials to log in to the application")
    public void theUserEnterHisCredentialsToLogInToTheApplication() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText")).sendKeys("test.survivemed@gmail.com");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.widget.EditText")).sendKeys("Test0000");
    }


    @Then("The user is redirected to the success message to verify his email")
    public void theUserIsRedirectedToTheSuccessMessageToVerifyHisEmail() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/img_validation_signin_ul")).isDisplayed());
    }
}
