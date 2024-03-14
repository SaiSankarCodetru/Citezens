package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Ext_Excl.Ext_1;
import utils.Common_Methods;
import utils.Excel_Util;
import utils.Extent_Reports;

public class Step_7Page {
	public 	WebDriver driver;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	public Step_7Page(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}

	@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[6]")
	WebElement nextstep7;	

	@FindBy(xpath = "//h3[.='HIPAA Privacy Authorization']")
	WebElement Disclosure;

	public void Remarks() throws Exception {
		Actions act = new Actions(driver);

		C.page_Navigation(driver, act, nextstep7, Disclosure, e, Test.Case7(1), Test.Exp7(1));
		Thread.sleep(2000);
		
	}


}
