package Runners;

import features.steps.GuestSteps;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/features",
        glue = {"features/steps", "utility"},
        tags = "@done"
)
public class Runner extends AbstractTestNGCucumberTests {
}
