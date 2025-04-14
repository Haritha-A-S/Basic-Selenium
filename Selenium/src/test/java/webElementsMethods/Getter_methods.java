package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getter_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//getter methods
		WebElement register = driver.findElement(By.linkText("Register"));
		System.out.println("Text :"+ register.getText());
		System.out.println("Attribute :"+ register.getAttribute("class"));
		System.out.println("Tagname :"+ register.getTagName());
		System.out.println("getwidth from size:"+ register.getSize().getWidth());
		System.out.println("getheight from size :"+ register.getSize().getHeight());
		System.out.println("getlocation :"+ register.getLocation());
		System.out.println("getX from rectangle:"+ register.getRect().getX());
		System.out.println("getY from rectangle :"+ register.getRect().getY());
		System.out.println("getCssValue :"+ register.getCssValue("color"));
		driver.quit();
	}

}
