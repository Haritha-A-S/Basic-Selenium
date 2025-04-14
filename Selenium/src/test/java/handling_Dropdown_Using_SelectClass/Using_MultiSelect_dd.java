package handling_Dropdown_Using_SelectClass;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_MultiSelect_dd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");
		WebElement MS_DD = driver.findElement(By.id("multi-select"));
		Select s = new Select(MS_DD);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("Ohio");
		Thread.sleep(2000);
		s.selectByContainsVisibleText("Washington");
		Thread.sleep(2000);
		
		System.out.println("First selected option :" + s.getFirstSelectedOption().getText());
		
		List<WebElement> listt = s.getAllSelectedOptions();
		for(WebElement element : listt) {
		System.out.println("Selected options:" + element.getText());
		}
		
		List<WebElement> options = s.getOptions();
		for (WebElement element : options) {
			System.out.println("options :" + element.getText());
		}
		
	//	s.deselectByIndex(2);
	//	Thread.sleep(2000);
		
	//	s.deselectByValue("Ohio");
	//	Thread.sleep(2000);
		
	//	s.deselectByVisibleText("Washington");
	//	Thread.sleep(2000);
		s.deselectAll();
		System.out.println("multi select dd :" + s.isMultiple());
		
		driver.quit();
	}

}
