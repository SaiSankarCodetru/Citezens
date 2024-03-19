package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;



import Ext_Excl.Ext_1;
import utils.Common_Methods;
import utils.Excel_Util;
import utils.Extent_Reports;

public class Step_3Page {
	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	public Step_3Page(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}
	@FindBy(xpath="//ion-item/ion-label[.='No']/following-sibling::ion-radio[@value='false']")
	WebElement noRadioBtn;

	@FindBy(xpath = "(//ion-button[.='Next Step'])[3]")
	WebElement NextStep3;

	@FindBy(xpath = "//ion-label[.='Yes']/following-sibling::ion-radio")
	WebElement step3_Yes;

	@FindBy(xpath = "//ion-label[.='No']/following-sibling::ion-radio")
	WebElement step3_No;

	//	@FindBy(xpath = "//ion-item/ion-label[.='No']")
	//	WebElement step3_No;



	@FindBy(xpath = "(//ion-item/ion-label[.='No']/following-sibling::ion-radio[@role='radio'])[2]")
	WebElement step3_No2;

	@FindBy(xpath = "//form[@class='ng-untouched ng-pristine ng-invalid']//div[@class='block-info-app']")
	WebElement Error_ProposedOWner_Message;

	@FindBy(xpath = "//ion-input[@formcontrolname='BeneficiaryFirstName']/input")
	WebElement BenificiaryFirstname;

	public void Policy_Owner_Information() throws Exception {
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		String Mandatory_Error = "Please enter a value.";

		C.W_C1(driver, wait, NextStep3, e, Test.Case3(9), Test.Exp3(9));

		C.Empty_Input(driver, Error_ProposedOWner_Message, Mandatory_Error, e, Test.Case3(8), Test.Exp3(8));

		//	C.Fields(driver, step3_Yes, e, Test.Case3(10), Test.Exp3(10));
		C.W_C1(driver, wait, step3_Yes, e, Test.Case3(1), Test.Exp3(1));
		C.W_C1(driver, wait, step3_No, e, Test.Case3(1), Test.Exp3(1));
		//C.C2(driver, step3_Yes, step3_No, e, Test.Case3(1), Test.Exp3(1));
		Thread.sleep(1000);
		//		step3_No2.click();
		//		Thread.sleep(2000);
		//		Actions act = new Actions(driver);
		//		act.scrollToElement(NextStep3).build().perform();
		//		C.Mandate_Click(driver, NextStep3, e, Test.Case3(5), Test.Exp3(5));
		NextStep3.click();

		//		if(step3_No2.isDisplayed()) {
		//			step3_No2.click();
		//			Thread.sleep(2000);
		//			Actions act = new Actions(driver);
		//			act.scrollToElement(NextStep3).build().perform();
		//			NextStep3.click();
		//		}else {
		//			//		C.Mandate_Click(driver, NextStep3, e, Test.Case3(5), Test.Exp3(5));
		//			NextStep3.click();
		//			Thread.sleep(2000);
		//		}
	}
}
