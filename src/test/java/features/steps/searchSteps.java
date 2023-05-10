package features.steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.basePage;
import utility.Hook;
import application.AppEnvironment;
import java.net.MalformedURLException;


public class searchSteps {
    private AndroidDriver driver;
    public searchSteps() {

        this.driver = Hook.getDriver();
    }

    @Given("The user is in the home screen")
    public void theUserIsInTheHomeScreen() {
       boolean tabar = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_tab_bar")).isDisplayed();

        Assert.assertTrue(tabar);
    }

    @When("The user click on the tabBar search icon")
    public void theUserClickOnTheTabBarSearchIcon() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/search_nav")).click();
    }

    @And("The user is on the search screen")
    public void theUserIsOnTheSearchScreen() {
        boolean searchBar = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/edit_text_search_home")).isDisplayed();

        Assert.assertTrue(searchBar);
    }

    @When("The user click on the search bar")
    public void theUserClickOnTheSearchBar() {
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
