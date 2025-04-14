package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_xpathTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.flipkart.com/search?q=mobiles&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
		
		//using xpath by text  //tagname[text()='tv']
		driver.findElement(By.xpath("//div[text()='1. REDMI 13 5G (Black Diamond,...']")).click();

		//using xpath by attribute //tagname[@AN='AV']
		
		driver.quit();
	}

}
