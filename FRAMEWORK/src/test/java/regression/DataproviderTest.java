package regression;

import org.testng.annotations.Test;

import commoncode.commonNewTest;
import pages.fbhome;

import org.testng.annotations.DataProvider;

public class DataproviderTest extends commonNewTest {
  @Test(dataProvider = "dp")
  public void f(String enteremail, String enterpass) throws InterruptedException {
	  fbhome ob=new fbhome(driver);
	  ob.enteremail(enteremail);
	  ob.enterpass(enterpass);
	  ob.loginclick();
	  Thread.sleep(4000);
	  driver.navigate().back();
	  
  }
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "china@gmail.com", "aaaaa" },
      new Object[] { "abc@gmail.com" ,"bbbbb" },
    };
  }
}
