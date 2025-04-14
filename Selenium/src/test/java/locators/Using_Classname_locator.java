package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Classname_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//class name use any part of it, don't use complete class name
		driver.findElement(By.className("inputtext")).sendKeys("selinium");
		driver.findElement(By.className("_9npi")).sendKeys("abfj@45462");
		driver.findElement(By.className("_42ft")).click();
		
		driver.quit();

	}

}
