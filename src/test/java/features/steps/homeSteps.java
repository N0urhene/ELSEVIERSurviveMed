package features.steps;

import io.appium.java_client.AppiumBy;
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

    @And("The user open the Anatomy item")
    public void theUserOpenTheAnatomyItem() throws InterruptedException {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/home_nav")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/constraint_layout_home_item")).click();
        Thread.sleep(3000);
    }

    @And("The user choose the first element of the screen list")
    public void theUserChooseTheFirstElementOfTheScreenList() throws InterruptedException {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/constraint_layout_content")).click();
    }

    @And("The user is in the element screen")
    public void theUserIsInTheElementScreen() throws InterruptedException {
        Thread.sleep(2000);
        boolean screenTitle = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_anatomy")).isDisplayed();
        boolean titlePic = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_picture_content")).isDisplayed();

        Assert.assertTrue(screenTitle);
        Assert.assertTrue(titlePic);
    }

    @And("The user click on the figure to be opened on full screen")
    public void theUserClickOnTheFigureToBeOpenedOnFullScreen() throws InterruptedException {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/imgItem")).click();
        Thread.sleep(2000);
    }

    @And("The user double click the figure to zoom_in")
    public void theUserDoubleClickTheFigureToZoom_in() throws InterruptedException {
        WebElement image = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        Hook.doubleClick(driver, image);
    }

    @And("The user double click the figure to zoom_out")
    public void theUserDoubleClickTheFigureToZoom_out() throws InterruptedException {
        WebElement image = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        Hook.doubleClick(driver, image);
    }

    @And("The user click on the exit button to quit the figure")
    public void theUserClickOnTheExitButtonToQuitTheFigure() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/close_full_image")).click();
    }

    @And("The user scroll down to find the table")
    public void theUserScrollDownToFindTheTable() throws InterruptedException {
        Thread.sleep(2000);
        Hook.scroll();
    }

    @And("The user click on the table to be opened on full screen")
    public void theUserClickOnTheTableToBeOpenedOnFullScreen() throws InterruptedException {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/generic_image_content")).click();
        Thread.sleep(2000);
    }

    @And("The user double click the table to zoom_in")
    public void theUserDoubleClickTheTableToZoom_in() throws InterruptedException {
        WebElement table =  driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        Hook.doubleClick(driver, table);
    }

    @And("The user double click the table to zoom_out")
    public void theUserDoubleClickTheTableToZoom_out() throws InterruptedException {
        WebElement table =  driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        Hook.doubleClick(driver, table);
    }

    @And("The user click on the exit button to quit the table")
    public void theUserClickOnTheExitButtonToQuitTheTable() throws InterruptedException {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/close_full_image")).click();
        Thread.sleep(2000);
    }

    @And("The user click on the previous button to back to list")
    public void theUserClickOnThePreviousButtonToBackToList() throws InterruptedException {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(2000);
    }

    @And("The user choose the second element of the screen list")
    public void theUserChooseTheSecondElementOfTheScreenList() throws InterruptedException {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")).click();
        Thread.sleep(2000);
    }

    @And("The user click on the previous button to back to the home page")
    public void theUserClickOnThePreviousButtonToBackToTheHomePage() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/icon_back_anatomy")).click();
    }

    @And("The user open the flashcards item")
    public void theUserOpenTheFlashcardsItem() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/home_nav")).click();
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
    public void theUserDoubleClickTheImageToZoomOut() throws InterruptedException {
        WebElement image = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen"));
        Hook.doubleClick(driver, image);
        Thread.sleep(1000);
    }

    @And("The user click on More to see the rest of the image description")
    public void theUserClickOnMoreToSeeTheRestOfTheImageDescription() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_detail_picture_interactive")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ImageView")).click();
    }

    @And("The user click on the green button in the bottom of the page to hide the image labels")
    public void theUserClickOnTheGreenButtonInTheBottomOfThePageToHideTheImageLabels() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/switch_caption")).click();
    }

    @And("The user user swipe right to move to the next elements of the list")
    public void theUserUserSwipeRightToMoveToTheNextElementsOfTheList() throws InterruptedException {
        Thread.sleep(1000);
        Hook.swipeHorizontal(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen")));
        Hook.swipeHorizontal(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen")));
        Hook.swipeHorizontal(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen")));
        Hook.swipeHorizontal(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen")));
        Hook.swipeHorizontal(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/touch_image_full_screen")));
    }

    @And("The user click on the exit button in the top")
    public void theUserClickOnTheExitButtonInTheTop() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
    }

    @Then("The user click on the step-back button to back to the home screen")
    public void theUserClickOnTheStepBackButtonToBackToTheHomeScreen() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/icon_back_toolbar")).click();
        Hook.scroll();
    }

    @And("The user click to open the item")
    public void theUserClickToOpenTheItem() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/home_nav")).click();
        //Hook.scroll();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector().textContains(\"Labaratory values can vary. Please double-check with your local laboratory\"))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
    }

    @And("a pop up message appear")
    public void aPopUpMessageAppear() {
        Assert.assertTrue(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup")).isDisplayed());
    }

    @And("The user click on Not now")
    public void theUserClickOnNotNow() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/button_cancel")).click();
    }

    @And("The user click on the item")
    public void theUserClickOnTheItem() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/home_nav")).click();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"+".scrollIntoView(new UiSelector().textContains(\"Remove your fear, search from 12,000+ med terms\"))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
    }

    @And("The user scroll down to see all the information of the letter A")
    public void theUserScrollDownToSeeAllTheInformationOfTheLetterA() throws InterruptedException {
        Hook.scroll();
        Thread.sleep(1000);
    }

    @And("The user swipe right the alphabetic list")
    public void theUserSwipeRightTheAlphabeticList() throws InterruptedException {
        Thread.sleep(1000);
        Hook.dictionarySwipe(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")));
        Hook.scroll();
        Hook.dictionarySwipe(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")));
        Hook.scroll();
        Hook.dictionarySwipe(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")));
        Hook.scroll();
        Hook.dictionarySwipe(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")));
        Hook.scroll();
    }

    @And("The user choose the next letter and click on it")
    public void theUserChooseTheNextLetterBAndClickOnIt() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.TextView")).click();
    }

    @And("The user should see all the information starting with that letter")
    public void theUserShouldSeeAllTheInformationStartingWithThatLetter() {
        Hook.scroll();
    }

    @And("The user long-click on an information")
    public void theUserLongClickOnAnInformation() {
        Hook.longClick(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup")));
    }

    @And("A pop up appears in the bottom of the page")
    public void aPopUpAppearsInTheBottomOfThePage() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/design_bottom_sheet")).isDisplayed());
    }

    @And("The user click on Add to favorites")
    public void theUserClickOnAddToFavorites() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/bottom_sheet_favorite_add_btn")).click();
    }

    @And("The user should see a message Added to favorites")
    public void theUserShouldSeeAMessageAddedToFavorites() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/favorites_snack_bar_txt")).isDisplayed());
    }

    @Then("The user click on the top button to back to home screen")
    public void theUserClickOnTheTopButtonToBackToHomeScreen() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/icon_back")).click();
    }

    @And("The user click to open the glossaries by subject item")
    public void theUserClickToOpenTheGlossariesBySubjectItem() {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector().textContains(\"Quick reference lists of need to know terms\"))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
    }

        @And("The user click on the Anatomy element")
    public void theUserClickOnTheAnatomyElement() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")).click();
    }

    @And("The user should be in the Anatomy dictionary")
    public void theUserShouldBeInTheAnatomyDictionary() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title")).isDisplayed());
    }

    @And("The user swipe the letters list to choose a letter")
    public void theUserSwipeTheLettersListToChooseALetter() {
        Hook.dictionarySwipe(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")));
        Hook.scroll();
        Hook.dictionarySwipe(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")));
        Hook.scroll();
        Hook.dictionarySwipe(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")));
        Hook.scroll();
        Hook.dictionarySwipe(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.TextView")));
        Hook.scroll();
    }

    @And("The user scroll the information")
    public void theUserScrollTheInformation() {
        Hook.scroll();
    }

    @And("The user can favor his important information")
    public void theUserCanFavorHisImportantInformation() {
        Hook.longClick(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup")));
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/bottom_sheet_favorite_add_btn")).click();
    }

    @And("The user click to back to the list")
    public void theUserClickToBackToTheList() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/icon_back")).click();
    }

    @And("The user click to open the essential latin item")
    public void theUserClickToOpenTheEssentialLatinItem() throws InterruptedException {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector().textContains(\"Essential Latin\"))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
        Thread.sleep(2000);
    }

    @And("The user scroll down to see the results")
    public void theUserScrollDownToSeeTheResults() {
        Hook.scroll();
    }

    @And("The user click on the third information to add it to the favorites")
    public void theUserClickOnTheThirdInformationToAddItToTheFavorites() {
        Hook.longClick(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup")));
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/bottom_sheet_favorite_add_btn")).click();
    }

    @Then("The user click back to home screen")
    public void theUserClickBackToHomeScreen() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/icon_back")).click();
    }

    @And("The user click to open the survival tips item")
    public void theUserClickToOpenTheSurvivalTipsItem() {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector().textContains(\"Invaluable advice, hints & tips from med students\"))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
    }

    @And("The user should see a list of tips")
    public void theUserShouldSeeAListOfTips() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title")).isDisplayed());
    }

    @And("The user click on the first tip card")
    public void theUserClickOnTheFirstTipCard() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
    }

    @And("The user can scroll to read the rest of the tip")
    public void theUserCanScrollToReadTheRestOfTheTip() throws InterruptedException {
        Thread.sleep(2000);
        Hook.scroll();
    }

    @And("The user click on the back button on the top of the card")
    public void theUserClickOnTheBackButtonOnTheTopOfTheCard() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/btn_back_surviving_content")).click();
    }

    @And("The user choose the second tip card and click on it")
    public void theUserChooseTheSecondTipCardAndClickOnIt() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
    }

    @And("The user can read the tip and scroll down to see the arguments")
    public void theUserCanReadTheTipAndScrollDownToSeeTheArguments() throws InterruptedException {
        Thread.sleep(1000);
        Hook.scroll();
    }

    @And("The user can swipe left to see the rest of the arguments")
    public void theUserCanSwipeLeftToSeeTheRestOfTheArguments() {
        Hook.swipeHorizontal(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager")));
        Hook.swipeHorizontal(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/androidx.viewpager.widget.ViewPager")));
    }

    @And("The user back to home screen and choose the third card")
    public void theUserBackToHomeScreenAndChooseTheThirdCard() throws InterruptedException {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/btn_back_surviving_content")).click();
        Thread.sleep(1000);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector().textContains(\"Maintiaining relationships help.\"))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
    }

    @And("The user can read the tip and scroll down to read the cots")
    public void theUserCanReadTheTipAndScrollDownToReadTheCots() throws InterruptedException {
        Thread.sleep(1000);
        Hook.scroll();
    }

    @And("The user click to open test yourself item")
    public void theUserClickToOpenTestYourselfItem() {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))" + ".scrollIntoView(new UiSelector().textContains(\"Questions and answers.Test your knowledge!\"))"));
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
    }
}
