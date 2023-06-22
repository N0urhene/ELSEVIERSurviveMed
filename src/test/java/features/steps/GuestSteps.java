package features.steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.Hook;

public class GuestSteps {
    private AndroidDriver driver;
    public GuestSteps(){
        this.driver = Hook.getDriver();
        //System.out.println("driver taken from hook" + driver);
    }
    @BeforeClass
    public void setup(){
        this.driver = Hook.getDriver();
        System.out.println("driver taken from hook" + driver);
    }

    @Given("The user is on the main screen")
    public void theUserIsOnTheMainScreen() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/img_logo_app")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/img_visual_welcome")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_signin_welcome")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_use_without_account")).isDisplayed());
    }

    @When("The user click the Use without account button")
    public void theUserClickTheUseWithoutAccountButton() throws InterruptedException {
        System.out.println("the user click on the button");
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_use_without_account")).click();
        Thread.sleep(3000);
    }

    @And("The user see the terms and conditions screen")
    public void theUserSeeTheTermsAndConditionsScreen() {
        boolean title = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_toolbar")).isDisplayed();

        Assert.assertTrue(title);
    }

    @And("The user click on the Scroll to accept button three times")
    public void theUserClickOnTheScrollToAcceptButtonThreeTimes() throws InterruptedException {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_scroll_continue")).click();
        Thread.sleep(3000);
    }

    @And("The user see the conditions to be accepted and a Continue button grayed out")
    public void theUserSeeTheConditionsToBeAcceptedAndAContinueButtonGrayedOut() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_terms_conditions")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_privacy_policy")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_continue_scroll")).isDisplayed());
    }

    @And("The user accept the terms condition")
    public void theUserAcceptTheTermsCondition() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_terms_conditions")).click();
    }

    @And("The user accept the privacy policy")
    public void theUserAcceptThePrivacyPolicy() throws InterruptedException {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_privacy_policy")).click();
        Thread.sleep(2000);
    }

    @And("The user click on the Continue button")
    public void theUserClickOnTheContinueButton() throws InterruptedException {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_continue_scroll")).click();
        //Thread.sleep(3000);
    }

    @Then("The user should see the home screen")
    public void theUserShouldSeeTheHomeScreen() throws InterruptedException {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/imageView2")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_tab_bar")).isDisplayed());
        Thread.sleep(3000);
    }
}
