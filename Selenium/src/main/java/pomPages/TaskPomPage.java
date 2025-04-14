package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPomPage {
		
		//Declaration
	@FindBy(xpath = "//input[@name='first_name']") private WebElement fn;
	@FindBy(xpath = "//input[@name='last_name']") private WebElement ln;
	@FindBy(xpath = "//input[@name='email']") private WebElement en;
	@FindBy(xpath = "//input[@name='phone']") private WebElement pn;
	@FindBy(xpath = "//input[@name='password']") private WebElement pd;
	@FindBy(xpath = "//input[@name='password_confirmation']") private WebElement cd;
	
	
	//Initialization
	public TaskPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getfn() {return fn;}
	public WebElement getln() {return ln;}
	public WebElement geten() {return en;}
	public WebElement getpn() {return pn;}
	public WebElement getpd() {return pd;}
	public WebElement getcd() {return cd;}
}
