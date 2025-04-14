package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathByContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Identify text field and pass the text
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("selenium");
		
		//identify pswd textfield and pass the text
		driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("sujrfgjd8454");
		
		//Identify login button and click
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		
		Thread.sleep(3000);

		//close
		driver.quit();
	}

}
