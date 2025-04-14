package data_providers;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Using_dataProvidersAnnotation {
@DataProvider
public Object[][] data(){
Object[][] obj = new Object[2][2];
obj[0][0] ="sel";
obj[0][1]="123";

obj[1][0]="manual";
obj[1][1]="abc";
return obj;

}

@Test(dataProvider = "data")
public void login(String un,String pswd) {
	System.out.println(un+pswd);
}
}
