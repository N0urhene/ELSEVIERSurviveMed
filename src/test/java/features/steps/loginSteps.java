package features.steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utility.Hook;


public class loginSteps {

    private AndroidDriver driver;
    public loginSteps(){
        this.driver = Hook.getDriver();
    }


    @Given("The user is in the login web page")
    public void theUserIsInTheLoginWebPage() {
        boolean login = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView")).isDisplayed();
        boolean image = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Image")).isDisplayed();

       Assert.
    }

    @When("The user click on the CONNEXION button")
    public void theUserClickOnTheCONNEXIONButton() {
    }

    @And("The user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
    }

    @And("The user enter invalid email address {string} and invalid password {string}")
    public void theUserEnterInvalidEmailAddressAndInvalidPassword(String arg0, String arg1) {
    }

    @And("The user click on the CONNEXION button and see an error message")
    public void theUserClickOnTheCONNEXIONButtonAndSeeAnErrorMessage() {
    }

    @And("The user enter valid unverified email address {string} and valid unverified password {string}")
    public void theUserEnterValidUnverifiedEmailAddressAndValidUnverifiedPassword(String arg0, String arg1) {
    }

    @And("The user enter a valid email address {string} and incorrect password {string}")
    public void theUserEnterAValidEmailAddressAndIncorrectPassword(String arg0, String arg1) {
    }

    @And("The user enter a valid verified email address {string} and incorrect password {string}")
    public void theUserEnterAValidVerifiedEmailAddressAndIncorrectPassword(String arg0, String arg1) {
    }

    @And("The user enter correct email address {string} and correct password {string}")
    public void theUserEnterCorrectEmailAddressAndCorrectPassword(String arg0, String arg1) {
    }

    @Then("The user should be logged in to the home screen")
    public void theUserShouldBeLoggedInToTheHomeScreen() {
    }
}
