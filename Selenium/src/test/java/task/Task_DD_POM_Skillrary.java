package task;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPages.TaskPomPage;

public class Task_DD_POM_Skillrary {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		// Data Driven And POM task on SKILLRARY website
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://sandbox.skillrary.com/user/register");
		
		FileInputStream fis = new FileInputStream("./src/test/resources/DataDrivenWorkBook.xlsx");
		
		 Workbook wb = WorkbookFactory.create(fis);
		 
		 Sheet sh = wb.getSheet("TaskSheet");
		 
		 Row r= sh.getRow(0);
		 Cell c = r.getCell(1);
		 String Firstname = c.getStringCellValue();
		 driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(Firstname);
		 
		 Row r1= sh.getRow(1);
		 Cell c1 = r1.getCell(1);
		 String lastname = c1.getStringCellValue();
		 driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname);
		
		 Row r2= sh.getRow(2);
		 Cell c2 = r2.getCell(1);
		 String EmailAddress = c2.getStringCellValue();
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(EmailAddress);
		 
		 Row r3= sh.getRow(3);
		 Cell c3 = r1.getCell(1);
		 String MobileNumber = c1.getStringCellValue();
		 driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(MobileNumber);
				 
		 Row r4= sh.getRow(4);
		 Cell c4 = r4.getCell(1);
		 String Password = c1.getStringCellValue();
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
				 
		 Row r5= sh.getRow(5);
		 Cell c5 = r5.getCell(1);
		 String ConfirmPassword = c1.getStringCellValue();
		 driver.findElement(By.xpath("//input[@name='password_confirmation']")).sendKeys(ConfirmPassword);	
				 
		 wb.close();
		 
		 driver.navigate().refresh();
	
		 Thread.sleep(5000);
		 TaskPomPage tpp= new  TaskPomPage(driver);
		 tpp.getfn().sendKeys(Firstname);
		 tpp.getln().sendKeys(lastname);
		 tpp.geten().sendKeys(EmailAddress);
		 tpp.getpn().sendKeys(MobileNumber);
		 tpp.getpd().sendKeys(Password);
		 tpp.getcd().sendKeys(ConfirmPassword);
		
	}

		
	}




