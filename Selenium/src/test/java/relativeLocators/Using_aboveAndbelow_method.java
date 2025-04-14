package relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

//Login to FB page using relative locators present in only sel4 version

public class Using_aboveAndbelow_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//to find only password element
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement password = driver.findElement(By.id("pass"));
		
		WebElement username = driver.findElement(RelativeLocator.with(By.tagName("input")).above(password));
		
		username.sendKeys("selenium");
		password.sendKeys("abc@123");
		
		WebElement loginbtn = driver.findElement(RelativeLocator.with(By.tagName("button")).below(password));
		loginbtn.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
