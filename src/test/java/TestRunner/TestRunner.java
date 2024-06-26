package TestRunner;

import io.cucumber.core.gherkin.Feature;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features"
        ,glue = "stepdefinitions"
,tags = "@invalid"
        , dryRun = true
)
public class TestRunner {
}
