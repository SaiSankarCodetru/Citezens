package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
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

	@FindBy(xpath="//input[@id='ReceiptEmail']")
	WebElement mail_Id;

	@FindBy(xpath="//input[@name='sendReceipt']")
	WebElement send_btn;

	@FindBy(id="login")
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
		Thread.sleep(3000);
		C.Frames(driver, e, "Abc", "Xyz");
		C.W_S(driver, wait, mail_Id, "cicalife_001@yopmail.com", e, Test.Case(1), Test.Exp(1));

		C.W_C1(driver, wait, send_btn, e, Test.Case(3), Test.Exp(3));
		Thread.sleep(2000);
		C.switchToNewWindow(driver, wait, "https://yopmail.com/", e, "a", "b");

		Thread.sleep(3000);

		C.W_S(driver, wait, email_field, "cicalife_001@yopmail.com", e, Test.Case(1), Test.Exp(1));

		C.W_C1(driver, wait, submit, e, Test.Case(3), Test.Exp(3));

		driver.switchTo().frame("ifmail");

		if (email_from.isDisplayed()) {
			C.W_C1(driver, wait, reciept, e, Test.Case(3), Test.Exp(3));
			//driver.findElement(By.xpath("//a[@title='Receipt.pdf']")).click();
		} else {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("ifinbox");// ifmail
			C.W_C1(driver, wait, email_inbox, e, Test.Case(3), Test.Exp(3));
			driver.switchTo().defaultContent();
			driver.switchTo().frame("ifmail");
			C.W_C1(driver, wait, reciept, e, Test.Case(3), Test.Exp(3));
		}
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("chrome://downloads/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement open_file = (WebElement) js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-item').shadowRoot.querySelector('div>div>div>a')");
		open_file.click();
	}


}



