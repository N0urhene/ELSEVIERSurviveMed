package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/features/guest_signup.feature",
        glue = {"features/steps"},
        tags = "@appium"
)
public class Run extends AbstractTestNGCucumberTests {
}
