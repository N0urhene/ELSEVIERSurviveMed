package features.steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import utility.Hook;

public class searchSteps {
    private static GuestSteps driver;
    public searchSteps() {
        this.driver = new GuestSteps();
    }

    @Given("The user is in the search screen")
    public void theUserIsInTheSearchScreen() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/search_nav")).click();
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
