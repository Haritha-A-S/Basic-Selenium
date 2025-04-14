package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathOperators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//for search button bar using AND - Or operators
		driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("mobiles"+Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@class'KzZ' or text()= 'POCO C61 (Diamond Dust Black, 64 GB)']")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
