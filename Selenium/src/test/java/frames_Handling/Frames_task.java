package frames_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://the-internet.herokuapp.com/frames");
driver.findElement(By.xpath("//a[text()='iFrame']")).click();
Thread.sleep(3000);

//closing alert message
driver.findElement(By.xpath("//div[@aria-label='Close']")).click();
Thread.sleep(3000);

//switch driver control from main iframe webpage to text box frame
driver.switchTo().frame("mce_0_ifr");
Thread.sleep(3000);

WebElement tt=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
System.out.println(tt.getText());

//switch driver control back to the main webpage
driver.switchTo().defaultContent();
driver.switchTo().parentFrame();	

driver.quit();
	}

}
