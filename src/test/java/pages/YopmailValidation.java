package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ext_Excl.Ext_1;
import utils.Common_Methods;
import utils.Excel_Util;
import utils.Extent_Reports;

public class YopmailValidation {

	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();


	public YopmailValidation(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}
	public static String parent;
	
	@FindBy(xpath="//input[@id='ReceiptEmail']")
	WebElement mail_Id;

	@FindBy(xpath="//input[@name='sendReceipt']")
	WebElement send_btn;

	@FindBy(xpath = "(//ion-item[.=' List '])[2]")
	WebElement List_application1;

	@FindBy(id = "applicationButton")
	WebElement	ApplicationModule1;

	@FindBy(xpath = "//input[@placeholder='Enter your inbox here']")
	WebElement email_field;

	@FindBy(id="refreshbut")
	WebElement submit;

	@FindBy(xpath="//span[.='<MarketingIntl@citizensinc.com>']")
	WebElement email_from;

	@FindBy(xpath="//a[@title='Receipt.pdf']")
	WebElement reciept;

	@FindBy(xpath="(//span[.='MarketingIntl@citizensinc.com'])")
	WebElement email_inbox;

	@FindBy(xpath="return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-item').shadowRoot.querySelector('div>div>div>a')")
	WebElement open_file;

	public void mail_validation() throws Exception{

		//		C.switchToNewWindow(driver, "https://yopmail.com/", e, Test.Case1010(140),  Test.Exp1010(140));

		 parent =driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://yopmail.com");
		Thread.sleep(2000);

		//C.W_S(driver, wait, email_field, "cicalife_001@yopmail.com", e, Test.Case10(138), Test.Exp10(138));
		email_field.sendKeys("cicalife_001@yopmail.com");
		submit.click();

		//C.W_C1(driver, wait, submit, e, Test.Case10(141), Test.Exp10(141));

		driver.switchTo().frame("ifmail");

		if (email_from.isDisplayed()) {
			reciept.click();
		} else {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("ifinbox");// ifmail
			email_inbox.click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("ifmail");
			//C.W_C1(driver, wait, reciept, e, Test.Case10(142), Test.Exp10(142));
			reciept.click();
		}
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("chrome://downloads/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement open_file = (WebElement) js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-item').shadowRoot.querySelector('div>div>div>a')");
		open_file.click();
		
		/*
		 * Set<String> windows= driver.getWindowHandles(); for (String window : windows)
		 * { if (window.equals(parent)) { driver.switchTo().window(parent);
		 * driver.switchTo().alert().accept();
		 * 
		 * } } Thread.sleep(1000); ApplicationModule1.click(); Thread.sleep(2000);
		 * List_application1.click(); Actions act = new Actions(driver); WebElement
		 * last= driver.findElement(By.
		 * xpath("(//td/ion-button[@title='Edit Application'])[last()]"));
		 * act.scrollToElement(last).build().perform();
		 */
		
	}


}



