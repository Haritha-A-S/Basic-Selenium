package mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//drag_element--->DE   drop_location--->DL 
		WebElement DE1 = driver.findElement(By.xpath("//a[text()=' BANK ']")) ;
		WebElement DL1 = driver.findElement(By.id("bank"));
		Actions act = new Actions(driver);
		act.dragAndDrop(DE1,DL1).perform();
		
		WebElement drag_element = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement drop_location = driver.findElement(By.id("amt7"));
		act.dragAndDrop(drag_element, drop_location).perform();
		
		WebElement DE3 = driver.findElement(By.xpath("//a[text()=' SALES ']")) ;
		WebElement DL3 = driver.findElement(By.id("LOAN"));
		act.dragAndDrop(DE3,DL3).perform();
		
		WebElement DE4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement DL4 = driver.findElement(By.id("amt8"));
		act.dragAndDrop(DE4,DL4).perform();
		
		String perfect = driver.findElement(By.xpath("//a[text()='Perfect!']")).getText();
		
		System.out.println(perfect);
		driver.quit();
		
		

	}

}
