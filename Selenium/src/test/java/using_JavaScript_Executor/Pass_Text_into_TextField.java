package using_JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class Pass_Text_into_TextField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//Passing text into text field instead of sendkeys()
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.flipkart.com/");
			WebElement search_TF = driver.findElement(By.name("q"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].value=arguments[1]",search_TF,"mobile");
		
			Thread.sleep(3000);
			
			driver.quit();
	}

}
