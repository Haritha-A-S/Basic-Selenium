package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPomPage {

	//Declaration
	@FindBy(id="email")
	private WebElement un;
	
	@FindBy(id="pass")
	private WebElement pswd;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//h2")
	private WebElement header;

	
	//Initialization(is done by using constructor call)
	public FBLoginPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
		public void getUn(String user) {
		un.sendKeys(user);
		}
		public WebElement getPswd() {
		return pswd;
		}
		public void getLoginbtn() {
			loginbtn.click();
		}
		public String getHeader() {
			return header.getText();
		}
		
	}	

