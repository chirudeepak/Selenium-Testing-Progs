package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\features",
glue={"testrunner"},
plugin= {"prettty","target:HTMLREPORTS/a1.html"})


public class testrunner1 {

}
