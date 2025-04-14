package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Using_FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//fluent wait - ignores exceptions and used to customize polling period
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//fluent wait class 4 lines must
		
		FluentWait<WebDriver> fwait= new FluentWait<WebDriver>(driver);
		//Duration of seconds to wait
		fwait.withTimeout(Duration.ofSeconds(10));
		//customizing the polling period
		fwait.pollingEvery(Duration.ofSeconds(1));
		//Ignoring the exception in given time duration
		fwait.ignoring(Exception.class);
		
		driver.findElement(By.id("email")).sendKeys("Selenium");
		driver.findElement(By.id("pass")).sendKeys("admo@1343");
		driver.findElement(By.name("login")).click();
		
	}

}
