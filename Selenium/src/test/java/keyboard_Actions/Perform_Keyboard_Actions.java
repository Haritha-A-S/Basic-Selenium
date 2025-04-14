package keyboard_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_Keyboard_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.amazon.in/");
		
		WebElement search_Text_Field = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions act =new Actions(driver);
		act.keyDown(Keys.SHIFT).perform();
		
		search_Text_Field.sendKeys("mobile");
		
		act.keyUp(Keys.SHIFT).perform();
		//whenever using keyboard actions remember to deactivate it,otherwise keyboard will be encripted after 6th time 
		//cannot use alphabetical keys,for that we use robot class
		driver.quit();

	}

}
