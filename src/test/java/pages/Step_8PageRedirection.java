package pages;

import java.time.Duration;

import org.openqa.selenium.By;
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

public class Step_8PageRedirection {

	public 	WebDriver driver;
	public WebDriverWait wait;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

		public Step_8PageRedirection(WebDriver driver, Extent_Reports e) {
			PageFactory.initElements(driver, this);
			this.driver = driver;
			this.e = e;
		}
	
		@FindBy(xpath = "(//ion-row[@style='padding-left: 50px;']/ion-col[@class='md hydrated']/ion-button)[8]")
		WebElement NextStep8;
	
		@FindBy(xpath = "//ion-input[@formcontrolname='SignedCity']/input")
		WebElement signedCity;
		
		@FindBy(xpath = "//ion-input[@formcontrolname='DateSigned']/input")
		WebElement Date_Signed;
	
		@FindBy(xpath = "//ion-radio-group[@formcontrolname='HoldDateCheckBox']/ion-row/ion-col[2]/ion-item")
		WebElement HoldDateRadioButton_No;
	
		@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[2]")
		WebElement Error_SignedCity;
	
		@FindBy(xpath = "(//h3[text()='Signature']/following-sibling::ion-row[2]/ion-col[@size='24' and @size-md='6'])[1]")
		WebElement Error_SignatureProposedInsurer;
	
		@FindBy(xpath = "//h3[.='Signature']/following-sibling::ion-row[2]/ion-col/div/ion-button")
		WebElement ProposedInsurerSignature;
	
		@FindBy(xpath = "(//canvas[@class='signature-pad-canvas hidden-xs-down'])[1]")
		WebElement signature_pad1;
	
		@FindBy(xpath = "(//ion-col[@style='padding-right: 20px;']/ion-button)[1]")
		WebElement Padding_Right1;
	
		@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '12' and @size='24'])[6]")
		WebElement Error_HoldUntillDate;
	
		@FindBy(xpath = "//h3[text()='Agent']/following-sibling::ion-row/ion-col[4][@size='24']")
		WebElement Error_SignatureOfAgent;
	
		@FindBy(xpath = "//div/h3[.='Agent']/following-sibling::ion-row/ion-col[4]/div/ion-button")
		WebElement SignatureOfAgent;
	
		@FindBy(xpath = "//canvas[@class='signature-pad-canvas hidden-xs-down']")
		WebElement signature_pad2;
	
		@FindBy(xpath = "(//ion-col[@style='padding-right: 20px;']/ion-button)[1]")
		WebElement Padding_Right2;
	
		@FindBy(xpath = "(//img[@width='150'])[1]")
		WebElement Sign1;
	
		@FindBy(xpath = "(//img[@width='150'])[2]")
		WebElement Sign2;
	
		@FindBy(id="applicationButton")
		WebElement application_btn;
	
		//img[@width='150']
	
		public void Disclosure_and_Signature() throws Exception {
	
			String Max_Name = "sdfsadfgdfsfghfghxfghjdsfghdfghdfghjdfsghdsfghretyu";
			String Max_error_ ="The maximum number of characters is 50";
			String Mandatory_Err = "Please enter a value.";
	
			Actions act = new Actions(driver);
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
			C.Mandate_Click2(driver, act, NextStep8,Error_SignedCity, e, Test.Case8(1), Test.Exp8(1));
	
			C.Empty_Input(driver, Error_SignedCity, Mandatory_Err, e, Test.Case8(4), Test.Exp8(4));
	
			Thread.sleep(1000);
	
			C.Max_Char_Act(driver, act, signedCity, Error_SignedCity, Max_Name,Max_error_, e, Test.Case8(3), Test.Exp8(3));
	
			C.Send_verify_Valid_C(driver, signedCity, e, "Testing Codetru", Test.Case8(2), Test.Exp8(2));
			
			C.Fields(driver, signedCity, e,  Test.Case8(4), Test.Exp8(4));
			
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(6), Test.Exp8(6));
			
			C.Fields(driver, Date_Signed, e,  Test.Case8(7), Test.Exp8(7));
	
			C.act_scroll2(driver, act, Error_SignatureProposedInsurer, HoldDateRadioButton_No, e, Test.Case8(38), Test.Exp8(38));
	
			C.Empty_Input(driver, Error_SignatureProposedInsurer, Mandatory_Err, e, Test.Case8(39), Test.Exp8(39));
			
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(11), Test.Exp8(11));
	
			C.Signature(driver, act, ProposedInsurerSignature, signature_pad1, Padding_Right1, Sign1,
					25, 25, 35, 30, 16, 26, -76, -26, 18, 56, -52, -36, -21,-25, 36, 26, -54, 56, e, 
					Test.Case8(12), Test.Exp8(12));
			
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(13), Test.Exp8(13));
			
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(14), Test.Exp8(14));
	
			C.act_scroll1(driver, act, Error_HoldUntillDate, e, Test.Case8(40), Test.Exp8(40));
	
			C.Empty_Input(driver, Error_HoldUntillDate, "Hold Date required or click No for delayed payment",e, Test.Case8(17), Test.Exp8(17));
			
			C.Fields(driver, HoldDateRadioButton_No, e,  Test.Case8(19), Test.Exp8(19));
	
			C.Click_Scroll(driver, act, HoldDateRadioButton_No, NextStep8, e,  Test.Case8(41), Test.Exp8(41));
	
			C.Empty_Input(driver, Error_SignatureOfAgent, Mandatory_Err,e, Test.Case8(41), Test.Exp8(41));
			Thread.sleep(1000);
			C.Fields(driver, HoldDateRadioButton_No, e,  Test.Case8(20), Test.Exp8(20));
			
			C.Fields(driver, HoldDateRadioButton_No, e,  Test.Case8(21), Test.Exp8(21));
			
			C.Fields(driver, HoldDateRadioButton_No, e,  Test.Case8(22), Test.Exp8(22));
	
			C.Signature(driver, act, SignatureOfAgent, signature_pad2, Padding_Right2, Sign2,
					25, 25, 35, 30, 16, 26, -76, -26, 18, 56, -52, -36, -21,-25, 36, 26, 112, 56, e,
					Test.Case8(27), Test.Exp8(27));
			
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(28), Test.Exp8(28));
			
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(35), Test.Exp8(35));
	
			Thread.sleep(2000);
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(39), Test.Exp8(39));
			C.Click_Displayed(driver, NextStep8, application_btn, e, Test.Case8(36), Test.Exp8(36));
			Thread.sleep(4000);
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(5), Test.Exp8(5));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(8), Test.Exp8(8));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(9), Test.Exp8(9));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(10), Test.Exp8(10));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(15), Test.Exp8(15));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(16), Test.Exp8(16));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(18), Test.Exp8(18));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(23), Test.Exp8(23));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(24), Test.Exp8(24));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(25), Test.Exp8(25));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(26), Test.Exp8(26));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(29), Test.Exp8(29));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(30), Test.Exp8(30));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(31), Test.Exp8(31));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(32), Test.Exp8(32));
			C.Fields(driver, ProposedInsurerSignature, e,  Test.Case8(5), Test.Exp8(5));
		}
}
