package popups_Handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*
		 * Site not working properly so using some other site
		 * driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(3000);
*/
		
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert2")).click();
		Thread.sleep(2000);
		//if alert is not there, but still if we use we get NoAlertPresentException
		Alert al = driver.switchTo().alert();
		al.accept(); //clicks on ok button
		//al.dismiss(); //then also it clicks ok and works as accept
		Thread.sleep(2000);
		
		//unhandled alert pop exception occurs if we directly perform any action like printing
		WebElement result = driver.findElement(By.xpath("//p[@class='text-center pt-2']"));
		System.out.println(result.getText());
		
		driver.quit();
		
		
	}

}
