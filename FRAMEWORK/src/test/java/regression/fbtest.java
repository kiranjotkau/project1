package regression;

import org.testng.annotations.Test;

import commoncode.commonNewTest;
import pages.fbhome;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class fbtest extends commonNewTest{
  @Test
  public void f() throws IOException {
	  fbhome ob= new fbhome(driver);
	  ob.enteremail("china@gmail.com");
	  ob.enterpass("aaaaa");
	  ob.findfblinks();
	//shots();
  }
 

}
