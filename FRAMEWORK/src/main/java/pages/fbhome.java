package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbhome {
	public static WebDriver driver;
	@FindBy(id="email") WebElement emailfield;      // ( LOCATE THE ELEMENT)
	@FindBy( id="pass")WebElement passwordfield;
    @FindBy(xpath="//*[@name='login']") WebElement login;
    
	public fbhome(WebDriver driver) {
		fbhome.driver=driver;
		PageFactory.initElements(driver,this);
	
	}

	//public void enteremail() {
		public void enteremail(String emailtext) {             //  (WITH ARGUMENT METHOD)      ( Use string,variable)
		emailfield.sendKeys("china@gmail.com");                  //(FUNCTION CREATED AND SENDING KEYS)   ( with simple method)
		//emailfield.clear();
		//emailfield.sendKeys();
		
	}
	//public void enterpass() {
		//passwordfield.sendKeys("12345");
		
		public void enterpass(String passwordtext) {                        //WITH   ARGUMENT (STRING ,VARIABLE )
			passwordfield.sendKeys("aaaaa");
			}
		public void loginclick() {
			login.click();
			
		}
		public void findfblinks() {
		List<WebElement>listoflinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links="+listoflinks.size());
		
		
		
		}
}

