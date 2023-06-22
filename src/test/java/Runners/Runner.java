package Runners;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/test/java/features",
        glue = {"features/steps", "utility"},
        tags = "@Before"
)
public class Runner extends AbstractTestNGCucumberTests {
}
