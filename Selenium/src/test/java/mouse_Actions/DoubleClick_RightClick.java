package mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement Rightclickk =driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act =new Actions(driver);
		//Right click
		act.moveToElement(Rightclickk).contextClick(Rightclickk).build().perform();
		
		Thread.sleep(3000);
		
		//Refresh
		driver.navigate().refresh();
		
		//double click
		WebElement Doubleclickk =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(Doubleclickk).perform();
		
		driver.quit();
		

	}

}
