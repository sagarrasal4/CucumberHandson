package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Login\\login.feature",
glue = {"SetDefination"},
monochrome=true,//to make console output in better format 
dryRun = false,
strict=true,//to check if any step is missed or it s fine in step defination file
plugin 	= {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml",}
)
public class Test_runner {

}
