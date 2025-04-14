package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_ThreadPoolSize {
	@Test(groups = "regression")
	public void  login()
	{
		Reporter.log("TPS_Login", true);
	}
	@Test (groups = "smoke")
	public void register()
	{
		Reporter.log("TPS_register", true);
	}
	@Test (invocationCount = 3, threadPoolSize = 3,groups = "regression")
	//executes on 3 threads
	public void create()
	{
		Reporter.log("TPS_create", true);
	}
}
