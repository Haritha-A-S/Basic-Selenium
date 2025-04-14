package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathByAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//keys is an enum
		driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
		WebElement price = driver.findElement(By.xpath("//div[text()='POCO C61 (Mystical Green, 64 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
				
		System.out.println(price.getText());
		driver.quit();
		
		

	}

}
