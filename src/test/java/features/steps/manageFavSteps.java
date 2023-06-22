package features.steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utility.Hook;

public class manageFavSteps {

    private AndroidDriver driver;
    public manageFavSteps(){
        this.driver = Hook.getDriver();
    }

    @Given("the user is in the favorite screen")
    public void TheUserIsInTheFavoriteScreen() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/favorite_nav")).click();
    }

    @When("The user click on an item")
    public void theUserClickOnAnItem() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/itemRow")).click();
    }

    @And("The user is redirected to the item's section")
    public void theUserIsRedirectedToTheItemSSection() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title")).isDisplayed());
    }

    @And("The user click on the step-back button to back to the list")
    public void theUserClickOnTheStepBackButtonToBackToTheList() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/icon_back")).click();
    }

    @And("The user long-click on an item")
    public void theUserLongClickOnAnItem() {
        Hook.longClick(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/itemRow")));
    }

    @And("The user click on remove from favorites")
    public void theUserClickOnRemoveFromFavorites() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/bottom_sheet_favorite_add_btn")).click();
    }

    @Then("The item is deleted")
    public void theItemIsDeleted() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/title_favorites")).isDisplayed());
    }
}