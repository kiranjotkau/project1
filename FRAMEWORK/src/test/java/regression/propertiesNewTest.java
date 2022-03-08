package regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import commoncode.commonNewTest;
import pages.fbhome;

public class propertiesNewTest extends commonNewTest {
	
	
	
  @Test(groups= {"Functional"})
  public void f() throws IOException  {
	Properties prop= new Properties();
	FileInputStream ob= new  FileInputStream("C:\\Users\\17035\\eclipse-workspace\\FRAMEWORK\\parametersdata.properties");
	 prop.load(ob) ;
	
	 String emailid = prop.getProperty("Emailfield");
	 String passtxt=prop.getProperty("Passwordfield");
	 
	 System.out.println(emailid);
	 System.out.println(passtxt);
	 
	fbhome fbhomeob=  new fbhome(driver);
	 fbhomeob.enteremail(emailid);
	 fbhomeob.enterpass(passtxt);
	 
	 
	 
	 
  }
}
