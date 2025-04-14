package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_IdANDName_locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to an application
		driver.get("https://www.facebook.com/");
		
		//Identify UN text field and pass the text
		//id value is alphanumeric and has the possibility of changing frequently
		//i.e, dynamic in nature
		driver.findElement(By.id("email")).sendKeys("selenium");
		
		//Identify Password text field and pass the text
		//name value is not dynamic in nature so we have to use it
		driver.findElement(By.name("pass")).sendKeys("acg@1234");
		
		//Identify login button and click on it
		driver.findElement(By.name("login")).click();
		
		//explicit wait time(in order to see the changes)
		Thread.sleep(3000);
		
		//to quit the browser completely and to avoid socketException ,
		//which may occur during close()
		driver.quit();
		

	}

}
