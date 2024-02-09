package driplane.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "driplane/stepdefinitions",
        tags = "@login",
        dryRun = false
)


public class Runner {
}
