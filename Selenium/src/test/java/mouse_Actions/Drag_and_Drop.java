package mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag_element = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement drop_location = driver.findElement(By.id("amt7"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag_element, drop_location).perform();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
