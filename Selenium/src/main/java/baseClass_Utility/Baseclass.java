package baseClass_Utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
@BeforeSuite
public void bs() {
	System.out.println("BS:Database connection");
}
@AfterSuite
public void as() {
	System.out.println("AS:Close Database connection");
}
@BeforeTest
public void bt() {
	System.out.println("BT: Parallel Execution");
}
@AfterTest
public void at() {
	System.out.println("AT: Parallel Execution");
}
@BeforeClass
public void bc() {
	System.out.println("BC: Launch Browser");
}
@AfterClass
public void ac() {
	System.out.println("AC: Quit Browser");
}
@BeforeMethod
public void bm() {
	System.out.println("BM: Login");
}
@AfterMethod
public void am() {
	System.out.println("AM: Logout");
}
}
