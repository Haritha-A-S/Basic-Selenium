package using_JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_ScrollBar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
//there is no inheritance concept between webdriver and java script executor 
		//so use downcasting
		
		//Scroll webPage (1) using Hard coded coordinates
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,700)");
		
		Thread.sleep(3000);
		
		//Scroll webpage (2) using Element coordinates
/*		WebElement backtotop = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		int xaxis = backtotop.getRect().getX();
		int yaxis = backtotop.getRect().getY();
		js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
*/		
		//Scroll webpage (3) using Element Reference
/*		WebElement backtotop = driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"));
		js.executeScript("arguments[0].scrollIntoView(true)",backtotop);
*/		
		//Scroll webpage (4) Till bottom of the webpage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//Scroll webpage (5) Till top of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		}

}
