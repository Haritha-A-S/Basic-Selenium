package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_HelperAttributesTest {
	@Test (priority = 1, groups = "regression")
	public void  loginTest()
	{
		//only prints inside the console
		System.out.println("login sucessfull");
		//only print in report
		Reporter.log("LOGIN : SUCCESS");
		//for both in console and in report
		Reporter.log("logged in", true);
	}
	@Test (priority = -2, groups = "smoke")
	public void registerTest()
	{
		System.out.println("register Successfull");
		Reporter.log("REGISTER : SUCCESS");
		Reporter.log("Registered", true);
	}
	@Test (priority = 2, groups = "regression")
	public void createTest()
	{
		System.out.println("create Successfull");
		Reporter.log("CREATE : SUCCESS");
		Reporter.log("created", true);
	}
	

}
