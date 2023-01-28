/**
 *
 */
package stepDefintion;
import java.net.MalformedURLException;

import cucumber.mainCucumber.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * @author 13465
 *
 */
public class Hooks extends TestBase{

	@Before("@regression")
	public void runBeforeAnyScenario() throws MalformedURLException
	{
		LunchTheBrowser();
	}

	@After("@regression")
	public void runAfterAnyScenario()
	{
		driver.quit();
	}
}

