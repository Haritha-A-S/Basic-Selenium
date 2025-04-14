package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_InvocationCount_PriorityTest {

	@Test (priority = 1, groups = "regression")
	public void  loginTest()
	{
		Reporter.log("PT_IC_logged in", true);
	}
	@Test (priority = -2, groups = "smoke")
	public void registerTest()
	{
		Reporter.log("PT_IC_Registered", true);
	}
	@Test (priority = 2, invocationCount = 3, groups = "regression")
	public void createTest()
	{
		Reporter.log("PT_IC_Created", true);
	}
	

}
