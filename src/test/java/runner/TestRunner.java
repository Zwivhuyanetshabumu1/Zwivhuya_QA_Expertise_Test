package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="FeatureFile",glue="stepsDefinitions",monochrome=true,plugin= {"html:target/cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests{
	


}
