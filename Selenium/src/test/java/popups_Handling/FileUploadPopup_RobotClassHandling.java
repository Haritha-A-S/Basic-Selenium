package popups_Handling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopup_RobotClassHandling {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//copying file path on system clipboard
		StringSelection str = new StringSelection("C:\\Users\\Hp\\Desktop\\Selenium files");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		driver.get("https://the-internet.herokuapp.com//upload");
		WebElement upload = driver.findElement(By.id("file-upload"));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.click(upload).perform();
		Thread.sleep(5000);
		
		//pasting the filepath on clipboard of system
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		//driver.quit();
		
	}

}
