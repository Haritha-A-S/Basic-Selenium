package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_FBLogin {
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.facebook.com/");
		boolean title =driver.getTitle().contains("Facebook - log in  or sign up");
		
		//hard assert
		Assert.assertEquals(title, true);
		//Assert.assertEquals(title, false);
		Assert.assertTrue(title);
		
		String s = null;
		Assert.assertNull(s);
		
		//Assert.fail();
		driver.findElement(By.id("email")).sendKeys("selenium");
		driver.findElement(By.id("pass")).sendKeys("diuwh@16");
		driver.findElement(By.name("login")).click();
		
		driver.quit();
		
	}
	
}
