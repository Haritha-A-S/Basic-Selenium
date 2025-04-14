package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Tagname_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//using for-each loop iterate all the elements with <a> anchor tag
		for(WebElement ele :links) {
			System.out.println(ele.getText());
		}
		
		driver.quit();

	}

}
