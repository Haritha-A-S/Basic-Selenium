package popups_Handling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
Thread.sleep(10000);

driver.findElement(By.id("buttonAlert1")).click();
Thread.sleep(2000);
//handling alert
Alert al =driver.switchTo().alert();
al.sendKeys("yes");
al.accept();
Thread.sleep(2000);

WebElement result = driver.findElement(By.xpath("//p[@class='pt-2 text-center']"));
System.out.println(result.getText());

driver.quit();



	}

}
