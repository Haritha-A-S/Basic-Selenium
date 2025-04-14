package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Identify the UN Textfield and pass the text
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("selinium");
		
		//Identify password textfield and pass the text
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("achiue@5i-3");
		
		//Identify login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		

	}

}
