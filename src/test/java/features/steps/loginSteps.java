package features.steps;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import utility.Hook;

public class loginSteps {
    private AndroidDriver driver;
    public loginSteps() {

        this.driver = Hook.getDriver();
    }

    @And("The user click on the CONNEXION button")
    public void theUserClickOnTheCONNEXIONButton() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.TextView")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
    }

    @And("The user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.widget.ListView/android.view.View[1]")).click();
        boolean emailError = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.TextView")).isDisplayed();
        boolean pwdError = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.TextView")).isDisplayed();

        Assert.assertTrue(emailError);
        Assert.assertTrue(pwdError);
    }

    @And("The user enter invalid email address {string} and invalid password {string}")
    public void theUserEnterInvalidEmailAddressAndInvalidPassword(String email, String password) {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText")).sendKeys(email);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.widget.EditText")).sendKeys(password);
    }

    @And("The user click on the CONNEXION button and see an error message")
    public void theUserClickOnTheCONNEXIONButtonAndSeeAnErrorMessage() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")).click();
    }

    @And("The user enter valid unverified email address {string} and valid unverified password {string}")
    public void theUserEnterValidUnverifiedEmailAddressAndValidUnverifiedPassword(String address, String pwd) {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText")).sendKeys(address);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.widget.EditText")).sendKeys(pwd);
    }

    @And("The user enter a valid email address {string} and incorrect password {string}")
    public void theUserEnterAValidEmailAddressAndIncorrectPassword(String arg0, String arg1) {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText")).sendKeys(arg0);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.widget.EditText")).sendKeys(arg1);
    }

    @And("The user enter a valid verified email address {string} and incorrect password {string}")
    public void theUserEnterAValidVerifiedEmailAddressAndIncorrectPassword(String email1, String pwd1) {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText")).sendKeys(email1);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.widget.EditText")).sendKeys(pwd1);
    }

    @And("The user enter correct email address {string} and correct password {string}")
    public void theUserEnterCorrectEmailAddressAndCorrectPassword(String arg00, String arg11) {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.EditText")).sendKeys(arg00);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.widget.EditText")).sendKeys(arg11);
    }


    @And("The user is successfully connected and redirected to Complete your profile screen")
    public void theUserIsSuccessfullyConnectedAndRedirectedToCompleteYourProfileScreen() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/logo_app")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_login_title")).isDisplayed());
    }

    @And("The user enter his first name and last name")
    public void theUserEnterHisFirstNameAndLastName() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/input_edit_text_email")).sendKeys("nourhene");
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/input_edit_text_last_name")).sendKeys("soueid");
    }

    @And("The user click on the Next button")
    public void theUserClickOnTheNextButton() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/next_button")).click();
    }

    @Then("The user should be logged in to the home screen")
    public void theUserShouldBeLoggedInToTheHomeScreen() {
        boolean homeTitle = driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/text_login_title")).isDisplayed();

        Assert.assertTrue(homeTitle);
    }

    @And("The user is in the login welcome screen")
    public void theUserIsInTheLoginWelcomeScreen() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_welcome")).isDisplayed());
    }

    @And("The user click on the I am element to select a role")
    public void theUserClickOnTheIAmElementToSelectARole() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/constraint_layout_content")).click();
    }

    @And("The user is on the I am list")
    public void theUserIsOnTheIAmList() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/txt_title")).isDisplayed());
    }

    @And("The user click on the first choice a medical student")
    public void theUserClickOnTheFirstChoiceAMedicalStudent() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/constraint_layout_content")).click();
    }

    @And("The user click on the second element i go to school in")
    public void theUserClickOnTheSecondElementIGoToSchoolIn() {
        
    }

    @And("The user scroll to choose his country")
    public void theUserScrollToChooseHisCountry() {
        
    }

    @And("The user click on the next element")
    public void theUserClickOnTheNextElement() {
        
    }

    @And("The user choose his university")
    public void theUserChooseHisUniversity() {
        
    }

    @And("The user click on the last element My year of study is")
    public void theUserClickOnTheLastElementMyYearOfStudyIs() {
        
    }

    @And("The user choose his study year")
    public void theUserChooseHisStudyYear() {
        
    }

    @And("The user is in the welcome screen")
    public void theUserIsInTheWelcomeScreen() {
    }
}

