package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("toys");
		
		//Using name() we can find xpath for images ,icons  
		//*[name()='svg'][@an='av']
		//here we find xpath for search icon
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		driver.quit();
	}

}
