package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_DependsOnMethodTest {

	@Test (dependsOnMethods = "registerTest",groups = "regression")
	public void  loginTest()
	{
		Reporter.log("dom_Login", true);
	}
	@Test (groups = "smoke")
	public void registerTest()
	{
		Reporter.log("dom_register", true);
	}
	@Test (dependsOnMethods = "loginTest",groups = "regression")
	public void createTest()
	{
		Reporter.log("dom_create", true);
	}

}
