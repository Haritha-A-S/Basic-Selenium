package dataDriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
		
		//step 1 : convert the physical file into java object
		//use . so that other programmer can also use it and handle exception
		FileInputStream fis = new FileInputStream("./src/test/resources/Data.properties");
		
		//step 2 : create a properties object
		Properties p = new Properties();
		
		//step 3 : Load properties object
		p.load(fis);
		
		//step 4 : Fetch data from properties object
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME =p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		String TIMEOUTS = p.getProperty("timeouts");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(TIMEOUTS);
		
		
		
	}

}
