package popups_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		Thread.sleep(2000);
		
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss(); //clicks on cancel button
		Thread.sleep(2000);
		
		WebElement result = driver.findElement(By.xpath("//p[@class='pt-2 text-center']"));
		System.out.println(result.getText());
		
		driver.quit();
		
		
	}

}
