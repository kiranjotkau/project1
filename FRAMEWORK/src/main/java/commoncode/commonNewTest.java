package commoncode;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;

public class commonNewTest  implements ITestListener{
 public static WebDriver driver;
 
 @Override
 public void onTestSuccess(ITestResult result) {
 this.driver=((commonNewTest)result.getInstance()).driver;
 try {
 	shots();
 }catch (IOException e) {
	 e.printStackTrace();
 }
 }
 
 @Override
 public void onTestFailure(ITestResult result) {
	 this.driver=((commonNewTest)result.getInstance()).driver; 
	 try {
		 	shots();
		 }catch (IOException e) {
			 e.printStackTrace();
		 }
		 }
 
 
 
 
  @BeforeTest(alwaysRun=true)
  @Parameters({"brow","url"})
	  public static void browsers(String brow,String url) throws InterruptedException {
			
			/*	if(brow.equalsIgnoreCase("Chrome")) {
				System.setProperty("webDriver.chrome.driver","C:\\Users\\17035\\eclipse-workspace\\FRAMEWORK\\drivers\\chromedriver.exe");
				driver= new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				Thread.sleep(5000);
			}*/ 
			 if (brow.equalsIgnoreCase("firefox")) {
				System.setProperty("Webdriver.gecko.driver","C:\\Users\\17035\\eclipse-workspace\\FRAMEWORK\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get(url);
				driver.manage().window().maximize();
				Thread.sleep(5000);
			}

			else {
				System.setProperty("webdriver.edge.driver","C:\\Users\\17035\\eclipse-workspace\\FRAMEWORK\\drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				Thread.sleep(5000);
			}
			
  }
  

  @AfterTest(alwaysRun=true)
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();  
  }
 

  public void shots() throws IOException {
	 Date dt=new Date() ;
	 String strttext=dt.toString().replace("","-").replace(":","-");
	 System.out.println(strttext);
	  File cap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(cap,new File("C:\\Users\\17035\\eclipse-workspace\\FRAMEWORK\\pictures\\"+strttext+".png"));
	  
	   }
}