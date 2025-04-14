package popups_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup_Handling {
/*
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
	/*	
		WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']"));
		from.click();
		from.sendKeys("hyd");
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("hyd");)
	//driver.findElement(By.xpath("//p[text()='Hyderabad, India']")).click();
	  driver.findElement(By.xpath("//p[text()='Rajiv Gandhi International Airport']")).click();
		
	WebElement to = driver.findElement(By.xpath("//label[@for='toCity']"));
		to.click();
		to.sendKeys("bang");
		driver.findElement(By.xpath("//p[text()='Bengaluru International Airport']")).click();
		
		WebElement date = driver.findElement(By.xpath("//div[contains(text(),'April')]../../descendant::p[text()='26']"));
		date.click();
		Thread.sleep(3000);
		
		driver.quit();
		*/
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
		     
		       driver.manage().window().maximize();
		      
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		       driver.get("https://www.makemytrip.com/");
		       driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		       WebElement from=driver.findElement(By.xpath("//label[@for='fromCity']"));
		       from.click();
		       //from.sendKeys("hyd");
		       driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("hyd");
		       driver.findElement(By.xpath("//p[text()='Hyderabad, India']")).click();
		       WebElement to=driver.findElement(By.xpath("//label[@for='toCity']"));
		       to.click();
		       to.sendKeys("bang");
		       driver.findElement(By.xpath("//p[text()='Bengaluru International Airport']")).click();
		       WebElement date=driver.findElement(By.xpath("//div[contains(text(),'April')]/../../descendant::p[text()='26']"));
		       date.click();
		       Thread.sleep(2000);
		       driver.quit();
		
		}

}
