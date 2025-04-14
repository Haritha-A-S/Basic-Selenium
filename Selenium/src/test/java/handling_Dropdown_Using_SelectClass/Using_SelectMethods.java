package handling_Dropdown_Using_SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_SelectMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isMultiple()--->rt is boolean
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//Store the required element and create object for select class
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s =new Select(dropdown);
		
		//1.selectByIndex
	//	s.selectByIndex(7);// selects appliances
		//2.selectByValue
	//	s.selectByValue("search-alias=appliances"); //selects appliances
		//3.selectByVisibleText
		s.selectByVisibleText("Appliances");  //selects appliances
		
		
	    //1.deselectByIndex
	//	s.deselectByIndex(7);// deselects appliances
		//2.deselectByValue
	//	s.deselectByValue("search-alias=appliances"); // deselects appliances
		//3.deselectByVisibleText
	//	s.deselectByVisibleText("Appliances");  // deselects appliances
	//deselects is only used for multiple options	
	
		
		//fetching options
		List<WebElement> options = s.getOptions();
		for(WebElement element : options) {
			System.out.println(element.getText());
		}
		
		//check whether dropdown is single select or multiple select
		System.out.println(s.isMultiple());
		
		driver.quit();
		
	}

}
