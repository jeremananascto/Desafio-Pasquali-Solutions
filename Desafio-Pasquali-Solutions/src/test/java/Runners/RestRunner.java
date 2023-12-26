package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-report/cucumber.json","html:target/reports/"},
        features = {"src/test/resources/Features"},
        tags = {""},
        glue = {""}

)


public class RestRunner {
}
