package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\login",
//glue = {"SetDefination"},
monochrome=true,
dryRun = false,
strict=true,
plugin 	= {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml",}
)
public class Testrunner {

}
