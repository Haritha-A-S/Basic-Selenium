package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathByGroupIndexing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("iurehhhvn");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("156@jgik");
		driver.findElement(By.xpath("//button")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
