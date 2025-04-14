package using_JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/Hp/Desktop/Selenium%20files/samplewebpage.html");
		
		//Handling disabled elements and passing text into it
		WebElement un = driver.findElement(By.id("UN"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1]",un,"selenium");
		Thread.sleep(3000);
		
		//Refresh the webpage- erases previous history
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
