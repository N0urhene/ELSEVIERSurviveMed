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
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup")).click();
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

    @And("The user click on the second element I go to school in")
    public void theUserClickOnTheSecondElementIGoToSchoolIn() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")).click();
    }

    @And("The user scroll to choose his country or enter the name on the search bar")
    public void theUserScrollToChooseHisCountryOrEnterTheNameOnTheSearchBar() {
        Hook.scroll();
        driver.findElement(By.id("android:id/search_src_text")).click();
        driver.findElement(By.id("android:id/search_src_text")).sendKeys("tunisia");
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/constraint_layout_content")).click();
    }

    @And("The user click on the next element")
    public void theUserClickOnTheNextElement() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")).click();
        ;
    }

    @And("The user choose his university")
    public void theUserChooseHisUniversity() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")).click();
        ;
    }

    @And("The user click on the last element My year of study is")
    public void theUserClickOnTheLastElementMyYearOfStudyIs() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")).click();
    }

    @And("The user choose his study year")
    public void theUserChooseHisStudyYear() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]")).click();
    }

    @And("The user is in the welcome screen")
    public void theUserIsInTheWelcomeScreen() {
        Assert.assertTrue(driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/logo_opt_in")).isDisplayed());
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_optin_register")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/checkbox_optin_register")).click();
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_btn_next_opt_in")).click();
    }

    @Then("The user should be logged in to the home screen")
    public void theUserShouldBeLoggedInToTheHomeScreen() {
        driver.findElement(By.id("com.elsevier.education.SurviveMedApp:id/layout_next_personalisation")).click();
    }

    @And("The user click on the third choice just curious")
    public void theUserClickOnTheThirdChoiceJustCurious() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")).click();
    }

    @And("The user click on the second choice a medical Professional")
    public void theUserClickOnTheSecondChoiceAMedicalProfessional() {
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")).click();
    }
}

