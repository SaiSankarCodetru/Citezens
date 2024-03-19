package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import Ext_Excl.Ext_1;
import utils.Common_Methods;
import utils.Excel_Util;
import utils.Extent_Reports;

public class LoginPage {
	
	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	public Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();	

	public LoginPage(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//ion-button[@type='submit']")
	WebElement submit_btn;	
	
	@FindBy(id="applicationButton")
	WebElement application_btn;
	
	public void Login_into_Application() throws Exception {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		C.W_S(driver, wait, username, "7250165", e, Test.Case(1), Test.Exp(1));
		
		C.W_S(driver, wait, password, "RockStar_K8", e, Test.Case(2), Test.Exp(2));
		
		C.W_C1(driver, wait, submit_btn, e, Test.Case(3), Test.Exp(3));
		
		C.Fields(driver, application_btn, e, Test.Case(4), Test.Exp(4));
		
	}	
	
}
