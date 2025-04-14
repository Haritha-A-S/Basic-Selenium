package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_CssSelector_locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//do inspection for search bar,pass text and click on enter 
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("computer");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
