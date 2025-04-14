package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement input = driver.findElement(By.id("small-searchterms"));
		//using sendkeys method
		input.sendKeys("mobiles");
		Thread.sleep(3000);
		//using clear method
		input.clear();
		Thread.sleep(3000);
		
		input.sendKeys("computers");
		
		//using submit method
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		//using click method
		driver.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
