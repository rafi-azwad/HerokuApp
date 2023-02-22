package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags = "@Test1 or @Test2",
        features = {
                "src/test/resources/Features"},

        glue = {"WebStepDefination"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty", "html:build/reports/feature.html"
        })

@Test
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {


}
