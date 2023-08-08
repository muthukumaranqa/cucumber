package cucumber.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src/test/java/cucumber/Feature/Login.feature",
	glue = "cucumber.Testdefinition",
	dryRun = false,
	plugin = {"pretty"}
	

	
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
