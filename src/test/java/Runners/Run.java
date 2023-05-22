package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/features/sign_up.feature",
        glue = {"features/steps"},
        tags = "@appium"
)
public class Run extends AbstractTestNGCucumberTests {
}
