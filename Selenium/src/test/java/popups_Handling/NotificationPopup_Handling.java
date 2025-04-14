package popups_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//before launching itself we disable notifications
		//avoids notification and location popups
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-geolocation");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0&scenario=1");
		driver.findElement(By.id("browNotButton")).click();
		
		 Thread.sleep(2000);
		 
		 driver.quit();
	}

}
