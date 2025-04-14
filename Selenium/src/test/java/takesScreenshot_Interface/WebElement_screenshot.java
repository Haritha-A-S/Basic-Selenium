package takesScreenshot_Interface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.swiggy.com/restaurants");
Thread.sleep(3000);
WebElement icon=driver.findElement(By.xpath("//*[name()='svg'][@class='VXJlj']"));

File source = icon.getScreenshotAs(OutputType.FILE);
File destination = new File("./screenshots/swiggy1.png");
FileUtils.copyFile(source, destination);
driver.quit();


	}

}
