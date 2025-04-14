package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_LinkTextANDPartialLinktText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	//linktext <a href> Register </a>
		driver.findElement(By.linkText("Register")).click();
		
	//partiallinktext like for"shopping cart" use only "shopping"
		driver.findElement(By.partialLinkText("Shopping")).click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
