package orgtk;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/"},
        plugin = {"pretty","html:target/cucumber.html", "json:target/cucumber.json"},

        tags = "@smoke",
        publish = true
)


public class TestRunner {



}