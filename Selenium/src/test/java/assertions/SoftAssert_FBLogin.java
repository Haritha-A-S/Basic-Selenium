package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_FBLogin {

	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.facebook.com/");
		//soft assert -object creation
		SoftAssert soft = new SoftAssert();
		boolean verifytitle =driver.getTitle().contains("Facebook - log in  or sign up");
		
		soft.assertEquals(verifytitle, true);
		
		driver.findElement(By.id("email")).sendKeys("selenium");
		driver.findElement(By.id("pass")).sendKeys("diuwh@16");
		driver.findElement(By.name("login")).click();
		
		driver.quit();
		//to get assertion error...passes the test script
		soft.assertAll();
		
	}
}
