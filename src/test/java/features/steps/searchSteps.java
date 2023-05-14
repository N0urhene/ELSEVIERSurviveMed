package features.steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import utility.Hook;

public class searchSteps {
    private AndroidDriver driver;
    public searchSteps() {
        this.driver = Hook.getDriver();
    }

    @Given("The user is in the home screen")
    public void theUserIsInTheHomeScreen() {
        boolean homeT = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/imageView2")).isDisplayed();

        Assert.assertTrue(homeT);
    }

    @When("The user click on the tabBar search icon")
    public void theUserClickOnTheTabBarSearchIcon() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/search_nav")).click();
        Thread.sleep(3000);
    }

    @And("The user is on the search screen")
    public void theUserIsOnTheSearchScreen() {
        boolean searchBar = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/edit_text_search_home")).isDisplayed();

        Assert.assertTrue(searchBar);
    }

    @When("The user click on the search bar")
    public void theUserClickOnTheSearchBar() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/edit_text_search_home")).click();
    }

    @When("The user search for medical keyword")
    public void theUserSearchForMedicalKeyword() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/edit_text_search_home"))
                .sendKeys("medical");
    }

    @Then("The user should see the search result")
    public void theUserShouldSeeTheSearchResult() {
        boolean searchResult = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_search_terms")).isDisplayed();
        Assert.assertTrue(searchResult);
    }


}
