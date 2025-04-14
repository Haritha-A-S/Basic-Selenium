package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_EnabledFlagTest {


	@Test (priority = 1,groups = "regression")
	public void  loginTest()
	{
		Reporter.log("EF_logged in", true);
	}
	@Test (enabled = false, groups = "smoke")
	public void registerTest()
	{
		Reporter.log("EF_Registered", true);
	}
	@Test (priority = 2, invocationCount = 3, groups = "regression")
	public void createTest()
	{
		Reporter.log("EF_Created", true);
	}
}
