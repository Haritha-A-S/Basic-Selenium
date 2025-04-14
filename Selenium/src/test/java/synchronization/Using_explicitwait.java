package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. visibility of (element)
		//2. title contains("title")
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		//now implicit wait is useful for findelelements
		
		driver.get("https://shoppersstack.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("ShopperStack"));
		
		System.out.println(driver.getTitle());
		
		//explicitly wait condition using visibility of method
		
		WebElement kids= driver.findElement(By.id("kids"));
		wait.until(ExpectedConditions.visibilityOf(kids));
		kids.click();
		
		driver.quit();
		

	}

}
