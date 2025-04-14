package listeners_utility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener, ISuiteListener {

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Suite Execution Finished : Report backup");
		}

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Suite Execution Started : Report configuration");
		
		}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"--failed--");
		
		System.out.println("write screenshot code here to capture failure");
			}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"--skipped--");
		
		}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"--started--");
		
			}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+"--success--");
		
		}

}
