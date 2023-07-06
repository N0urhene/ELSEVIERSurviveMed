package features.steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utility.Hook;

public class settingsSteps {

    private AndroidDriver driver;
    public settingsSteps() {
        this.driver = Hook.getDriver();
    }

    @Given("The user is in the profile screen")
    public void theUserIsInTheProfileScreen() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/setting_nav")).click();
    }

    @When("The user click on the list's first element")
    public void theUserClickOnTheListSFirstElement() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_credits")).click();
    }

    @And("The user is in the Further reading and credits screen")
    public void theUserIsInTheFurtherReadingAndCreditsScreen() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_toolbar")).isDisplayed());
        Hook.scroll();
    }

    @And("The user click on the step-back button to back to the Settings")
    public void theUserClickOnTheStepBackButtonToBackToTheSettings() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/icon_back_toolbar")).click();
    }

    @And("The user click on the list's second item")
    public void theUserClickOnTheListSSecondItem() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_privacy_policy")).click();
    }

    @And("The user is redirected to the Privacy Policy web page")
    public void theUserIsRedirectedToThePrivacyPolicyWebPage() {
        Hook.scroll();
    }

    @And("The user click to back to the Settings screen")
    public void theUserClickToBackToTheSettingsScreen() {
        driver.navigate().back();
    }

    @And("The user click on the list's third item")
    public void theUserClickOnTheListSThirdItem() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_terms_conditions")).click();
    }

    @And("The user is in the Terms and Conditions web page")
    public void theUserIsInTheTermsAndConditionsWebPage() {
        Assert.assertTrue(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.TextView")).isDisplayed());
    }

    @And("The user click on the list's forth element")
    public void theUserClickOnTheListSForthElement() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_about_elsevier")).click();
    }

    @And("The user is redirected to the About Elsevier screen web page")
    public void theUserIsRedirectedToTheAboutElsevierScreenWebPage() {
       Assert.assertTrue(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.view.View/android.view.View[1]/android.widget.TextView")).isDisplayed());
    }

    @And("The user click to the list's fifth element")
    public void theUserClickToTheListSFifthElement() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_support")).click();
    }

    @And("The user is redirected to the Support Center web page")
    public void theUserIsRedirectedToTheSupportCenterWebPage() {
       Assert.assertTrue(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.TextView")).isDisplayed());
    }

    @And("The user click on the last element in the list")
    public void theUserClickOnTheLastElementInTheList() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_delete")).click();
    }

    @And("The user is in My account screen")
    public void theUserIsInMyAccountScreen() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_settings")).isDisplayed());
    }

    @And("The user click on Delete my account link")
    public void theUserClickOnDeleteMyAccountLink() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_delete")).click();
    }

    @And("The user is redirected to Elsevier Support Center")
    public void theUserIsRedirectedToElsevierSupportCenter() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/toolbar_btn")).click();
    }

    @And("The user click on the sign out link")
    public void theUserClickOnTheSignOutLink() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/icon_logout")).click();
    }

    @And("A confirmation pop up appeared")
    public void aConfirmationPopUpAppeared() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_custom_alert")).isDisplayed());
    }

    @And("The user click on Yes")
    public void theUserClickOnYes() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/positive_btn_custom_alert")).click();
    }

    @And("The user is signed out and redirected to the application main screen")
    public void theUserIsSignedOutAndRedirectedToTheApplicationMainScreen() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/img_visual_welcome")).isDisplayed());
    }
}
