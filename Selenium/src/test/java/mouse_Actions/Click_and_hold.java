package mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_and_hold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement element =  driver.findElement(By.name("G"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
		
		//element is found by grouping
		WebElement share = driver.findElement(By.xpath("(//button[@aria-label='Share'])[2]"));
		act.moveToElement(share).perform();
		
		Thread.sleep(3000);
		act.release(element).perform();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
