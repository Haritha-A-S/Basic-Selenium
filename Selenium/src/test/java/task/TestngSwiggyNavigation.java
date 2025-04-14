package task;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngSwiggyNavigation {
@Parameters("browser")
	@Test(groups = "regression")
	public void launchSwiggy(String BROWSER)
	{
		WebDriver driver = null;
		if(BROWSER.equals("chrome")) {
			driver= new ChromeDriver();
		}
		else if(BROWSER.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver= new ChromeDriver();
		}
		
	
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com/");
	}
	
	
}
