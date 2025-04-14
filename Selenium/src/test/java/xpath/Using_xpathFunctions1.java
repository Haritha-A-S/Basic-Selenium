package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathFunctions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//starts-with()
		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal-e')]")).sendKeys("selenium");
		
		driver.findElement(By.xpath("//input[starts-with(@aria-label,'Pass')]")).sendKeys("abc@123");
		
		driver.findElement(By.xpath("//button[normalize-space(text()='Login')]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
