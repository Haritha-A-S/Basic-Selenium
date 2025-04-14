package task;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngFlipkartNavigation {
	@Parameters("browser")

	@Test(groups = "functional")
	public void launchFlipkart(String BROWSER)
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
		
		driver.get("https://www.flipkart.com/");
	}
}
