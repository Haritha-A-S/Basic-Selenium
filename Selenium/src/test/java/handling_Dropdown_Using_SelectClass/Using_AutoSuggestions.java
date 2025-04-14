package handling_Dropdown_Using_SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_AutoSuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("mob");
		List<WebElement> dynamicElement = driver.findElements(By.xpath("//span[contains(text(),'mob')]"));
		
		for(WebElement element:dynamicElement) {
			System.out.println(element.getText());
			
		}
		
		driver.quit();
		
	}

}
