package frames_Handling;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_frame_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.zomato.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(3000);
		
		//switch driver control from main webpage to login frame
		driver.switchTo().frame("auth-login-ui");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9292809536");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//i[@aria-label='close Modal']")).click();
		Thread.sleep(3000);
		
		//switch driver control back to the main webpage
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("ice");
		
		driver.quit();
	}

}
