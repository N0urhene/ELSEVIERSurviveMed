package features.steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utility.Hook;

public class homeSteps {
    private AndroidDriver driver;
    public homeSteps(){
        this.driver = Hook.getDriver();
    }

    @Given("The user open the Anatomy item")
    public void theUserOpenTheAnatomyItem() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/constraint_layout_home_item")).click();
        Thread.sleep(3000);
    }

    @When("The user choose the first element of the screen list")
    public void theUserChooseTheFirstElementOfTheScreenList() throws InterruptedException {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/constraint_layout_content")).click();
        Thread.sleep(3000);
    }

    @And("The user is in the element screen")
    public void theUserIsInTheElementScreen() throws InterruptedException {
        Thread.sleep(3000);
        boolean screenTitle = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_anatomy")).isDisplayed();
        boolean titlePic = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_picture_content")).isDisplayed();

        Assert.assertTrue(screenTitle);
        Assert.assertTrue(titlePic);
    }

    @And("The user click on the figure to be opened on full screen")
    public void theUserClickOnTheFigureToBeOpenedOnFullScreen() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/imgItem")).click();
        Thread.sleep(3000);
    }

    @And("The user double click the figure to zoom_in")
    public void theUserDoubleClickTheFigureToZoom_in() throws InterruptedException {
        WebElement image = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        Hook.doubleClick(driver, image);
        Thread.sleep(3000);
    }

    @And("The user double click the figure to zoom_out")
    public void theUserDoubleClickTheFigureToZoom_out() throws InterruptedException {
        WebElement image = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        Hook.doubleClick(driver, image);
        Thread.sleep(3000);
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
        Hook.doubleClick(driver, table);
    }

    @And("The user double click the table to zoom_out")
    public void theUserDoubleClickTheTableToZoom_out() {
        WebElement table =  driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/generic_image_content"));
        Hook.doubleClick(driver, table);
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

    @And("The user open the flashcards item")
    public void theUserOpenTheFlashcardsItem() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
    }

    @And("The user click on the first element of the list")
    public void theUserClickOnTheFirstElementOfTheList() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/item_section_interactive")).click();
    }

    @And("The user double-click the image to zoom-in")
    public void theUserDoubleClickTheImageToZoomIn() {
        WebElement image = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        Hook.doubleClick(driver, image);
    }

    @And("The user double-click the image to zoom-out")
    public void theUserDoubleClickTheImageToZoomOut() {
    }

    @And("The user click on More to see the rest of the image description")
    public void theUserClickOnMoreToSeeTheRestOfTheImageDescription() {
        WebElement image = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        Hook.doubleClick(driver, image);
    }

    @And("The user click on the green button in the bottom of the page to hide the image labels")
    public void theUserClickOnTheGreenButtonInTheBottomOfThePageToHideTheImageLabels() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/padding_bottom")).click();
    }

    @And("The user user swipe right to move to the next elements of the list")
    public void theUserUserSwipeRightToMoveToTheNextElementsOfTheList() {
    }

    @And("The user click on the exit button in the top")
    public void theUserClickOnTheExitButtonInTheTop() {
    }

    @Then("The user click on the step-back button to back to the home screen")
    public void theUserClickOnTheStepBackButtonToBackToTheHomeScreen() {
    }
}
