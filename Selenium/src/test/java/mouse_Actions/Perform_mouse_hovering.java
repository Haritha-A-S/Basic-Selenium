package mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_mouse_hovering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https:/www.ajio.com/");
		
		WebElement kids = driver.findElement(By.xpath("//span[text()='KIDS']"));
		
		Actions act =new Actions(driver);
		act.moveToElement(kids).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Sets")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
