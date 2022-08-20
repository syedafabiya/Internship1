package runnerPKG;

import org.junit.runner.RunWith;
//junit

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\suzan\\eclipse-workspace\\Internship1\\src\\test\\java\\featurePKG",
                  glue="stepdefinationPKG",
                  plugin= {"pretty", "html:target/cucumberReport.html", "json:target/jsonReport.json"},
                  monochrome = true
		)
public class RunnerClass {

}
