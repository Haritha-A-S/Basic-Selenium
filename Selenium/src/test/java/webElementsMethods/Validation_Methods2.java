package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_Methods2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.name("NewsletterEmail")).sendKeys("news@gmail.com");
		//verify subscribe button is enabled
		WebElement subscribe_btn = driver.findElement(By.id("newsletter-subscribe-button"));
		if(subscribe_btn.isEnabled())
		{
			subscribe_btn.click();
			Thread.sleep(3000);
		}
		else
		{
			System.out.println("Subscribe button is not enabled");
		}
		
		//verify isSelected method
		WebElement poorRadioBtn = driver.findElement(By.id("pollanswers-3"));
		poorRadioBtn.click();
		if(poorRadioBtn.isSelected())
		{
			System.out.println("poor radio button is selected");
		}
		else
		{
			System.out.println("poor radio button is not selected");
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
