package stepsdefinitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:/Users/hitss/git/repository2/ProvidaPOM/src/main/java/feature/SearchProvida.feature",
              glue = {"stepDefinitions"},
              monochrome = true,
        plugin = {"pretty","html:target/HtmlReporst"},
        tags = "@tag1"
        
        )


public class TestRunner {

}
