package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Implicitlywait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		//Thread.sleep(10000);
		driver.findElement(By.id("name")).sendKeys("Selenium");
		driver.findElement(By.id("email")).sendKeys("abihfierhg@bs65");
		driver.findElement(By.id("password")).sendKeys("12356");
	//	driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		driver.findElement(By.xpath("//button[@type ='submit']"));
		
		driver.quit();
		
		

	}

}
