package features.steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.basePage;
import utility.Hook;

public class GuestSteps {
    private AndroidDriver driver;
    public GuestSteps(){

        this.driver = Hook.getDriver();
    }

    @Given("The user is on the main screen")
    public void theUserIsOnTheMainScreen() {
        boolean signUp = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_sign_in_welcome")).isDisplayed();
        boolean guest = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_use_without_account")).isDisplayed();

        Assert.assertTrue(signUp, "Register button is not displayed");
        Assert.assertTrue(guest, "Guest Register button is not displayed");
    }

    @When("The user click the Use without account button")
    public void theUserClickTheUseWithoutAccountButton() {
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

    @Given("The user open the Anatomy item")
    public void theUserOpenTheAnatomyItem() {
        basePage.checkTerms();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
    }

    @When("The user choose the first element of the screen list")
    public void theUserChooseTheFirstElementOfTheScreenList() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView")).click();
    }

    @And("The user is in the element screen")
    public void theUserIsInTheElementScreen() {
        boolean screenTitle = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_anatomy")).isDisplayed();
        boolean titlePic = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_picture_content")).isDisplayed();

        Assert.assertTrue(screenTitle);
        Assert.assertTrue(titlePic);
    }

    @And("The user click on the figure to be opened on full screen")
    public void theUserClickOnTheFigureToBeOpenedOnFullScreen() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/imgItem")).click();
    }

    @And("The user double click the figure to zoom_in")
    public void theUserDoubleClickTheFigureToZoom_in() {
        WebElement image = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        basePage.doubleClick(driver, image);
    }

    @And("The user double click the figure to zoom_out")
    public void theUserDoubleClickTheFigureToZoom_out() {
        WebElement image = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        basePage.doubleClick(driver, image);
    }

    @And("The user click on the exit button to quit the figure")
    public void theUserClickOnTheExitButtonToQuitTheFigure() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/close_full_image")).click();
    }

    @And("The user scroll down to find the table")
    public void theUserScrollDownToFindTheTable() {
    }

    @And("The user click on the table to be opened on full screen")
    public void theUserClickOnTheTableToBeOpenedOnFullScreen() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/generic_image_content")).click();
    }

    @And("The user double click the table to zoom_in")
    public void theUserDoubleClickTheTableToZoom_in() {
        WebElement table =  driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/generic_image_content"));
        basePage.doubleClick(driver, table);
    }

    @And("The user double click the table to zoom_out")
    public void theUserDoubleClickTheTableToZoom_out() {
        WebElement table =  driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/generic_image_content"));
        basePage.doubleClick(driver, table);
    }

    @And("The user click on the exit button to quit the table")
    public void theUserClickOnTheExitButtonToQuitTheTable() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/close_full_image")).click();
    }

    @And("The user click on the previous button to back to list")
    public void theUserClickOnThePreviousButtonToBackToList() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/icon_back_anatomy"));
    }

    @And("The user choose the second element of the screen list")
    public void theUserChooseTheSecondElementOfTheScreenList() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_section_anatomy"));
    }

    @And("The user click on the previous button to back to the home page")
    public void theUserClickOnThePreviousButtonToBackToTheHomePage() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/icon_back_anatomy")).click();
    }
}
