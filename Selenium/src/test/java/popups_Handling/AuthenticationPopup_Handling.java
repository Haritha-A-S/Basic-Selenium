package popups_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//admin:admin@ i.e., username:password should be given in website link
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		WebElement result = driver.findElement(By.xpath("//p"));
		System.out.println(result.getText());
		
		driver.quit();
	}

}
