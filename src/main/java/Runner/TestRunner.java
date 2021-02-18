package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\Mayuri\\eclipse-workspace\\CucumberPOMDemoProject\\src\\test\\resources\\Features"
 ,glue={"stepDefinitions","AppHookes"},
 plugin= {"pretty","html:target/test-output"}
 
 )
public class TestRunner {


}
