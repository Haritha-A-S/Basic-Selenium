package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("Password"));
		WebElement login = driver.findElement(By.name("login"));
		
		if(username.isDisplayed()) {
			username.sendKeys("Selenium");
		}else {
			System.out.println("Username is not dislayed : Test Failed ");
		}
		
		
		if(password.isDisplayed()) {
			password.sendKeys("abuiuk@165");
		}else {
			System.out.println("Password is not displayed :Test Failed");
		}
		
		if(login.isDisplayed()) {
			login.click();
		}else {
			System.out.println("Login button is not displayed : Test Failed");
		}
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
