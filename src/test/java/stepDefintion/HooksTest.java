/**
 *
 */
package stepDefintion;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * @author 13465
 *
 */
public class HooksTest extends BaseTest{
	
	@Before("@regression")
	public void runBeforeAnyScenario()
	{
		
	}

	@After("@regression")
	public void runAfterAnyScenario()
	{
		driver.quit();
	}
}

