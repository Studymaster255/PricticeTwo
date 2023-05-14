package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeature"},
		glue="StepDefination",
		dryRun=false,
		tags= "@cart",
		plugin= {"html:target/cucumber-reports/reports1.html",
				"rerun:target/failedrerun.txt"
				
				
				
		}
		
		)

public class TestRunner {

}
