/**
 *
 */
package stepDefintion;
import cucumber.mainCucumber.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * @author 13465
 *
 */
public class HooksTest extends TestBase{
	
	@Before("@regression")
	public void runBeforeAnyScenario()
	{
		
	}

//	@After("@regression")
//	public void runAfterAnyScenario()
//	{
//		driver.quit();
//	}
}

