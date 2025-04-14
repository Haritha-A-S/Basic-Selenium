package dataDriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		//Fetching single data from excel
		
		//common data is stored in property file as it is less
		//test data is stored in excel file as it is more
		//copy file and store it in src test resource get accessibility 
		
		// Convert physical file into java object
		FileInputStream fis = new FileInputStream("./src/test/resources/DataDrivenWorkBook.xlsx");
		//Fetch the workbook
		//import from ss user model
		Workbook wb = WorkbookFactory.create(fis);
		//Fetch the sheet
		 Sheet sh = wb.getSheet("Sheet1");
		//Fetch the row
		Row r= sh.getRow(1);
		//Fetch the String type cell(Product name)
		Cell c = r.getCell(0);
		//Fetch the string type cell(Product name)
		String name = c.getStringCellValue();
		System.out.println(name);
		
		//Fetch the numeric cell (Product price)
		Cell c1 = r.getCell(1);
		//Fetch the numeric cell (Product Price)
		double price = c1.getNumericCellValue();
		System.out.println(price);
		
		System.out.println(name + " " + price);
		
		//close excel file otherwise it gets corrupted
		wb.close();
		
	
	}

}
