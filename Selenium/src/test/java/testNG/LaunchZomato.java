package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchZomato {
	WebDriver driver = null;
	@Test(groups = "smoke")
	public void zomato() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.zomato.com/");
		
	}
	@Test(groups = "reg")
    public void zomatoTitleCheck() {
        driver.get("https://www.zomato.com/");
        System.out.println("Zomato title: " + driver.getTitle());
        driver.quit();
    }

}
