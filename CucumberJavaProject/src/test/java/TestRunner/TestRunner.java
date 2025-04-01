package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="./src/test/java/feature",
		glue= {"StepDefinations"},
		tags= ("@Test_1 and @Regression"),
		dryRun=false,monochrome=true
		)


public class TestRunner {

}
