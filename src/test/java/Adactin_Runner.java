import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dhanvi\\eclipse-workspace\\Adactin_cucumber\\src"
		+ "\\test\\java\\com\\feature\\Adactin.feature",
		glue = "com.stepdefinition",
		dryRun = true,
		publish = true,
		monochrome = true)
public class Adactin_Runner {

}
