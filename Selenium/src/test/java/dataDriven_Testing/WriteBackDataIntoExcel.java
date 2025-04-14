package dataDriven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//converting physical file to java object 
		//(here copy path directly from desktop)
		//if path is taken from project file , then we need to refresh and open excel
		FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\Desktop\\DataDrivenWorkBook.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		
		//create cell row then only get that row
		Row r = sh.getRow(2);
		Cell c = r.createCell(4);
		c.setCellValue("Selenium");
		
		Row r1 = sh.createRow(5);
		Cell c1 = r1.createCell(0);
		c1.setCellValue("iphone");
		
		Row r2 = sh.getRow(5);
		Cell c2 = r2.createCell(1);
		c2.setCellValue("100000");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Hp\\Desktop\\DataDrivenWorkBook.xlsx");
		wb.write(fos);
		wb.close();
	}
	

}
