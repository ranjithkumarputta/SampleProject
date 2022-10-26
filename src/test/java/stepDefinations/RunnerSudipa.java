package src.test.java.stepDefinations;
package IM_Main.Teststeps;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", dryRun = false , tags = "@Positive")
//@CucumberOptions(features = ".", dryRun = false , tags = "@Negative")
public class RunnerSudipa {
}
