package features.steps;

import org.openqa.selenium.WebDriver
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Hook;

public class GuestSteps {
    private WebDriver driver;
    public GuestSteps(){
        this.driver = Hook.getDriver();
    }

    @Given("The user is on the main screen")
    public void theUserIsOnTheMainScreen() {
    }

    @When("The user click the Use without account button")
    public void theUserClickTheUseWithoutAccountButton() {
    }

    @And("The user see the terms and conditions screen")
    public void theUserSeeTheTermsAndConditionsScreen() {
    }

    @And("The user click on the Scroll to accept button three times")
    public void theUserClickOnTheScrollToAcceptButtonThreeTimes() {
    }

    @And("The user see the conditions to be accepted and a Continue button grayed out")
    public void theUserSeeTheConditionsToBeAcceptedAndAContinueButtonGrayedOut() {
    }

    @And("The user accept the terms condition")
    public void theUserAcceptTheTermsCondition() {
    }

    @And("The user accept the privacy policy")
    public void theUserAcceptThePrivacyPolicy() {
    }

    @And("The user click on the Continue button")
    public void theUserClickOnTheContinueButton() {
    }

    @Then("The user should see the home screen")
    public void theUserShouldSeeTheHomeScreen() {
    }
}
