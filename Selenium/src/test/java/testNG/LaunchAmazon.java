package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchAmazon {
	WebDriver driver = null;
	@Test(groups = "smoke")
	public  void launchAmazon() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.amazon.com/");
	System.out.println("Amazon opened");
	
	}
	@Test(groups = "reg")
    public void AmazonTitleCheck() {
        driver.get("https://www.amazon.com/");
        System.out.println("Amazon title: " + driver.getTitle());
        driver.quit();
    }
}
