package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchFlipkart {
	WebDriver driver = null;
@Test(groups = "smoke")
public void launchFlipkart() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.flipkart.com/");
	System.out.println("flipkart opened");
}	
@Test(groups = "reg")
public void FlipkartTitleCheck() {
    driver.get("https://www.flipkart.com/");
    System.out.println("Flipkart title: " + driver.getTitle());
    driver.quit();
}
}
