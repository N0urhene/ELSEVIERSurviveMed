package Runners;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/features",
        glue = {"features/steps", "utility"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
