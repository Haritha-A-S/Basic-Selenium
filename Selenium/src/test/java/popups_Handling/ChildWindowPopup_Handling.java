package popups_Handling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup_Handling {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
		Thread.sleep(2000);
		
		String ParentWid = driver.getWindowHandle();
		driver.findElement(By.xpath("//div[text()='POCO C61 (Ethereal Blue, 64 GB)']")).click();
		System.out.println("parent window id is" + driver.getTitle());
		
		Set<String> wids = driver.getWindowHandles();
		
		for(String s:wids)
		{
			driver.switchTo().window(s);
				if(driver.getTitle().contains("POCO C61 ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com"))
				{
					//to get screenshot of child window
					TakesScreenshot ts = (TakesScreenshot)driver;
					File src = ts.getScreenshotAs(OutputType.FILE);
					File dest = new File("./screenshots/ChildwidMobile.png");
					FileUtils.copyFile(src, dest);
					
					//to add the product to the cart
					//driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
					Thread.sleep(4000);
					
					break;
				}

		}
		driver.switchTo().window(ParentWid);
		Thread.sleep(3000);
		System.out.println("parent window id is" + driver.getTitle());
		
		driver.quit();
	}

}
