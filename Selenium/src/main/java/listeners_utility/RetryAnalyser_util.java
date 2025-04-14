package listeners_utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser_util  implements IRetryAnalyzer{

	int count = 0;
	int max_retry=5;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<max_retry) {
			count++;
			return true;
		}
		return false;
	}

}
