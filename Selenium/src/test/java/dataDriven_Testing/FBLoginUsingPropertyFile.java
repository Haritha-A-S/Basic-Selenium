package dataDriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginUsingPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./src/test/resources/FBDataLogin.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String URL = p.getProperty("url");
		String USERNAME =p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		String TIMEOUTS = p.getProperty("timeouts");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//convert string to long datatype for timeouts
		long time = Long.parseLong(TIMEOUTS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
