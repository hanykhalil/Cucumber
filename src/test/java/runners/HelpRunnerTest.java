/**
 *
 */
package runners;

/**
 * @author 13465
 *
 */

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\Cucumber\\src\\test\\java\\features"
, glue = "stepDefintion", tags = "@regression", plugin = {"pretty", "html:target/reports/cucumberReport.html", "json:target/reports/cucumberReport.json"}, monochrome = true)
public class HelpRunnerTest {

}

