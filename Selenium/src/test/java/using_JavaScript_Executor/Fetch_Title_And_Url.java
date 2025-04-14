package using_JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Title_And_Url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.swiggy.com/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//fetch the URL
		//if url is used we get null
		System.out.println(js.executeScript("return document.URL"));
		
		//fetch the title
		System.out.println(js.executeScript("return document.title"));
		
		driver.quit();
	}

}
