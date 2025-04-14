package takesScreenshot_Interface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_webpage_webelement_SS {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		//Webpage screenshot of Amazon Website
		//typecast--->store--->create--->copy
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/AmazonWP.png");
		FileUtils.copyFile(source, destination);
		
		//WebElemnet screenshot of Amazon icons
		WebElement icon1=driver.findElement(By.id("nav-logo-sprites"));
        WebElement icon2 = driver.findElement(By.id("nav-search-submit-button"));
		
        File source1 = icon1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("./screenshots/AmazonWE1.png");
		FileUtils.copyFile(source1, destination1);
		
		File source2 = icon2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("./screenshots/AmazonWE2.png");
		FileUtils.copyFile(source2, destination2);
		
		driver.quit();
		
	}

}
