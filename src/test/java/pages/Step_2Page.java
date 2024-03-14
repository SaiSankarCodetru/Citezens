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

public class Step_2Page {

	public WebDriverWait wait;
	public 	WebDriver driver;
	public	Extent_Reports e = new Extent_Reports(driver);
	public	Excel_Util data = new Excel_Util();	
	Common_Methods C = new Common_Methods();
	Ext_1 Test = new Ext_1();

	public Step_2Page(WebDriver driver, Extent_Reports e) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.e = e;
	}

	@FindBy(xpath = "//span[text()='Step 2: Proposed Insured Information']")
	WebElement step_2;

	@FindBy(xpath = "(//ion-col/ion-button[starts-with(@class, 'md button')])[2]")
	WebElement NextStep2;

	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedSSN']/input")
	WebElement SSN_Number;

	@FindBy(xpath = "//ion-col[@class = 'md hydrated' and @size-md = '14']")
	WebElement ErrorSSN_NumberMessage;

	@FindBy(xpath="//ion-input[@formcontrolname='ProposedEmailAddress']/input")
	WebElement EmailAddress;

	@FindBy(xpath="(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[1]")
	WebElement Error_EmailAddressMessage;

	@FindBy(xpath="(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[1]")
	WebElement Error_EmailCorrectFormatMessage;

	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedMobilePhone']/input")
	WebElement phoneNumber;

	@FindBy(xpath = "(//h3[text() = 'Contact Information']/following-sibling::ion-row//ion-col[@size-md = '8'])[2]")
	WebElement Error_PhoneNumberMessage;

	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalAddress1']/input")
	WebElement Address_1_Message;

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24'])[1]")
	WebElement Error_Address_1_Message;

	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalAddress2']/input")
	WebElement Address_2_Message;

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '24'])[2]")
	WebElement Error_Address_2_Message;

	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalZipCode']/input")
	WebElement ZipCode;

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '7'])[1]")
	WebElement Error_ZipCode_Message;

	@FindBy(xpath = "//ion-input[@formcontrolname='ProposedPhysicalZipCode']/following-sibling::ion-button")
	WebElement Proposed_ZipCode;

	@FindBy(xpath = "//select[@formcontrolname='ProposedPhysicalCity']")
	WebElement city;

	@FindBy(xpath = "//option[.='Dodge City ']")
	WebElement CitySelection;

	@FindBy(xpath = "(//ion-col[@class = 'md hydrated' and @size-md = '10'])[1]")
	WebElement Error_City_Message;

	@FindBy(xpath = "(//ion-row/ion-col/ion-button[starts-with(@class, 'md button')])[8]")
	WebElement NextStep3;

	public void Proposed_Insured_Information() throws Exception {

		Actions act = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		String Email_Max = "destinysdfghdfghdfsgdsfgsdfgdfghdfghdsfghjdsfghdfghdfghfgh";
		String Add_Max = "280 SIERRA DR. APT. B407 1142 SW ARLINGTON BLVD 1142 SW ARLINGTON BLVD";
		String Max_error ="The maximum number of characters is 33.";
		String Max_error_ ="The maximum number of characters is 50";
		String Min_error_Pn ="The minimum number of characters is 10.";
		String Max_error_Pn ="The maximum number of characters is 10.";
		String Min_error_Zp ="The minimum number of characters is 5.";
		String Max_error_Zp ="The maximum number of characters is 5.";
		String Mandatory_Error = "Please enter a value.";
		String Ssn_error = "SSN should have exactly 9 digits.";
		String Ssn_error1 = "The last 4 digits of SSN should be from 0001 to 9999";
		
		C.Click_Displayed(driver, step_2, SSN_Number, e, Test.Case2(1),Test.Exp2(1));

		C.Scroll_C_scroll2(driver, act, NextStep2, SSN_Number, e, Test.Case2(35), Test.Exp2(35));

		C.Empty_Input(driver, ErrorSSN_NumberMessage, Ssn_error, e, Test.Case2(8), Test.Exp2(8));

		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "abcdefghijklmnopqrstuvwxyz", "Must be a number", e,
		Test.Case2(4), Test.Exp2(4));

		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451", Ssn_error, e,Test.Case2(6), Test.Exp2(6));
		
		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "25478451123", Ssn_error, e,Test.Case2(7), Test.Exp2(7));

		C.Max_Char(driver, SSN_Number, ErrorSSN_NumberMessage, "1234asasa", Ssn_error1, e,Test.Case2(5), Test.Exp2(5));

		C.Send_verify_Valid_C(driver, SSN_Number, e, "254798741", Test.Case2(3), Test.Exp2(3));

		C.act_scroll1(driver, act, ZipCode, e, Test.Case2(27), Test.Exp2(27));

		C.Empty_Input(driver, Error_EmailAddressMessage, Mandatory_Error, e, Test.Case2(12), Test.Exp2(12));

		C.Max_Char(driver, EmailAddress, Error_EmailCorrectFormatMessage, "destiny", "Email is not in the correct format",
		e, Test.Case2(10), Test.Exp2(10));

		C.Max_Char(driver, EmailAddress, Error_EmailCorrectFormatMessage, Email_Max,Max_error_,e, Test.Case2(11),Test.Exp2(11));

		C.Send_verify_Valid_C(driver, EmailAddress, e, "destiny@none.com", Test.Case2(9), Test.Exp2(9));

		C.Empty_Input(driver, Error_PhoneNumberMessage, Mandatory_Error, e, Test.Case2(17), Test.Exp2(17));

		C.Max_Char(driver, phoneNumber, Error_PhoneNumberMessage, "abc", "Please use a number format.", e, Test.Case2(14),Test.Exp2(14));
		
		C.Max_Char(driver, phoneNumber, Error_PhoneNumberMessage, "78945612", Min_error_Pn,e, Test.Case2(15),Test.Exp2(15));

		C.Max_Char(driver, phoneNumber, Error_PhoneNumberMessage, "12548152251",Max_error_Pn ,e, Test.Case2(16),Test.Exp2(16));

		C.Send_verify_Valid_C(driver, phoneNumber, e, "1254815225", Test.Case2(13),Test.Exp2(13));

		C.Empty_Input(driver, Error_Address_1_Message, Mandatory_Error, e, Test.Case2(19),Test.Exp2(19));

		C.Max_Char(driver, Address_1_Message, Error_Address_1_Message, Add_Max,Max_error,e, Test.Case2(20),Test.Exp2(20));

		C.Send_verify_Valid_C(driver, Address_1_Message, e, "7412 PINNACLE POINT", Test.Case2(18),Test.Exp2(18));

		C.Max_Char(driver, Address_2_Message, Error_Address_2_Message, Add_Max,Max_error,e, Test.Case2(22),Test.Exp2(22));

		C.Send_verify_Valid_C(driver, Address_2_Message, e, "668 WOODSIDE DR", Test.Case2(21),Test.Exp2(21));

		C.Empty_Input(driver, Error_ZipCode_Message, Mandatory_Error, e, Test.Case2(28),Test.Exp2(28));

		C.Max_Char(driver, ZipCode, Error_ZipCode_Message,"1234",Min_error_Zp,e, Test.Case2(24),Test.Exp2(24));

		C.Max_Char(driver, ZipCode, Error_ZipCode_Message,"123456",Max_error_Zp,e, Test.Case2(25),Test.Exp2(25));

		C.Send_verify_Valid_C(driver, ZipCode, e, "67801", Test.Case2(23),Test.Exp2(23));

		C.Mandate_Click1(driver, act, Proposed_ZipCode, e, Test.Case2(26),Test.Exp2(26));

		C.Scroll_Click(driver, wait, act, NextStep2, e, Test.Case2(37),Test.Exp2(37));

		C.Empty_Input(driver, Error_City_Message, Mandatory_Error, e, Test.Case2(31),Test.Exp2(31));
		Thread.sleep(1000);
		C.W_C2(driver, wait, city, CitySelection, e, Test.Case2(30),Test.Exp2(30));

		C.Mandate_Click(driver, NextStep2, e, Test.Case2(36),Test.Exp2(36));
		
		C.Fields(driver, ZipCode, e,Test.Case2(2),Test.Exp2(2));
		
		C.Fields(driver, ZipCode, e,Test.Case2(29),Test.Exp2(29));
		
		C.Fields(driver, ZipCode, e,Test.Case2(32),Test.Exp2(32));
		
		C.Fields(driver, ZipCode, e,Test.Case2(33),Test.Exp2(33));
		
		C.Fields(driver, ZipCode, e,Test.Case2(34),Test.Exp2(34));
		
		C.Fields(driver, ZipCode, e,Test.Case2(38),Test.Exp2(38));
		
//70
	}

}
