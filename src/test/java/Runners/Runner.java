package Runners;

import features.steps.GuestSteps;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/features/sign_up.feature",
        glue = {"features/steps", "utility"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
