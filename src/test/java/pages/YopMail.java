package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Ext_Excl.Ext_1;
import utils.Common_Methods;
import utils.Excel_Util;
import utils.Extent_Reports;

public class YopMail {
	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	public YopMail(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}
	public void validate_mail() throws Exception {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://yopmail.com/");
		driver.findElement(By.id("login")).sendKeys("cicalife_001@yopmail.com");
		driver.findElement(By.id("refreshbut")).click();
		driver.switchTo().frame("ifmail");
		WebElement email_from = driver.findElement(By.xpath("//span[.='<MarketingIntl@citizensinc.com>']"));

		if (email_from.isDisplayed()) {
			driver.findElement(By.xpath("//a[@title='Receipt.pdf']")).click();
		} else {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("ifinbox");// ifmail
			driver.findElement(By.xpath("(//span[.='MarketingIntl@citizensinc.com'])")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("ifmail");
			driver.findElement(By.xpath("//a[@title='Receipt.pdf']")).click();
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
