package listeners_implementation;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners_utility.Listeners.class)
//we can't achieve multiple inheritance so we are extending base class
public class Using_listeners {

	@Test(retryAnalyzer = listeners_utility.RetryAnalyser_util.class)
	public void demo() {
		System.out.println("test execution");
		//to check test script failed
		Assert.fail();
	}
}
