package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_explicitwait_ElementToBeclickable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Explicit wait based on elementToBeClickable(element) method
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Selenium");
		driver.findElement(By.id("pass")).sendKeys("admo@1343");
		
		WebElement login =  driver.findElement(By.name("login"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		
		login.click();
		Thread.sleep(3000);
		driver.quit();
			

	}

}
