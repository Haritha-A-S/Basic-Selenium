package pom_Testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPages.FBLoginPomPage;

public class PomResourceFBLogin {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		//creating an element object from pom pages 
		
		FBLoginPomPage fb = new FBLoginPomPage(driver);
		fb.getUn("selenium");
		fb.getPswd().sendKeys("abfy@126");
		
		driver.navigate().refresh();
		
		fb.getUn("Haritha");
		fb.getPswd().sendKeys("hau@43");
		fb.getLoginbtn();
		
	}

}
