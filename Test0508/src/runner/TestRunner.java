package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Users\\shiv.singh\\eclipse-workspace-may\\Test0508\\src\\features",
glue= "stepDefinition",
dryRun=true)
public class TestRunner {

}
