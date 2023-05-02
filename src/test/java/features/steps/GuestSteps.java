package features.steps;

import java.lang.Throwable;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utility.Hook;

public class GuestSteps {
    private AndroidDriver driver;
    public GuestSteps(){

        this.driver = Hook.getDriver();
    }

    @Given("The user is on the main screen")
    public void theUserIsOnTheMainScreen() throws Throwable{
        System.out.println("the user is in the main screen");
        boolean signUp = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_sign_in_welcome")).isDisplayed();
        boolean guest = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_use_without_account")).isDisplayed();

        Assert.assertTrue(signUp, "Register button is not displayed");
        Assert.assertTrue(guest, "Guest Register button is not displayed");
    }

    @When("The user click the Use without account button")
    public void theUserClickTheUseWithoutAccountButton() throws Throwable {
        System.out.println("the user click on the button");
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_use_without_account")).click();
    }

    @And("The user see the terms and conditions screen")
    public void theUserSeeTheTermsAndConditionsScreen() {
        boolean title = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_toolbar")).isDisplayed();

        Assert.assertTrue(title);
    }

    @And("The user click on the Scroll to accept button three times")
    public void theUserClickOnTheScrollToAcceptButtonThreeTimes() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
    }

    @And("The user see the conditions to be accepted and a Continue button grayed out")
    public void theUserSeeTheConditionsToBeAcceptedAndAContinueButtonGrayedOut() {
       boolean check_terms = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_terms_conditions")).isDisplayed();
       boolean check_privacy = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_privacy_policy")).isDisplayed();
        boolean check_btn = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_continue_scroll")).isDisplayed();

        Assert.assertTrue(check_terms, "Terms and conditions checkbox is not displayed");
        Assert.assertTrue(check_privacy, "Privacy Policy checkbox is not displayed");
        Assert.assertTrue(check_btn, "Continue button is not displayed");

    }

    @And("The user accept the terms condition")
    public void theUserAcceptTheTermsCondition() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_terms_conditions")).click();
    }

    @And("The user accept the privacy policy")
    public void theUserAcceptThePrivacyPolicy() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_privacy_policy")).click();
    }

    @And("The user click on the Continue button")
    public void theUserClickOnTheContinueButton() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_continue_scroll")).click();
    }

    @Then("The user should see the home screen")
    public void theUserShouldSeeTheHomeScreen() {
        boolean image = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/imageView2")).isDisplayed();
        boolean tabBar = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_tab_bar")).isDisplayed();

        Assert.assertTrue(image, "App image is not displayed");
        Assert.assertTrue(tabBar, " The tabbar is not displayed");
    }
}
