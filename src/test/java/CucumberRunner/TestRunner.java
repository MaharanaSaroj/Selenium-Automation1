package CucumberRunner;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature", glue="StepDefinations")
public class TestRunner {

}
