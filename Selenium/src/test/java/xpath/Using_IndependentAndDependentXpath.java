package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_IndependentAndDependentXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/");
		
		driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
		//WebElement price = driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']/../../div[@class='add-info']/div/span"));
		
		WebElement price = driver.findElement(By.xpath("//div[contains(text(),'realme P')]/../../div[contains(@class,'BfVC2z')]/div/div/div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(price.getText());
		driver.quit();
		

	}

}
