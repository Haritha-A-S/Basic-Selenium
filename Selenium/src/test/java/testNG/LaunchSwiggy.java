package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchSwiggy {
	WebDriver driver= null;
@Test(groups = "smoke")
public void Swiggy() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.swiggy.com/");
	System.out.println("swiggy opened ");
	
}
@Test(groups = "reg")
public void swiggyTitleCheck() {
    driver.get("https://www.swiggy.com/");
    System.out.println("Swiggy title: " + driver.getTitle());
    driver.quit();
}
}
