package takesScreenshot_Interface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage_screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//screenshot of swiggy webpage
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com/restaurants");
		Thread.sleep(3000);
		
		//Takes the screenshot of the webpage
		//Typecast takesscreenshot with webdriver reference
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		//Store screenshot in a temporary file
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		//Create  an empty file
		File destination = new File("./screenshots/swiggy.png");
		
		//Copy the screenshot in new file
		FileUtils.copyFile(source, destination);
		
		//Close the browser
		driver.quit();

	}

}
