package pom_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomSereFBLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we get SlateElementException
		//when webpage is refreshed we get new addresses for same element,but we used we old address in our code
		//so we need to store elements in the form of java objects and store in POM class
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		WebElement un = driver.findElement(By.id("email"));
		WebElement pswd = driver.findElement(By.id("pass"));
		
		un.sendKeys("selenium");
		pswd.sendKeys("avdg@122");
		
		driver.navigate().refresh();
		
		un.sendKeys("sele");
		
		//we get  StaleElementReferenceException
	

	}

}
