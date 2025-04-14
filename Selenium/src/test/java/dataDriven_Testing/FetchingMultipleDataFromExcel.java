package dataDriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("./src/test/resources/DataDrivenWorkBook.xlsx");
		
		 Workbook wb = WorkbookFactory.create(fis);
		 
		Sheet sh = wb.getSheet("Sheet1");
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			for (int j=0;j<sh.getRow(i).getLastCellNum();j++)
			{
			String data = sh.getRow(i).getCell(j).toString();
			System.out.print(data +"	");
			}
			System.out.println("");
		}
		
wb.close();
	}

}
