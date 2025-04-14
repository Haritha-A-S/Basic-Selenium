package popups_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//uploading desktop application file to online site
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com//upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Hp\\Desktop\\Selenium files");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
