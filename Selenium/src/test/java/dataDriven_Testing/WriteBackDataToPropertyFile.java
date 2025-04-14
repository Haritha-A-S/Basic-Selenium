package dataDriven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//converting physical file to java object
		FileInputStream fis = new FileInputStream("./src/test/resources/FBDataLogin.properties");
		
		//create properties object
		Properties p = new Properties();
		
		//load properties object
		p.load(fis);
		
		//write data to property file
		p.put("animal","dog");
		
		//converting java object back to physical file
		//save property file
		FileOutputStream fos=new FileOutputStream("./src/test/resources/FBDataLogin.properties");
		p.store(fos, "Update Success");
		//disadvantage of data driven testing using property file method : 
		//it will not follow insertion order
	}

}
