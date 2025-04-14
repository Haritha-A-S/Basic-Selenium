package mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		Actions act= new Actions(driver);
		act.scrollByAmount(0, 7000).perform();
		
		Thread.sleep(3000);
		WebElement backtotop= driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		act.scrollToElement(backtotop).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
